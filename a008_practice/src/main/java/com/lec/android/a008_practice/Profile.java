package com.lec.android.a008_practice;

public class Profile {
    String name;
    String age;
    String address;

    public Profile() {
    }

    public Profile(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {  return name;  }
    public void setName(String name) {  this.name = name;  }
    public String getAge() {  return age;  }
    public void setAge(String age) { this.age = age;  }
    public String getAddress() {  return address;  }
    public void setAddress(String address) {  this.address = address;  }
}// end Profile
