package com.example.arturmusayelyan.dialogexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    android.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
    }

    public void showDialog(View view) {
        MyAlert myAlert = MyAlert.newInstance();
        myAlert.show(manager,"My Alert");
    }
}
