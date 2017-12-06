package com.example.android.androidstudypro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private String[] data = {
        "小王1","大王","栗子","香煎","哈哈","嗯额","看看","卡卡","试试","对对对","大大","定位1",
        "小王2","大王","栗子","香煎","哈哈","嗯额","看看","卡卡","试试","对对对","大大","定位2"
    };

    private List<Fruit> fruitList = new ArrayList<>();

    public void initFruits(){
            for (int i=1; i<3; i++){
                Fruit icon1 = new Fruit("icon"+i, R.drawable.icon1);
                fruitList.add(icon1);
                Fruit icon2 = new Fruit("icon"+i, R.drawable.icon2);
                fruitList.add(icon2);
                Fruit icon3 = new Fruit("icon"+i, R.drawable.icon3);
                fruitList.add(icon3);
                Fruit icon4 = new Fruit("icon"+i, R.drawable.icon4);
                fruitList.add(icon4);
                Fruit icon5 = new Fruit("icon"+i, R.drawable.icon5);
                fruitList.add(icon5);
                Fruit icon6 = new Fruit("icon"+i, R.drawable.icon6);
                fruitList.add(icon6);
                Fruit icon7 = new Fruit("icon"+i, R.drawable.icon7);
                fruitList.add(icon7);
                Fruit icon8 = new Fruit("icon"+i, R.drawable.icon8);
                fruitList.add(icon8);
                Fruit icon9 = new Fruit("icon"+i, R.drawable.icon9);
                fruitList.add(icon9);
                Fruit icon10 = new Fruit("icon"+i, R.drawable.icon10);
                fruitList.add(icon10);
            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                ListViewActivity.this, R.layout.support_simple_spinner_dropdown_item, data
//        );

        initFruits();
        FruitAdapter fruitFruitAdapter = new FruitAdapter(ListViewActivity.this, R.layout.fruit_item, fruitList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(fruitFruitAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Log.i("listview","sssssssssssssss %s"+data[i]);
                String value = data[i];
                Toast.makeText(ListViewActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
