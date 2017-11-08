package com.example.android.androidstudypro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
//            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "哈哈哈", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
