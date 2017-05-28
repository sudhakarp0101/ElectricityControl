package com.example.sudhakar.electricitycontrol;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class R201Activity extends AppCompatActivity {
    private static final String TAG = R201Activity.class.getSimpleName();
    private String sid;
    private TextView rbtv;
    private Button rbkbtn;
    private DatabaseReference powerdb;
    private List<ToggleButton> buttons;
    private static final int[] BUTTON_IDS = {
            R.id.allfans_id,
            R.id.allfls_id,
            R.id.alllights_id,
            R.id.fan1_id,
            R.id.fan2_id,
            R.id.fan3_id,
            R.id.fan4_id,
            R.id.fan5_id,
            R.id.fan6_id,
            R.id.fan7_id,
            R.id.light1_id,
            R.id.light2_id,
            R.id.light3_id,
            R.id.light4_id,
            R.id.light5_id,
            R.id.light6_id
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r201);
        rbtv = (TextView)findViewById(R.id.room_id);
        powerdb = FirebaseDatabase.getInstance().getReference("rooms");

        Intent bfrintent = getIntent();
        final String block = bfrintent.getStringExtra("block");
        final int floor = bfrintent.getIntExtra("floor",0);
        final String room = bfrintent.getStringExtra("room");
        rbtv.setText(block+" "+room);
        rbkbtn = (Button)findViewById(R.id.roomback_id);
        rbkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rintent=new Intent(getApplicationContext(),AffActivity.class);
                rintent.putExtra("block",block);
                rintent.putExtra("floor",floor);
                startActivity(rintent);
                finish();
            }
        });

        buttons = new ArrayList<ToggleButton>();
        // or slightly better
        // buttons = new ArrayList<Button>(BUTTON_IDS.length);
        for(final int id : BUTTON_IDS) {
            final ToggleButton button = (ToggleButton)findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sid = room+Integer.toString(floor)+block;
                    /*Room r=new Room();
                    r.setId(sid);
                    r.setRoomNo(room);
                    r.setFloorNo(Integer.toString(floor));
                    r.setBlockName(block);
                    powerdb.child(sid).setValue(r);*/
                    String lrf = button.getText().toString().split("\\s")[0].toLowerCase();
                    powerdb.child(sid).child(lrf).setValue(button.isChecked());
                    Toast.makeText(getApplicationContext(),button.getText(),Toast.LENGTH_SHORT).show();
                }
            }); // maybe
          //  buttons.add(button);
        }

        powerdb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                  sid = room+Integer.toString(floor)+block;
                  Room rm = dataSnapshot.child(sid).getValue(Room.class);
               //     String rid = dataSnapshot.child(sid).child("id").getValue().toString();

                   int i=0;
                    boolean btnstat[]={rm.isAllfans(),rm.isAllfanslights(),rm.isAlllights(),
                    rm.isFan1(),rm.isFan2(),rm.isFan3(),rm.isFan4(),rm.isFan5(),rm.isFan6(),
                    rm.isFan7(), rm.isLight1(),rm.isLight2(),rm.isLight3(),
                    rm.isLight4(), rm.isLight5(), rm.isLight6()};
                   // boolean btnstat[]={true,true,false,false,true,true,false,false,true,true,false,false,true,true,false,false};
                    for(final int id : BUTTON_IDS) {
                        final ToggleButton button = (ToggleButton) findViewById(id);
                        if(btnstat[i])
                            button.setTextColor(Color.RED);
                        else
                            button.setTextColor(Color.BLACK);
                        button.setChecked(btnstat[i++]);
                    }
                //Toast.makeText(getApplicationContext(),"UR in "+rm.getId(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                    Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }
}
