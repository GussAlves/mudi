package com.gussalves.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

    @RequestMapping("/form")
    public String newOrder() {
        return "order/form";
    }

    @PostMapping("/new")
    public String saveNewOrder() {
        return "home";
    }

}
