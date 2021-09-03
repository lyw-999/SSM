package cn.hp.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestNumController implements Controller {
    // controller 中有个方法 叫做 模型和视图  意思是把视图和模型绑定到一起

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("我是 模型和视图");
        System.out.println("注意 要写得跟前端的视图名称一样");
        ModelAndView modelAndView = new ModelAndView("test02");

        return modelAndView;
    }
}
