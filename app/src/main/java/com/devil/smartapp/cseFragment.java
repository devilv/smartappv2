package com.devil.smartapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by varun on 4/23/2017.
 */

public class cseFragment extends Activity {
    ImageButton first,second,third,fourth;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse);
        first=(ImageButton)findViewById(R.id.imageButton);
        second=(ImageButton)findViewById(R.id.imageButton5);
        third=(ImageButton)findViewById(R.id.imageButton6);
        fourth=(ImageButton)findViewById(R.id.imageButton7);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cseFragment.this,CseFirst.class);
                startActivity(i);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cseFragment.this,CseSecond.class);
                startActivity(i);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cseFragment.this,CseThird.class);
                startActivity(i);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cseFragment.this,CseFourth.class);
                startActivity(i);
            }
        });
    }
}