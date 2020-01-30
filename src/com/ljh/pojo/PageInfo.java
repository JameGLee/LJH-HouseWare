package com.ljh.pojo;

import java.util.List;

public class PageInfo {
    private int pageSize;
    private int pageNumber;
    private long total;
    private int pageStart;
    private List<?> list;
    private String s_name;//学生姓名
    private String t_name;//老师姓名

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public PageInfo() {
    }

    public PageInfo(int pageSize, int pageNumber, long total, List<?> list, String s_name, String t_name) {

        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.total = total;
        this.list = list;
        this.s_name = s_name;
        this.t_name = t_name;
    }
}
