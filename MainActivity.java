package com.example.wp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onStart(View v)
    {
        if(v.getId() == R.id.start)
        {
           Intent i  = new Intent(MainActivity.this, Location.class);
            startActivity(i);
        }
    }
}
