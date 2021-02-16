package com.sch.project7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    EditText edtText1;
    ImageView img1;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item0:
                img1.setRotation(Float.parseFloat(edtText1.getText().toString()));
                return true;
            case R.id.item1:
                img1.setImageResource(R.drawable.img1);
                return true;
            case R.id.item2:
                img1.setImageResource(R.drawable.img2);
                return true;
            case R.id.item3:
                img1.setImageResource(R.drawable.img3);
                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText1=(EditText)findViewById(R.id.edtText1);
        img1=(ImageView)findViewById(R.id.img1);
        setTitle("제주도 풍경");
    }
}
