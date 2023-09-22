package io.dolphin.bean.xml;

public class StudentService {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String hello() {
        return student.toString();
    }
}
