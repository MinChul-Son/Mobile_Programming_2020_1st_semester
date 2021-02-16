package com.sch.project5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout= new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);
        edt= new EditText(this);
        baseLayout.addView(edt);
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);
        txv= new TextView(this);
        baseLayout.addView(txv);

        //이벤트처리
       btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txv.setText(edt.getText().toString());



            }
        });



    }
}
