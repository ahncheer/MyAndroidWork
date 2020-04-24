package com.lec.android.a019_grapic;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    class MyView2 extends View{

        public MyView2(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();

            paint.setColor(Color.RED);
            canvas.drawRect(x-100, y-100, x+100, y+100, paint);

            paint.setColor(Color.BLUE);
            paint.setTextSize(40);
            canvas.drawText("글씨", 50, 50, paint);
        }
    }
}
