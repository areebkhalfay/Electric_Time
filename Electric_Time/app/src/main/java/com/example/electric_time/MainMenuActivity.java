package com.example.electric_time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Intent intent = getIntent();

    }

    public void enterWalking(View view) {
        Intent intent = new Intent(this, WalkingActivity.class);
        startActivity(intent);
    }

    public void enterBoostedMiniS(View view) {
        Intent intent = new Intent(this, BoostedMiniSActivity.class);
        startActivity(intent);
    }

    public void enterEvolveBambooGTR2in1(View view) {
        Intent intent = new Intent(this, EvolveBambooGTR2in1Activity.class);
        startActivity(intent);
    }

    public void enterSegwayNinebotSPlus(View view) {
        Intent intent = new Intent(this, SegwayNinebotSPlusActivity.class);
        startActivity(intent);
    }

    public void enterHovertraxHoverboard(View view) {
        Intent intent = new Intent(this, HovertraxHoverboardActivity.class);
        startActivity(intent);
    }

    public void enterExtraMenu(View view) {
        Intent intent = new Intent(this, ExtraMenuActivity.class);
        startActivity(intent);
    }
}