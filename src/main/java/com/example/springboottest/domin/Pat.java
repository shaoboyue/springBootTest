package com.example.springboottest.domin;

public class Pat {
    private String name;
    private String otherName;
    private Integer age;

    public Pat() {
    }

    public Pat(String name, String otherName, Integer age) {
        this.name = name;
        this.otherName = otherName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pat{" +
                "name='" + name + '\'' +
                ", otherName='" + otherName + '\'' +
                ", age=" + age +
                '}';
    }
}
