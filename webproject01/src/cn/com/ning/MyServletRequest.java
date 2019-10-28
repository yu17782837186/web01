package cn.com.ning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
request对象：
    作用：request对象中封存了当前请求的所有请求信息
    使用：
        获取请求头数据
        获取请求行数据
        获取用户数据
    request对象由tomcat服务器创建，并作为实参传递给处理请求的servlet的service方法
*/
public class MyServletRequest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头数据
        String str = request.getMethod();
        System.out.println(str);
        //获取请求url
        StringBuffer str2 = request.getRequestURL();
        System.out.println(str2);
        String str3 = request.getRequestURI();
        System.out.println(str3);
        //获取协议
        String str4 = request.getScheme();
        System.out.println(str4);

        //获取请求行数据
        //获取指定的请求行信息
        String str5 = request.getHeader("aaa");
        System.out.println(str5);

        //获取所有的请求行的键的枚举
        Enumeration<String> str6 = request.getHeaderNames();
        while(str6.hasMoreElements()){
            String name = str6.nextElement();//获取键
            String value = request.getHeader(name);//通过键获取值
            System.out.println(name+":"+value);
//            System.out.println(str6.nextElement());
        }

        //获取用户数据
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        System.out.println(uname+":"+pwd);
//        String fav = request.getParameter("fav");//同键不同值不能用getParameter()来获取
//        System.out.println(fav);
        String[] favs = request.getParameterValues("fav");//同键不同值的获取方式
        for (String fav:favs) {
            System.out.println(fav);
        }
    }
}
