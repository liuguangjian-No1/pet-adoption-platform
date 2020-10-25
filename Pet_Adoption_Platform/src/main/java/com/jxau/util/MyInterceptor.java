package com.jxau.util;

import com.jxau.entity.Admin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {

    /**
     * 在前端控制器执行之前执行，会返回boolean值，当false使就不往下执行了
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle方法执行");

        String requestUri = request.getRequestURI();

        if (requestUri.contains("/*.action")) {
            System.out.println("22222222222222222222222222");
            System.out.println("requestUri=    "+requestUri);

            return true;
        }
        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("admin");
        //Admin admin = (Admin) request.getSession().getAttribute("admin");
        System.out.println("admin-------------"+admin);
        if(requestUri.contains("/animal/admin/*.jsp")){
            System.out.println("2222222 requestUri---------"+requestUri);
            if (admin != null) {
                return true;
            }else{
                request.setAttribute("msg", "你还没有登录，请先登录！");
                //response.sendRedirect("animal/admin/login.jsp");
                request.getRequestDispatcher("/animal/admin/login.jsp").forward(request, response);
                return false;
            }
        }
       return false;
    }

    /**
     * 在前端控制器执行之后执行,到视图解析器
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("PostHandle 方法执行");
    }

    /**
     * 当请求完成以后执行，一般进行资源的销毁
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion 方法执行");
    }
}
