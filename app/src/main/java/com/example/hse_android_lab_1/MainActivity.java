package com.example.hse_android_lab_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends Activity {

    EditText editText;

    Button acceptButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        editText = findViewById(R.id.edit_text);
        acceptButton = findViewById(R.id.accept_button);

        acceptButton.setOnClickListener(v -> {
            String color = editText.getText().toString().toLowerCase();

            if (!Arrays.asList(new String[]{"green", "blue", "red"}).contains(color)) {
                Toast.makeText(getBaseContext(), "Wrong color", Toast.LENGTH_LONG).show();
            } else {
                Intent departingIntent = new Intent(MainActivity.this, SecondActivity.class);

                departingIntent.putExtra("color", color);

                startActivity(departingIntent);
            }
        });
    }
}
