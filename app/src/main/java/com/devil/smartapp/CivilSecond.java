package com.devil.smartapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by varun on 4/23/2017.
 */

public class CivilSecond
        extends Activity {
    ImageButton notes,assignment,datesheet,notice,result,attendance;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civilsecond);
        notes=(ImageButton)findViewById(R.id.imageButton8);
        assignment=(ImageButton)findViewById(R.id.imageButton9);
        datesheet=(ImageButton)findViewById(R.id.imageButton17);
        notice=(ImageButton)findViewById(R.id.imageButton16);
        result=(ImageButton)findViewById(R.id.imageButton18);
        attendance=(ImageButton)findViewById(R.id.imageButton19);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        datesheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}

