package com.sch.mytest_6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart, btnStop;
        final ViewFlipper vFlipper;

        btnStart=(Button)findViewById(R.id.btnStart);
        btnStop=(Button)findViewById(R.id.btnStop);
        vFlipper=(ViewFlipper)findViewById(R.id.viewFlipper1);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.startFlipping();
                vFlipper.setFlipInterval(100);
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.stopFlipping();
            }
        });
    }
}
