package com.example.jinwon.chap8lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  MyView mMyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("[MP01]05_201402406_이진원");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyView = (MyView) findViewById(R.id.myview);

        findViewById(R.id.redraw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redraw(v);
            }
        });
    }

    public void redraw(View v){
        mMyView.invalidate();
    }
}
