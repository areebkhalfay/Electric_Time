package com.example.electric_time;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HovertraxHoverboardActivity2 extends AppCompatActivity {
    private Integer inputDist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hovertrax_hoverboard2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(HovertraxHoverboardActivity.EXTRA_MESSAGE);
        inputDist = Integer.parseInt(message);
        //Walking Function
        String walkingVal = walkingFn(inputDist).toString();
        if (Double.parseDouble(walkingVal) == 0.0) {
            walkingVal = "N/A";
        }
        //Boosted Mini S Function
        String boostedMiniSVal = boostedMiniSFn(inputDist).toString();
        if (Double.parseDouble(boostedMiniSVal) == 0.0) {
            boostedMiniSVal = "N/A";
        }
        //Evolve Bamboo GTR 2in1 Function
        String evolveBambooGTR2in1Val = evolveBambooGTR2in1Fn(inputDist).toString();
        if (Double.parseDouble(evolveBambooGTR2in1Val) == 0.0) {
            evolveBambooGTR2in1Val = "N/A";
        }
        //Segway Ninebot S-Plus Function
        String segwayNinebotSPlusVal = segwayNinebotSPlusfn(inputDist).toString();
        if (Double.parseDouble(segwayNinebotSPlusVal) == 0.0) {
            segwayNinebotSPlusVal = "N/A";
        }
        //Hovertrax Hoverboard Function
        String hovertraxHoverboardVal = hovertraxHoverboardfn(inputDist).toString();
        if (Double.parseDouble(hovertraxHoverboardVal) == 0.0) {
            hovertraxHoverboardVal = "N/A";
        }
        //Set Walking Time
        TextView textView = findViewById(R.id.textView3);
        textView.setText(hovertraxHoverboardVal);
        //Set Boosted Time
        TextView textView2 = findViewById(R.id.textView9);
        textView2.setText(walkingVal);
        //Set Evolve Bamboo GTR 2in1 Time
        TextView textView3 = findViewById(R.id.textView11);
        textView3.setText(boostedMiniSVal);
        //Set Segway Ninebot S-Plus Time
        TextView textView4 = findViewById(R.id.textView13);
        textView4.setText(evolveBambooGTR2in1Val);
        //Set HoverTrax Hoverboard Time
        TextView textView5 = findViewById(R.id.textView15);
        textView5.setText(segwayNinebotSPlusVal);
    }

    private Double walkingFn(int x) {
        double returnValue = 0.0;
        if (x <= 30) {
            returnValue = (1.0 / 3.1) * (double) x * 60.0;
            return round(returnValue, 1);
        }
        else {
            return 0.0;
        }
    }

    private Double boostedMiniSFn(int x) {
        double returnValue = 0.0;
        if (x <= 7) {
            returnValue = (1.0 / 18) * (double) x * 60.0;
            return round(returnValue, 1);
        }
        else {
            return 0.0;
        }
    }

    private Double evolveBambooGTR2in1Fn(int x) {
        double returnValue = 0.0;
        if (x <= 31) {
            returnValue = (1.0 / 24) * (double) x * 60.0;
            return round(returnValue, 1);
        }
        else {
            return 0.0;
        }
    }

    private Double segwayNinebotSPlusfn(int x) {
        double returnValue = 0.0;
        if (x <= 22) {
            returnValue = (1.0 / 12) * (double) x * 60.0;
            return round(returnValue, 1);
        }
        else {
            return 0.0;
        }
    }

    private Double hovertraxHoverboardfn(int x) {
        double returnValue = 0.0;
        if (x <= 6) {
            returnValue = (1.0 / 9) * (double) x * 60.0;
            return round(returnValue, 1);
        }
        else {
            return 0.0;
        }
    }

    // Got from stack overflow https://stackoverflow.com/questions/22186778/using-math-round-to-round-to-one-decimal-place
    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}