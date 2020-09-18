package com.example.electric_time;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegwayNinebotSPlusActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.segwayNinebotSPlus.input";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segway_ninebot_s_plus);

        Intent intent = getIntent();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SegwayNinebotSPlusActivity2.class);
        EditText editText = (EditText) findViewById(R.id.inputDistance);
        String inputDistance = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, inputDistance);
        startActivity(intent);
    }
}