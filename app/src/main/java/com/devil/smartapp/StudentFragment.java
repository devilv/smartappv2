package com.devil.smartapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by varun on 4/22/2017.
 */

public class StudentFragment extends Fragment {
    ImageButton cse,ece,mech,civil,mba,bba;
    View view;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.student, container, false);
        cse=(ImageButton)view.findViewById(R.id.imageButton10);
        ece=(ImageButton)view.findViewById(R.id.imageButton11);
        civil=(ImageButton)view.findViewById(R.id.imageButton13);
        mech=(ImageButton)view.findViewById(R.id.imageButton12);
        bba=(ImageButton)view.findViewById(R.id.imageButton14);
        mba=(ImageButton)view.findViewById(R.id.imageButton15);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),cseFragment.class);
                startActivity(i);

            }
        });
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Ece.class);
                startActivity(i);
            }
        });
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Mech.class);
                startActivity(i);

            }
        });
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Civil.class);
                startActivity(i);
            }
        });
        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Bba.class);
                startActivity(i);
            }
        });
        mba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Mba.class);
                startActivity(i);
            }
        });
        return view;

}
    }