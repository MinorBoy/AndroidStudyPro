package com.example.android.androidstudypro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private String[] data = {
        "小王1","大王","栗子","香煎","哈哈","嗯额","看看","卡卡","试试","对对对","大大","定位1",
        "小王2","大王","栗子","香煎","哈哈","嗯额","看看","卡卡","试试","对对对","大大","定位2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ListViewActivity.this, R.layout.support_simple_spinner_dropdown_item, data
        );

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("listview","sssssssssssssss %s"+data[i]);
                String value = data[i];
                Toast.makeText(ListViewActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
