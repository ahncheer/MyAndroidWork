package com.lec.android.a005_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

//안드로이드에서 모든 리소스로 사용하는 파일들은
// 파일명 규칙
// - 대문자 불가!
// - 숫자 시작 불가
// - 공백, 특수문자 불가!
// - 특수문자는 _만 가능
public class MainActivity extends AppCompatActivity {
    int [] imageId = {R.drawable.a1, R.drawable.a2, R.drawable.a3,
            R.drawable.a4, R.drawable.a5, R.drawable.a6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv;

        iv = findViewById(R.id.iv1);
        iv.setImageResource(R.drawable.a1);
        iv.setImageResource(R.drawable.a1);


    }

    class MyListener implements View.OnClickListener{
        int i = 0;
        @Override
        public void onClick(View v) {

        }
    }
}
