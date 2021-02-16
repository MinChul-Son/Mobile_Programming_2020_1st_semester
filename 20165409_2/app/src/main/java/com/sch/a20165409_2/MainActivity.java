package com.sch.a20165409_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edtText;
    RadioGroup rGroup;
    RadioButton rButton1,rButton2;
    Button btn;
    Double c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("온도변환기");

        edtText=(EditText)findViewById(R.id.Result);
        rButton1=(RadioButton)findViewById(R.id.Radio1);
        rButton2=(RadioButton)findViewById(R.id.Radio2);
        btn=(Button)findViewById(R.id.Btn);
        rGroup=(RadioGroup)findViewById(R.id.RadioGroup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rButton1.isChecked() == true) {
                    c = Double.parseDouble(edtText.getText().toString()) * 1.8 + 32;
                    edtText.setText(c.toString());
                    rButton2.setChecked(true);
                }
            }


        });


    }
}
