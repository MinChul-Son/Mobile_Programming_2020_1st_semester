package com.sch.test0402;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1,t2,t3;
        t1=(TextView) findViewById(R.id.textView1);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        t1.setText("안녕하세요");
        t1.setTextColor(Color.RED);
        t2.setTextSize(30);
        t2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        t3.setText("가나다라");
        t3.setSingleLine();

    }
}
