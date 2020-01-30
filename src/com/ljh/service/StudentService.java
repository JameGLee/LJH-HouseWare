package com.ljh.service;

import com.ljh.pojo.PageInfo;

public interface StudentService {
    PageInfo showPage(String sname,String tname,String pageSizeStr,String pageNumberStr);
}
