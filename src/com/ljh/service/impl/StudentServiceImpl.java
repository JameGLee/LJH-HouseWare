package com.ljh.service.impl;

import com.ljh.mapper.StudentMapper;
import com.ljh.mapper.TeacherMapper;
import com.ljh.pojo.PageInfo;
import com.ljh.pojo.Student;
import com.ljh.pojo.Teacher;
import com.ljh.service.StudentService;
import com.ljh.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public PageInfo showPage(String sname, String tname, String pageSizeStr, String pageNumberStr) {
        int pageSize = 2;
        if (pageNumberStr!=null && !pageNumberStr.equals("")){
            pageSize = Integer.parseInt(pageNumberStr);
        }
        int pageNumber = 1;
        if (pageNumberStr!=null && !pageNumberStr.equals("")){
            pageNumber = Integer.parseInt(pageNumberStr);
        }
        SqlSession session = MyBatisUtil.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageNumber(pageNumber);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageStart((pageNumber-1)*pageSize);
        pageInfo.setS_name(sname);
        pageInfo.setT_name(tname);
        List<Student> studentList = studentMapper.selByPage(pageInfo);
        TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
        for (Student student :
                studentList) {
            student.setTeacher(teacherMapper.selById(student.getTid()));
        }
        pageInfo.setList(studentList);

        long count = studentMapper.selCount();
        pageInfo.setTotal(count%pageSize==0?count/pageSize:count/pageSize+1);
        
        return pageInfo;

    }
}
