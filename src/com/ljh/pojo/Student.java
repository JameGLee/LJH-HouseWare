package com.ljh.pojo;

public class Student {
    private int id;
    private String s_name;
    private int s_age;
    private int tid;
    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", s_name='" + s_name + '\'' +
                ", s_age=" + s_age +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public Student() {
    }

    public Student(int id, String s_name, int s_age, int tid) {
        this.id = id;
        this.s_name = s_name;
        this.s_age = s_age;
        this.tid = tid;
    }
}
