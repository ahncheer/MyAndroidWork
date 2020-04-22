package com.lec.android.a011_stroage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

//SQLiteOpenHelper
//안드로이드에서 SQLite데이터 베이스를 좀 더 쉽게 사용할 수 있도록 제공되는 클래스

public class MySQLiteOpenHelper3 extends SQLiteOpenHelper {
    public MySQLiteOpenHelper3(@Nullable Context context, @Nullable String name,
                               @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        Log.d("myapp","MySQLiteOpenHelper 생성");
    }

    //최초의 앱 설치 이후 최초의 데이터베이스가 없는 경우 데이터 ㅂㅔ이스 생성을 위해 호출되는 콜백
    // 주로 ddl등 테이블 생성하는 코드 작성
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("myapp", "MySQLiteOpenHelper onCreate() 호출");

        String sql = "CREATE TABLE mytable( "
                + "id INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + " name TEXT"
                + ")";

        db.execSQL(sql);

    }

    //데이터베이스의 버젼이 바뀌었을 떄 호출되는 콜백 메소드
    // 버젼이 바뀌었을떄 기존에 설치 운영되고있는 데이터베이스를 어떻게 변경할 것인지 작성
    // 각 버젼의 변경 내용들을 버젼마다 작성해야 함
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("myapp", "MySQLiteOpenHelper onUpgrade 호출 : " + oldVersion + "->" + newVersion);

        String sql = "DROP TABLE mytable";
        db.execSQL(sql);
        onCreate(db);
    }
}
