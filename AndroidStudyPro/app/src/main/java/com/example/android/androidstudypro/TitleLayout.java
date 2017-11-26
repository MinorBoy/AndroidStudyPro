package com.example.android.androidstudypro;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by MinorBoy on 2017/11/26.
 */

public class TitleLayout extends LinearLayout  {
    public TitleLayout(final Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.customtitle, this);

        Button backButton = (Button) findViewById(R.id.backButton);
        Button editButton = (Button) findViewById(R.id.editButton);
        TextView titleText = (TextView) findViewById(R.id.titleText);

        backButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("customtitle", "backButton click !!!");
                ((Activity) getContext()).finish();
            }
        });

        editButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("customtitle", "editButton click !!!");
                Toast.makeText(getContext(), "哈哈哈", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
