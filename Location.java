package com.example.wp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Location extends Activity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        spinner = (Spinner) findViewById(R.id.spinnerLocation);
        String [] area={"Greater_Noida","Delhi","Bihar","UP","NCR","Mumbai","kolkata","Chennai"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,area);
        spinner.setAdapter(adapter);

    }
}
