package com.lec.android.aaa;

import java.io.Serializable;

// 전화번호부 데이터를 담을 클래스
public class Profile implements Serializable {
    String name; // 이름
    int age; // 전화번호
    String address; // 이메일

    public Profile(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Profile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
} // end Phonebook
