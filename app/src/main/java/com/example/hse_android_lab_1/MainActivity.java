package com.example.hse_android_lab_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText editText;

    Button acceptButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        editText = findViewById(R.id.edit_text);
        acceptButton = findViewById(R.id.accept_button);

        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent departingIntent = new Intent(MainActivity.this, SecondActivity.class);

                departingIntent.putExtra("color", editText.getText().toString());

                startActivity(departingIntent);
            }
        });


    }
}
