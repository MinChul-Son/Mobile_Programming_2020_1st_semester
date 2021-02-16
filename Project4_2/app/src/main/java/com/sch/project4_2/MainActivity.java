package com.sch.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    Switch swAgree;
    RadioGroup rGroup1;
    RadioButton rdoOreo,rdoPie,rdoQ;
    ImageView imgAndroid;
    Button btnClose,btnRestart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");
        text1=(TextView)findViewById(R.id.Text1);
        text2=(TextView)findViewById(R.id.Text2);
        swAgree=(Switch) findViewById(R.id.SwAgree);
        rGroup1=(RadioGroup)findViewById(R.id.RGroup1);
        rdoOreo=(RadioButton)findViewById(R.id.RdoOreo);
        rdoPie=(RadioButton)findViewById(R.id.RdoPie);
        rdoQ=(RadioButton)findViewById(R.id.RdoQ);
        imgAndroid=(ImageView)findViewById(R.id.ImgAndroid);
        btnClose=(Button)findViewById(R.id.BtnClose);
        btnRestart=(Button)findViewById(R.id.BtnRestart);

        swAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(swAgree.isChecked()==true){
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgAndroid.setVisibility(android.view.View.VISIBLE);
                }
                else{
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgAndroid.setVisibility(android.view.View.INVISIBLE);
                }

            }
        });

        rdoOreo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(rdoOreo.isChecked()==true){
                    imgAndroid.setImageResource(R.drawable.oreo);
                }
            }
        });
        rdoPie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(rdoPie.isChecked()==true){
                    imgAndroid.setImageResource(R.drawable.pie);
                }
            }
        });
        rdoQ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(rdoQ.isChecked()==true){
                    imgAndroid.setImageResource(R.drawable.q);
                }
            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swAgree.setChecked(false);
                rGroup1.clearCheck();
            }
        });



    }
}
