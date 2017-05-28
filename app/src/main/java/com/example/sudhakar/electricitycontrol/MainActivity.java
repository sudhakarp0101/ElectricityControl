package com.example.sudhakar.electricitycontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    ImageButton aib,bib,cib,dib,centralib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aib=(ImageButton)findViewById(R.id.blocka_id);
        bib=(ImageButton)findViewById(R.id.blockb_id);
        cib=(ImageButton)findViewById(R.id.blockc_id);
        dib=(ImageButton)findViewById(R.id.blockd_id);
        centralib=(ImageButton)findViewById(R.id.blockcentral_id);
        aib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AblockActivity.class);
                intent.putExtra("block","A");
                startActivity(intent);
                finish();
            }
        });
        aib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AblockActivity.class);
                intent.putExtra("block","A");
                startActivity(intent);
                finish();
            }
        });
        bib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AblockActivity.class);
                intent.putExtra("block","B");
                startActivity(intent);
                finish();
            }
        });
        cib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AblockActivity.class);
                intent.putExtra("block","C");
                startActivity(intent);
                finish();
            }
        });
        dib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AblockActivity.class);
                intent.putExtra("block","D");
                startActivity(intent);
                finish();
            }
        });
        centralib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AblockActivity.class);
                intent.putExtra("block","Central");
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            logout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
