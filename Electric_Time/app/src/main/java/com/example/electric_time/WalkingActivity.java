package com.example.electric_time;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WalkingActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.walkingActivity.input";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walking);

        Intent intent = getIntent();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, WalkingActivity2.class);
        EditText editText = (EditText) findViewById(R.id.inputDistance);
        String inputDistance = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, inputDistance);
        startActivity(intent);
    }
}