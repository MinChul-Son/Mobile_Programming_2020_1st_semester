package com.sch.project7_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvName,tvEmail;
    Button button1;
    EditText dlgEditName,dlgEditEmail;
    TextView toastText;
    View dialogView,toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName=(EditText)findViewById(R.id.tvName);
        tvEmail=(EditText)findViewById(R.id.tvEmail);
        button1=(Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//객체화 시키는 과정 ==> 인플레이션(아래의 inflate메소드)
                dialogView = (View) View.inflate(MainActivity.this,R.layout.dialog1,null);//레이아웃을 자바코드에 활용하기 위한 객체화 작업
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_launcher_background);
                dlg.setView(dialogView);
                dlgEditName=(EditText)dialogView.findViewById(R.id.dlgEdt1);
                dlgEditEmail=(EditText)dialogView.findViewById(R.id.dlgEdt2);
                dlgEditName.setText(tvName.getText().toString());
                dlgEditEmail.setText(tvEmail.getText().toString());
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvName.setText(dlgEditName.getText().toString());
                        tvEmail.setText(dlgEditEmail.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast=new Toast(MainActivity.this);
                        toastView=(View) View.inflate(MainActivity.this,R.layout.toast1,null);
                        toastText=(TextView)toastView.findViewById(R.id.toastText1);
                        toastText.setText("취소했습니다.");
                        toast.setView(toastView);

                        Display display =((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                        int xOffset = (int) (Math.random()*display.getWidth());
                        int yOffset = (int) (Math.random()*display.getHeight());
                        toast.setGravity(Gravity.TOP | Gravity.LEFT,xOffset,yOffset);
                        toast.show();

                    }
                });
                dlg.show();
            }
        });
    }
}
