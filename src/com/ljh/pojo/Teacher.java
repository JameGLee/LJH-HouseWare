package com.ljh.pojo;

public class Teacher {
    private int id;
    private String t_name;

    public Teacher() {
    }

    public Teacher(int id, String t_name) {
        this.id = id;
        this.t_name = t_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", t_name='" + t_name + '\'' +
                '}';
    }
}
