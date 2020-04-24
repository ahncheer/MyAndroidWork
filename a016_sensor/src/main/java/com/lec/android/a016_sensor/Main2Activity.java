package com.lec.android.a016_sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements  SensorEventListener {
    private TextView tv;
    private SensorManager sm;

    Sensor accerlation;
    Sensor magnetometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.textView1);
        sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

//        Sensor s = sm.getDefaultSensor(Sensor.TYPE_ORIENTATION); //옛날에 사용하던 방식

        accerlation = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        magnetometer = sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);


    }


    @Override
    protected void onResume() {
        //센서값이 변경되었을 떄마다 콜백 SensorEventListener객체
        //sm.
        super.onResume();
        sm.registerListener((SensorEventListener) this,
                accerlation, //콜백원하는ㄴ 센서
                SensorManager.SENSOR_DELAY_UI); //지연시간, 2ms

        sm.registerListener((SensorEventListener) this,
                magnetometer, //콜백원하는ㄴ 센서
                SensorManager.SENSOR_DELAY_UI); //지연시간, 2ms
    }




    //화면 빠져나가기 전에 센서 자원 반납
    @Override
    protected void onPause() {
        //센서에 등록된 리스너 해제
        super.onPause();

        //센서에 등록된 리스너 해제
        sm.unregisterListener(this); ///TODO
    }


    float [] mGravity;
    float [] mGeomagnetic;
//    SensorEventListener 객체의 메소드들
    //센서값이 변경되었을 떄 호출되는 콜백
    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
            mGravity = event.values;
        if(event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD)
            mGeomagnetic = event.values;

        if(mGravity != null && mGeomagnetic != null){
            float [] R = new float[9];
            float [] I = new float[9];

            boolean success = SensorManager.getRotationMatrix(R, I, mGravity, mGeomagnetic);
            if(success){
                float [] orientation = new float[3];
                SensorManager.getOrientation(R, orientation);

                float azimuth =orientation[0]; //z축  회정방향
                float pitch = orientation[1]; //x축
                float roll = orientation[2]; //y축

                String str = String.format("%10s : %10s  :%10s\n" +
                                    "%10.2f : %10.2f : %10.2f :\n" +
                                    "방위각" , "피치" , "롤",
                                    azimuth, pitch, roll);
                tv.setText(str);
                Log.d("myapp" , str);
            }
        }

        tv.setText("onSensorChanged");
        Log.d("myapp", "onSensorChanged");

    }

    //센서의 정확도가 변경되었을떄 호출되는 콜백
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //TODO
        tv.setText("onAccuracyChanged");
        Log.d("myapp", "onAccuracyChanged");


    }
}
