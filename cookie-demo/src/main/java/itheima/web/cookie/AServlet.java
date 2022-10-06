package itheima.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/aServlet")
public class AServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = "张三";
        value = URLEncoder.encode(value, "UTF-8");
        Cookie cookie = new Cookie("username",value);
        System.out.println(value);
        cookie.setMaxAge(60*60*24*7);
        response.addCookie(cookie);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
