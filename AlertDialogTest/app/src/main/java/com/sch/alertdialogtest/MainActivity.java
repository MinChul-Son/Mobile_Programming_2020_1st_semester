package com.sch.alertdialogtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button0;
    String temp=("");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=(Button)findViewById(R.id.Button0);
    }
    public void open(View view){
        final String[] versionArray = new String[] {"오레오","파이","큐(10)"};
        final boolean[] checkArray = new boolean[] {false,false,false};
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("좋아하는 버전은?");
        alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
        alertDialogBuilder.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                temp=versionArray[i]+temp;
                button0.setText(temp);
            }
        });

        alertDialogBuilder.setPositiveButton("닫기",null);
       alertDialogBuilder.show();

    }
}
