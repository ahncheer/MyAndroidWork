package com.lec.android.ahcheer_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rGroup;
    TextView rbResult;

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    TextView chResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rGroup = findViewById(R.id.rGroup);
        rbResult = findViewById(R.id.rbResult);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        chResult = findViewById(R.id.chResult);

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            // checkedId : 선택된 라디오버튼의 id
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = findViewById(checkedId);
                rbResult.setText("선택한 결과: " + rb.getText());
            }
        });
        checkBox1.setOnCheckedChangeListener(new CbListener());
        checkBox2.setOnCheckedChangeListener(new CbListener());
        checkBox3.setOnCheckedChangeListener(new CbListener());
        checkBox4.setOnCheckedChangeListener(new CbListener());

    }// end onCreate

    class CbListener implements CompoundButton.OnCheckedChangeListener{

        // CheckBox 의 '상태'가 변할때마다 호출되는 메소드
        // isChecked : true <- check 상태,  false <- uncheck 상태
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            int count = 0;
            if(checkBox1.isChecked()){count++; chResult.setText(checkBox1.getText() + "선택 \n");}
            if(checkBox2.isChecked()){count++; chResult.setText(checkBox2.getText() + "선택 \n");}
            if(checkBox3.isChecked()){count++; chResult.setText(checkBox3.getText() + "선택 \n");}
            if(checkBox4.isChecked()){count++; chResult.setText(checkBox4.getText() + "선택 \n");}
            chResult.setText(count + "개 선택");
        }
    }

}
