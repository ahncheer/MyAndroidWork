package com.lec.android.a008_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    ProfileAdapter adapter;  // Adapter 객체
    RecyclerView rv;
    EditText etName, etAge, etAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etAdd = findViewById(R.id.etAdd);

        // RecyclerView 를 사용하기 위해서는 LayoutManager 지정해주어야 한다.
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);

        // Adapter객체 생성
        adapter = new ProfileAdapter();
        initAdapter(adapter);
        rv.setAdapter(adapter);   // RecyclerView 에 Adapter 장착!
        Button btnInsert = findViewById(R.id.btnInsert);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData(v);
            }
        });


    } // end onCreate()

    // 샘플데이터 가져오기
    protected void initAdapter(ProfileAdapter adapter){
        // 몇개만 생성
        for(int i = 0; i < 2; i++){
            int idx = ProfileList.next();
            adapter.addItem(new Profile(ProfileList.NAME[idx], ProfileList.etAge[idx], ProfileList.etAdd[idx]));
        }
    }

    protected void insertData(View v){
        int idx = ProfileList.next();
        //리스트 맨ㅇ앞에 추가 !
        String name = etName.getText().toString();
        String age =  etAge.getText().toString();
        String address = etAdd.getText().toString();

        adapter.addItem(0, new Profile(name, age, address));
        adapter.notifyDataSetChanged(); //중요하다 중요해 꼭 적용하기!
        //데이터 변경을 Adapter에 알리고, 리스트뷰에 반영

        etName.setText(" ");
        etAge.setText(" ");
        etAdd.setText(" ");

    }

} // end Activity








