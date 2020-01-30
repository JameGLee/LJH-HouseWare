package com.ljh.mapper;

import com.ljh.pojo.PageInfo;
import com.ljh.pojo.Student;
import com.ljh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //    List<Student> selBySnameTname(@Param("sname") String sname,@Param("id") int tid);
    List<Student> selByPage(PageInfo pageInfo);
    long selCount();
    long selCountByPageInfo(PageInfo pageInfo);
    List<Student> selAll();
}
