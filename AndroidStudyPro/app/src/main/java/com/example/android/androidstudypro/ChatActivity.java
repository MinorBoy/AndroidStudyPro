package com.example.android.androidstudypro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private List<Msg> msgList = new ArrayList<>();
    private EditText editText;
    private Button sendBtn;

    private RecyclerView msgRecyclerView;
    private MsgRecycylerAdapter msgRecycylerAdapter;

    public void initInputList(){
        Msg msg1 = new Msg("hello boy",Msg.TYPE_RECEIVE);
        msgList.add(msg1);
        Msg msg2 = new Msg("你是？",Msg.TYPE_SEND);
        msgList.add(msg2);
        Msg msg3 = new Msg("我是上帝。",Msg.TYPE_RECEIVE);
        msgList.add(msg3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        editText = (EditText)findViewById(R.id.inputText);
        sendBtn = (Button)findViewById(R.id.sendBtn);
        msgRecyclerView = (RecyclerView)findViewById(R.id.chatRecyclerView);
        initInputList();
        msgRecycylerAdapter = new MsgRecycylerAdapter(msgList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        msgRecyclerView.setAdapter(msgRecycylerAdapter);

    }
}
