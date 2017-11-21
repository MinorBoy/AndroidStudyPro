package com.example.android.androidstudypro;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
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


    private ImageView imageView;
    private ProgressBar progressBar;
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        imageView = (ImageView) findViewById(R.id.imageView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        button = (Button) findViewById(R.id.btn1);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener(){
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
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:123456789"));
//                startActivity(intent);


                if (progressBar.getVisibility() == View.GONE){
                    imageView.setImageResource(R.drawable.head2);
                    progressBar.setVisibility(View.VISIBLE);
                    textView.setText("");
                } else {
                    imageView.setImageResource(R.drawable.head1);
                    progressBar.setVisibility(View.GONE);
                    textView.setText(editText.getText());
                }

                int progress = progressBar.getProgress();
                Log.i("test", "progress=" + progress);
                progress += 10;
                progressBar.setProgress(progress);

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("对话框");
                dialog.setMessage("hello message: " + progress);
                dialog.setCancelable(true);
                dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "click ok button !!!", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "click cancel button !!!", Toast.LENGTH_SHORT).show();
                    }
                });


                dialog.show();


            }
        });




    }
}
