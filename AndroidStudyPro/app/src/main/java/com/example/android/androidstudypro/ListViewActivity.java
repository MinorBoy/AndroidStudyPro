package com.example.android.androidstudypro;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private String[] data = {
        "小王1","大王1","栗子1","香煎1","哈哈1","嗯额1","看看1","卡卡1","试试1","对对对1",
        "小王2","大王2","栗子2","香煎2","哈哈2","嗯额2","看看2","卡卡2","试试2","对对对2",
        "小王3","大王3","栗子3","香煎3","哈哈3","嗯额3","看看3","卡卡3","试试3","对对对3"
    };

    private List<Fruit> fruitList = new ArrayList<>();

    public void initFruits(){
        for (int i = 0; i < 30; i++) {
            String name = data[i];
            int tmp = i % 10;

//            读取资源id的方法
            int resId = getResources().getIdentifier("icon" + tmp, "drawable", getPackageName());
            Fruit icon = new Fruit(name, resId);
            fruitList.add(icon);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this, R.layout.support_simple_spinner_dropdown_item, data);

        initFruits();
        FruitAdapter fruitFruitAdapter = new FruitAdapter(ListViewActivity.this, R.layout.fruit_item, fruitList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(fruitFruitAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = data[i];
                Toast.makeText(ListViewActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
