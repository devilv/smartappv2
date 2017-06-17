package com.devil.smartapp;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

import com.igalata.bubblepicker.BubblePickerListener;
import com.igalata.bubblepicker.model.Color;
import com.igalata.bubblepicker.model.PickerItem;
import com.igalata.bubblepicker.rendering.BubblePicker;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Created by varun on 4/24/2017.
 */

public class Aboutus extends Activity {
    BubblePicker bubblePicker;
    String name[]={"UI Developer","UX Developer","App Developer","Backend Developer"};
    int images[]={R.drawable.varun,
            R.drawable.varun,
            R.drawable.varun,
                 R.drawable.halim};
    int[] colors={android.graphics.Color.parseColor("#CB356B"),
            android.graphics.Color.parseColor("#BD3F32"),
            android.graphics.Color.parseColor("#E8CBC0"),
            android.graphics.Color.parseColor("#636FA4")
    };
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
        bubblePicker=(BubblePicker)findViewById(R.id.picker);
        ArrayList<PickerItem>list= new ArrayList<>();
        for(int i=0;i<name.length;i++){
          PickerItem item= new PickerItem(name[i],colors[i], android.graphics.Color.WHITE,getDrawable(images[i]));
            list.add(item);
        }
        bubblePicker.setItems(list);
        bubblePicker.setListener(new BubblePickerListener() {
            @Override
            public void onBubbleSelected(@NotNull PickerItem pickerItem) {
                Toast.makeText(getApplicationContext(),""+pickerItem.getTitle()+" Varun Setia and M.D Halim",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onBubbleDeselected(@NotNull PickerItem pickerItem) {
                Toast.makeText(getApplicationContext(),"Deselected",Toast.LENGTH_LONG).show();

            }
        });
    }
}