package com.lec.android.a003_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


// num1 oper num2  = result
public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    int x = 0; // 첫번쨰 입력값인지 그 이후 입력값인지 확인
    int a = 0; //1 +, 2 -, 3 *, 4 /
    Double num1 = 0.0, num2 = 0.0, result = 0.0;
    String userNum = ""; //입력값
    int tryNum = 0;
    EditText st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        st = findViewById(R.id.numView);

    Button btn1 = findViewById(R.id.btn1);
    Button btn2 = findViewById(R.id.btn2);
    Button btn3 = findViewById(R.id.btn3);
    Button btn4 = findViewById(R.id.btn4);
    Button btn5 = findViewById(R.id.btn5);
    Button btn6 = findViewById(R.id.btn6);
    Button btn7 = findViewById(R.id.btn7);
    Button btn8 = findViewById(R.id.btn8);
    Button btn9 = findViewById(R.id.btn9);
    Button btn0 = findViewById(R.id.btn0);


    Button btnPlus = findViewById(R.id.btnPlus);
    Button btnMinus = findViewById(R.id.btnMinus);
    Button btnDiv = findViewById(R.id.btnDiv);
    Button btnMul = findViewById(R.id.btnMul);

    Button btnClear = findViewById(R.id.btnClear);
    Button btnEqual = findViewById(R.id.btnEqual);

        // ------------ 버튼 1~9 --------------
        btn1.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 1;
             st.setText(userNum);
         });
        btn2.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 2;
            st.setText(userNum);
        });
        btn3.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 3;
            st.setText(userNum);
        });

        btn4.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 4;
            st.setText(userNum);
        });
        btn5.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 5;
            st.setText(userNum);
        });
        btn6.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 6;
            st.setText(userNum);
        });

        btn7.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 7;
            st.setText(userNum);
        });
        btn8.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 8;
            st.setText(userNum);
        });
        btn9.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 9;
            st.setText(userNum);
        });

        btn0.setOnClickListener((v) -> {    // onClick(View v)
            userNum += 0;
            st.setText(userNum);
        });



        //-------------------사칙연산----------------
        btnPlus.setOnClickListener((v) -> {    // onClick(View v)
            a = 1;
            st.setText(Double.toString(calcResult(a)));
        });

        btnMinus.setOnClickListener((v) -> {    // onClick(View v)
            a = 2;
            st.setText(Double.toString(calcResult(a)));
        });

        btnMul.setOnClickListener((v) -> {    // onClick(View v)
            a = 3;
            st.setText(Double.toString(calcResult(a)));
        });
        btnDiv.setOnClickListener((v) -> {    // onClick(View v)
            a = 4;
            st.setText(Double.toString(calcResult(a)));
        });


        // -------------------결과 & 지우기 -----------------
        btnEqual.setOnClickListener((v) -> {    // onClick(View v)
            st.setText(Double.toString(calcResult(a)));
            userNum = ""; x=0;
        });

        btnClear.setOnClickListener((v) -> {    // onClick(View v)
            x = 0;
            num1 = 0.0; num2 = 0.0; result = 0.0;
            userNum = "";
            st.setText(" ");
        });

    }// end onCreate

    @Override
    public void onClick(View v) {
    }

    public double calcResult(int a){
        if (x==0) {
            num1 = Double.parseDouble(userNum);
            if(num1 == null) num1 = 0.0;
            else num1 = Double.parseDouble(userNum);
            result = num1;
        }else {
            num2 = Double.parseDouble(userNum);
            if(num2 == null) num2 = 0.0;
            else num2 = Double.parseDouble(userNum);

            if(a == 1)result = num1 + num2;
            if(a == 2)result = num1 - num2;
            if(a == 3)result = num1 * num2;
            if(a == 4){
                if (num1 == 0.0 || num2 == 0.0) {
                    result = num1;
                }else {
                    result = num1 / num2;
                }
            }
            num1 = result;
        }
        st.setText(Double.toString(result));
        userNum = ""; x++;
        return result;
    }
}// end class
