package com.hansonwang99.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hansonwang on 2017/6/2.
 */
@Controller
public class IndexController {

    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }

    @RequestMapping(value="/layout",method= RequestMethod.GET)
    public String layout(Model model) {
        return "layout";
    }

    @RequestMapping(value="/collector",method= RequestMethod.GET)
    public String collector(Model model) {
        return "collector";
    }

    @RequestMapping(value="/home",method= RequestMethod.GET)
    public String home(Model model) {
        return "home";
    }

    @RequestMapping(value="/main",method= RequestMethod.GET)
    public String main(Model model) {
        return "main";
    }

    @RequestMapping(value="/post",method= RequestMethod.GET)
    public String post(Model model) {
        return "post";
    }

    @RequestMapping(value="/write",method= RequestMethod.GET)
    public String write(Model model) {
        return "write";
    }
}
