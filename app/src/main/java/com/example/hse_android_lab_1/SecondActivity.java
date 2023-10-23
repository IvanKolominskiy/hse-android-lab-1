package com.example.hse_android_lab_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class SecondActivity extends Activity {

    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent recievedIntent = getIntent();

        String color = recievedIntent.getStringExtra("color");
        relativeLayout = findViewById(R.id.second_activity_relative_layout);

        switch (color) {
            case "green":
                relativeLayout.setBackgroundResource(R.color.green);
                break;

            case "red":
                relativeLayout.setBackgroundResource(R.color.red);
                break;

            case "blue":
                relativeLayout.setBackgroundResource(R.color.blue);
                break;
        }

    }
}
