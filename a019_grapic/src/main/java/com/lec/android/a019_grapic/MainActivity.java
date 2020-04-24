package com.lec.android.a019_grapic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas){
            Paint  paint = new Paint();
            paint.setColor(Color.RED);

            setBackgroundColor(Color.GREEN);
            canvas.drawRect(100, 100, 200, 200, paint);

            paint.setColor(Color.YELLOW);

            paint.setStrokeWidth(10f); //선의 굵기
            canvas.drawLine(400, 100, 800, 150, paint);
            


        }
    }
}
