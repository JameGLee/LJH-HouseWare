package com.ljh.servlet;

import com.ljh.pojo.PageInfo;
import com.ljh.service.StudentService;
import com.ljh.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    StudentService studentService = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sname = req.getParameter("sname");
        if (sname!=null && !sname.equals("")){
            sname = new String(sname.getBytes("iso-8859-1"),"utf-8");
        }
        String tname = req.getParameter("tname");
        if (tname!=null && !tname.equals("")){
            tname = new String(tname.getBytes("iso-8859-1"),"utf-8");

        }
        String pageSizeStr = req.getParameter("pageSizeStr");
        String pageNumberStr = req.getParameter("pageNumberStr");
        PageInfo pageInfo = studentService.showPage(sname, tname, pageSizeStr, pageNumberStr);
        req.setAttribute("pageInfo",pageInfo);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
