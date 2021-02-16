package com.sch.graphictext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));

    }
}

class MyView extends View{

    public MyView(Context context) {
        super(context);
    }
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(100);
        Typeface t;
        t=Typeface.create(Typeface.DEFAULT,Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("DEFAULT 폰트",10,400,paint);
        t=Typeface.create(Typeface.DEFAULT_BOLD,Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("DEFAULT BOLD 폰트",10,500,paint);
        t=Typeface.create(Typeface.MONOSPACE,Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText(" MONOSPACE 폰트",10,600,paint);
        t=Typeface.create(Typeface.SERIF,Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("SERIF 폰트",10,700,paint);
    }
}


