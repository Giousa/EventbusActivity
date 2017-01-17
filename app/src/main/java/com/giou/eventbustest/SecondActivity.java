package com.giou.eventbustest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/1/17
 * Time:下午9:09
 */

public class SecondActivity extends AppCompatActivity {

    private Button btn_FirstEvent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_FirstEvent = (Button) findViewById(R.id.btn_first_event);

        btn_FirstEvent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //发送消息
                EventBus.getDefault().post(
                        new FirstEvent("SecondActivity 发送的数据 FirstEvent btn clicked"));
            }
        });
    }
}
