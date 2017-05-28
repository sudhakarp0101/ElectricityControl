package com.example.sudhakar.electricitycontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AffActivity extends AppCompatActivity {
    private Button btn201,btn202,btn203,btn204,btn205,btn206,affbkbtn;
    private TextView afftv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aff);
        afftv = (TextView) findViewById(R.id.aff_id);
        btn201 = (Button)findViewById(R.id.id_201);
        btn202 = (Button)findViewById(R.id.id_202);
        btn203 = (Button)findViewById(R.id.id_203);
        btn204 = (Button)findViewById(R.id.id_204);
        btn205 = (Button)findViewById(R.id.id_205);
        btn206 = (Button)findViewById(R.id.id_206);

        Intent bfintent=getIntent();
        final String block = bfintent.getStringExtra("block");
        afftv.setText(block+" Block");
        final int floor = bfintent.getIntExtra("floor",0);
        int floor1 = (floor+1)*100;
        btn201.setText(Integer.toString(floor1+1));
        btn202.setText(Integer.toString(floor1+2));
        btn203.setText(Integer.toString(floor1+3));
        btn204.setText(Integer.toString(floor1+4));
        btn205.setText(Integer.toString(floor1+5));
        btn206.setText(Integer.toString(floor1+6));

        btn201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rfbintent=new Intent(getApplicationContext(), R201Activity.class);
                rfbintent.putExtra("block", block);
                rfbintent.putExtra("floor",floor);
                rfbintent.putExtra("room",btn201.getText().toString());
                startActivity(rfbintent);
                finish();
            }
        });
        btn202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rfbintent=new Intent(getApplicationContext(), R201Activity.class);
                rfbintent.putExtra("block", block);
                rfbintent.putExtra("floor",floor);
                rfbintent.putExtra("room",btn202.getText().toString());
                startActivity(rfbintent);
                finish();
            }
        });
        btn203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rfbintent=new Intent(getApplicationContext(), R201Activity.class);
                rfbintent.putExtra("block", block);
                rfbintent.putExtra("floor",floor);
                rfbintent.putExtra("room",btn203.getText().toString());
                startActivity(rfbintent);
                finish();
            }
        });
        btn204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rfbintent=new Intent(getApplicationContext(), R201Activity.class);
                rfbintent.putExtra("block", block);
                rfbintent.putExtra("floor",floor);
                rfbintent.putExtra("room",btn204.getText().toString());
                startActivity(rfbintent);
                finish();
            }
        });
        btn205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rfbintent=new Intent(getApplicationContext(), R201Activity.class);
                rfbintent.putExtra("block", block);
                rfbintent.putExtra("floor",floor);
                rfbintent.putExtra("room",btn205.getText().toString());
                startActivity(rfbintent);
                finish();
            }
        });
        btn206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rfbintent=new Intent(getApplicationContext(), R201Activity.class);
                rfbintent.putExtra("block", block);
                rfbintent.putExtra("floor",floor);
                rfbintent.putExtra("room",btn206.getText().toString());
                startActivity(rfbintent);
                finish();
            }
        });
        affbkbtn = (Button)findViewById(R.id.affback_id);
        affbkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AblockActivity.class).putExtra("block",block));
                finish();
            }
        });
    }
}
