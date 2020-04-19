package com.lec.android.aaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileDetail extends AppCompatActivity {
    TextView tvName, tvAge, tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_detail);

        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        tvAddress = findViewById(R.id.tvAddress);

        Intent intent  = getIntent();
        Profile pb = (Profile)intent.getSerializableExtra("pb");
        tvName.setText(pb.getName());
        tvAge.setText(pb.getAge());
        tvAddress.setText(pb.getAddress());

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //리스트로 돌아가기
                finish();
            }
        });




    }// end onCreate
}// end PhonebookDetail
