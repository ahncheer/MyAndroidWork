//package com.lec.android.a008_practice;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class ProfileDetail extends AppCompatActivity {
//    TextView showName, showAge, showAdd;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_profile_detail);
//
//        showName = findViewById(R.id.showName);
//        showAge = findViewById(R.id.showAge);
//        showAdd = findViewById(R.id.showAdd);
//
//        Intent intent  = getIntent();
//        Profile pf = (Profile)intent.getSerializableExtra("pf");
//        showName.setText(pf.getName());
//        showAge.setText(pf.getAge());
//        showAdd.setText(pf.getAddress());
//
//        Button btnBack = findViewById(R.id.btnBack);
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //리스트로 돌아가기
//                finish();
//            }
//        });
//
//
//
//
//    }// end onCreate
//}// end ProfileDetail
