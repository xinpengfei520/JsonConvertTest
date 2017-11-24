package com.xpf.jsonconverttest;

/**
 * Created by xpf on 2017/11/13 :)
 * Function:
 */

public class InfoBean {

    /**
     * name : Jack
     * gender : Man
     * age : 23
     * other : tall
     * hobby : basketball
     */

    private String name;
    private String gender;
    private int age;
    private String other;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InfoBean{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", other='" + other + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
