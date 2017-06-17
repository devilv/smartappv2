package com.devil.smartapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by varun on 4/23/2017.
 */

public class Bba extends Activity {
    ImageButton first, second,third;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bba);
        first=(ImageButton)findViewById(R.id.imageButton);
        second=(ImageButton)findViewById(R.id.imageButton5);
        third=(ImageButton)findViewById(R.id.imageButton7);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Bba.this,BbaFirst.class);
                startActivity(i);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Bba.this,BbaSecond.class);
                startActivity(i);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Bba.this,BbaThird.class);
                startActivity(i);
            }
        });
    }
}
