package com.haki.thymeleaf.controller;


import com.haki.thymeleaf.pojo.Author;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping
@Controller
public class ThymeleafController {
    @GetMapping("index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        //设置页面地址，src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        view.addObject("title", "我的第一个页面");
        view.addObject("desc", "hello springboot");
        Author author = Author.builder()
                .age(12)
                .build();

        view.addObject("author", author);
        return view;
    }
}
