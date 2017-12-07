package com.example.android.androidstudypro;

import android.content.Context;

/**
 * Created by MinorBoy on 2017/12/8.
 * message类
 */

public class Msg {
    public static final int TYPE_SEND=1;
    public static final int TYPE_RECEIVE=2;

    private int type;
    private String content;

    public Msg(String content, int type) {
        this.type = type;
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    public int getType() {
        return type;
    }
}
