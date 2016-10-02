package com.sartainstudios.akhileshkumaryadavhelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateTextView = (TextView) findViewById(R.id.date);

        dateTextView.setText(getDate() + "\n" + determineEvent(getDate()));
    }

    private String getDate() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        return date;
    }

    private String determineEvent(String date) {
        String eventInfo;
        switch (date) {
            case "2016-10-01":
                eventInfo = "Awesome day";
                break;
            case "2016-10-02":
                eventInfo = "day two of working on this app :)";
                break;
            case "2016-10-03":
                eventInfo = "should be running by now";
                break;
            default:
                eventInfo = "app failed to deliver promises, contemplate sadness";
        }
        return eventInfo;
    }
}
