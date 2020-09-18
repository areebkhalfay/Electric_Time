package com.example.electric_time;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EvolveBambooGTR2in1Activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.evolveBambooGTR2in1Activity.input";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evolve_bamboo_g_t_r2in1);

        Intent intent = getIntent();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, EvolveBambooGTR2in1Activity2.class);
        EditText editText = (EditText) findViewById(R.id.inputDistance);
        String inputDistance = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, inputDistance);
        startActivity(intent);
    }
}