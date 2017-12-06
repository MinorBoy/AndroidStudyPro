package com.example.android.androidstudypro;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    private String[] data = {
            "小王1","大王1","栗子1","香煎1","哈哈1","嗯额1","看看1","卡卡1","试试1","对对对1",
            "小王2","大王2","栗子2","香煎2","哈哈2","嗯额2","看看2","卡卡2","试试2","对对对2",
            "小王3","大王3","栗子3","香煎3","哈哈3","嗯额3","看看3","卡卡3","试试3","对对对3"
    };

    public void initFrutList(){
        for (int i=0;i<data.length;i++){
            String name = getRandomLengthName(data[i]);
            int tmp = i % 10;
            int resId = getResources().getIdentifier("icon" + tmp, "drawable", getPackageName());
            Fruit fruit = new Fruit(name,resId);
            fruitList.add(fruit);
        }
    }

    public String getRandomLengthName(String str) {
        Random random = new Random();
        int length = random.nextInt(data.length)+1;
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<length;i++) {
            builder.append(str);
        }
        return builder.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycyler_view);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        initFrutList();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        FruitRecyclerAdapter fruitRecyclerAdapter = new FruitRecyclerAdapter(fruitList);

//        //指定布局为线性布局
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//设置横向布局

//        //指定布局为网格布局
//        GridLayoutManager layoutManager = new GridLayoutManager(this,2);//2是网格密度
//        layoutManager.setOrientation(GridLayoutManager.VERTICAL);//设置横向布局

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(fruitRecyclerAdapter);

    }
}
