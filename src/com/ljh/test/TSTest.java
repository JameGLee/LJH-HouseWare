package com.ljh.test;

import com.ljh.mapper.StudentMapper;
import com.ljh.mapper.TeacherMapper;
import com.ljh.pojo.PageInfo;
import com.ljh.pojo.Student;
import com.ljh.pojo.Teacher;
import com.ljh.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TSTest {

    public static void main(String[] args) {
        PageInfo pageInfo = new PageInfo();
        SqlSession session = MyBatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        List<Student> studentList = mapper.selBySnameTname("学生1", 1);
//        for (Student student : studentList) {
//            System.out.println(student.toString());
//        }
//        long index = mapper.selCount();
//        System.out.println("总数"+index);
//        List<Student> studentList =  mapper.selAll();
//        for (Student student :
//                studentList) {
//            System.out.println(student.toString());
//        }
        TeacherMapper mapper1 = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper1.selById(1);
        System.out.println(teacher.toString());
    }
}
