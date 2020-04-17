package com.lec.android.a007_;
/**
 * 화면(액티비티)전환 - 인텐트 사용 (인텐트 날린다?)
 *  1. 다음에 넘어갈 액티비티 준비
 *  2. 메니페스트에 액티비티 등록
 *  3. Intent 객체 만들어서 startActivity() 한다
 *      - Intent 로 데이터 주고 받기 :  putExtra() -> getXXXExtra()
 *      - 주고받은 Object 는 Serializable 되어 있어야 한다
 *
 *  안드로이드는 startActivity() 로 새 액티비티를 시작하면
 *  적측형(stack) 구조로 액티비티가 운영된다.
 */


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText etName;
    EditText etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);

        Button btnStartTwo = findViewById(R.id.btnStartTwo);






    }// end onCreate


}//end Main2Activity
