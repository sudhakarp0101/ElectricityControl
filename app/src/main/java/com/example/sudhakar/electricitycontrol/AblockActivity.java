package com.example.sudhakar.electricitycontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AblockActivity extends AppCompatActivity {
    private Button affbtn,asfbtn,atfbtn,agfbtn,bbtn;
    private TextView btv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ablock);
        affbtn = (Button)findViewById(R.id.afirst_id);
        asfbtn = (Button)findViewById(R.id.asecond_id);
        atfbtn = (Button)findViewById(R.id.athird_id);
        agfbtn = (Button)findViewById(R.id.aground_id);
        btv = (TextView) findViewById(R.id.blockname_id);
        Intent bintent=getIntent();
        final String block=bintent.getStringExtra("block");
        btv.setText(block+" Block ");
        agfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fintent=new Intent(getApplicationContext(),AffActivity.class);
                fintent.putExtra("block",block);
                fintent.putExtra("floor",0);
                startActivity(fintent);
                finish();
            }
        });
        affbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fintent=new Intent(getApplicationContext(),AffActivity.class);
                fintent.putExtra("block",block);
                fintent.putExtra("floor",1);
                startActivity(fintent);
                finish();
            }
        });
        asfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fintent=new Intent(getApplicationContext(),AffActivity.class);
                fintent.putExtra("block",block);
                fintent.putExtra("floor",2);
                startActivity(fintent);
                finish();
            }
        });
        atfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fintent=new Intent(getApplicationContext(),AffActivity.class);
                fintent.putExtra("block",block);
                fintent.putExtra("floor",3);
                startActivity(fintent);
                finish();
            }
        });

        bbtn = (Button)findViewById(R.id.back_id);
        bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });
    }
}
