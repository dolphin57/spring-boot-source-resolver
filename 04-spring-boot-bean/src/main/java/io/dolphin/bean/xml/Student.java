package io.dolphin.bean.xml;

import java.util.List;

public class Student {
    private String name;

    private Integer age;

    private List<String> classList;

    public Student(String name, Integer age, List<String> classList) {
        this.name = name;
        this.age = age;
        this.classList = classList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getClassList() {
        return classList;
    }

    public void setClassList(List<String> classList) {
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classList=" + String.join(",", classList) +
                '}';
    }
}
