package com.ljh.mapper;

import com.ljh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher selById(@Param("id") int id);
}
