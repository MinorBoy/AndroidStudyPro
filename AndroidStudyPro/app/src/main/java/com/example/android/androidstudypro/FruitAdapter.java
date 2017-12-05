package com.example.android.androidstudypro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MinorBoy on 2017/12/5.
 * 水果适配器类
 */

public class FruitAdapter extends ArrayAdapter<Fruit>{
    private int resouseId;
    public FruitAdapter(Context context, int textViewId, List<Fruit> objects){
        super(context, textViewId, objects);
        resouseId = textViewId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resouseId, parent, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView name = (TextView) view.findViewById(R.id.name);
        imageView.setImageResource(fruit.getImageId());
        name.setText(fruit.getName());
        return view;
    }
}
