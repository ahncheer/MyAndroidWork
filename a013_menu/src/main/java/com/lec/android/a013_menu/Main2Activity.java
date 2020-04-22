package com.lec.android.a013_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvCtxMenu;
    ImageView ivCtxMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvCtxMenu = findViewById(R.id.tvCtxMenu);
        ivCtxMenu = findViewById(R.id.ivCtxView);


    }
}
