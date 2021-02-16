package com.sch.graphic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;



class MyView extends View{
    private Paint paint,paint2,paint3,paint4;
    public MyView(Context context){
        super(context);
        paint=new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint2=new Paint();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setColor(Color.BLACK);
        paint2.setStrokeWidth(70);
        paint3=new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(Color.argb(180,00,00,100));
        paint4=new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(Color.argb(180,150,00,00));
    }
    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawRect(30,30,800,100,paint);
        canvas.drawLine(80,200,800,200,paint2);
        canvas.drawOval(100,300,600,500,paint);
        canvas.drawArc(100,400,400,700,30,120,true,paint);
        canvas.drawRect(100,800,300,1000,paint3);
        canvas.drawRect(160,860,360,1060,paint4);
        invalidate();

    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyView(this));
    }
}
