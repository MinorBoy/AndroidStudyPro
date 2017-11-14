package com.example.android.androidstudypro;

import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * 创建菜单
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     *点击菜单项回调
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(MainActivity.this, "setting item", Toast.LENGTH_SHORT).show();
            case R.id.about:
                Toast.makeText(MainActivity.this, "about item", Toast.LENGTH_SHORT).show();
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
//            @Override
            public void onClick(View v){
//                Toast.makeText(MainActivity.this, "哈哈哈", Toast.LENGTH_SHORT).show();

//                显式Intent
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);

//                隐式Intent
//                Intent intent = new Intent("AAA");
//                startActivity(intent);

//                调用系统默认view显示网页
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);

//                拨打电话
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:123456789"));
                startActivity(intent);

            }
        });


    }
}
