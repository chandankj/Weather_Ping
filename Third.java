package com.example.wp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends Activity {
    String api; // api is variable to store city code
    String xmlPath;  // this is variable of link
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        // Displaying city code in text box for testing
        // From here
        Intent intent = getIntent();
        api = intent.getStringExtra("location");
        TextView textView = (TextView) findViewById(R.id.test);
        textView.setText(api);
        // to here

        xmlPath = new String("http://wxdata.weather.com/wxdata/weather/local/" + api + "?cc=*&unit=#Type%23&dayf=6");

        // xmlPath contains link with modified link everytime
    }

    // paste parsing codes from here
}
