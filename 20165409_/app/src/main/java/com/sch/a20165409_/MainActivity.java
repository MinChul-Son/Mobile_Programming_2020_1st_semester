package com.sch.a20165409_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtText1, edtText2,edtText3;
    Button btn1,btn2,btn3,btn4;
    String num1,num2;
    Double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculator");

        edtText1=(EditText)findViewById(R.id.EditNum1);
        edtText2=(EditText)findViewById(R.id.EditNum2);
        edtText3=(EditText)findViewById(R.id.EResult);
        btn1=(Button)findViewById(R.id.plus);
        btn2=(Button)findViewById(R.id.minus);
        btn3=(Button)findViewById(R.id.mul);
        btn4=(Button)findViewById(R.id.div);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edtText1.getText().toString();
                num2=edtText2.getText().toString();
                result=Double.parseDouble(num1)+Double.parseDouble(num2);
                edtText3.setText("계산결과: "+result.toString());

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edtText1.getText().toString();
                num2=edtText2.getText().toString();
                result=Double.parseDouble(num1)-Double.parseDouble(num2);
                edtText3.setText("계산결과: "+result.toString());

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edtText1.getText().toString();
                num2=edtText2.getText().toString();
                result=Double.parseDouble(num1)*Double.parseDouble(num2);
                edtText3.setText("계산결과: "+result.toString());

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edtText1.getText().toString();
                num2=edtText2.getText().toString();
                result=Double.parseDouble(num1)/Double.parseDouble(num2);
                edtText3.setText("계산결과: "+result.toString());

            }
        });
    }
}
