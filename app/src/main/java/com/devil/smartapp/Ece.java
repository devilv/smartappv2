package com.devil.smartapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by varun on 4/23/2017.
 */

public class Ece extends Activity {
    ImageButton first, second, third, fourth;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece);
        first=(ImageButton)findViewById(R.id.imageButton);
        second=(ImageButton)findViewById(R.id.imageButton5);
        third=(ImageButton)findViewById(R.id.imageButton6);
        fourth=(ImageButton)findViewById(R.id.imageButton7);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Ece.this,EceFirst.class);
                startActivity(i);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Ece.this,EceSecond.class);
                startActivity(i);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Ece.this,EceThird.class);
                startActivity(i);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Ece.this,EceFourth.class);
                startActivity(i);
            }
        });
    }
}
