package cn.com.ning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// servlet的生命周期
            //1，从第一次调用到服务器关闭
            //2，如果servlet在web.xml中配置了load-on-startup,则生命周期为启动服务器到关闭服务器
public class MyServlet2 extends HttpServlet {
    //servlet加载进内存的时候只执行一次  是对servlet进行初始化
    @Override
    public void init() throws ServletException {
        System.out.println("servlet初始化完成");
    }
    //真正处理请求的方法
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("servlet life");
        System.out.println("servlet life");
    }

    @Override
    public void destroy() {
        System.out.println("我被销毁了");
    }
}
