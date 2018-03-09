package com.cloud_book.book.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/")
    public ModelAndView getText(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cloud-native-java-");
        return modelAndView;
    }

}
