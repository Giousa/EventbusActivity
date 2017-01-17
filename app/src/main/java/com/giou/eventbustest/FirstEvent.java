package com.giou.eventbustest;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/1/17
 * Time:下午9:11
 */

public class FirstEvent {

    private String mMsg;
    public FirstEvent(String msg) {
        // TODO Auto-generated constructor stub
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}
