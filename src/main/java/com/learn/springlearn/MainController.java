package com.learn.springlearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/SpringLearn")
    @ResponseBody
    public String index() {
        return "TEST";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
