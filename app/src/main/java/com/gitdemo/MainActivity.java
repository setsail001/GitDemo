package com.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Iterator;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initView(String name) {
        System.err.println("");
        System.out.printf("");
        System.out.println();
        System.out.println("MainActivity.initView");
        System.out.println("name = [" + name + "]");
        System.out.println("name = " + name);

    }
}
