package cn.com.ning;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/* service()和doGet()和doPost()方法的区别
 service()既能处理get请求又能处理post请求，如果servlet中有service方法，会执行service()
doGet()只能处理get请求
doPost()只能处理post请求
三个方法同时存在的情况下 首先执行srvice()
*/

public class MyServletMethod extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是service");
        super.service(request,response);
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("我是doGet方法");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("我是doPost方法");
//    }


}
