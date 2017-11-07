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
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        if (item == "Greater Noida") {
            code = new String("INXX0338");
        }
        else if (item == "Patna") {
            code = new String("INXX0100");
        }
        else if (item == "Delhi") {
            code = new String("INXX0038");
        }
        else if (item == "Kanpur") {
            code = new String("INXX0067");
        }
        else if (item == "Bhubaneshwar") {
            code = new String("INXX0024");
        }
        else if (item == "Mumbai") {
            code = new String("INXX0087");
        }
        else if(item == "Kolkata") {
            code = new String("INXX0300");
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }





    public void onNext(View v)
    {
        if(v.getId() == R.id.button)
        {
            Intent i  = new Intent(Location.this,Display.class);
           i.putExtra("location",code);
            startActivity(i);
        }
    }
}
}
