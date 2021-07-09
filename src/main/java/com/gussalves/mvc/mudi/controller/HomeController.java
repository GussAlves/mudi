package com.gussalves.mvc.mudi.controller;

import com.gussalves.mvc.mudi.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Order order = new Order();
        order.setProductName("PlayStation DualSense Wireless Controller – Cosmic Red");
        order.setProductPrice(new BigDecimal("398.95"));
        order.setProductUrl("https://www.amazon.com/-/pt/dp/B094WN6SY2/ref=sr_1_4?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=controller+ps5&qid=1625852596&sr=8-4");
        order.setProductDescription("any description..");
        order.setProductImage("https://images-na.ssl-images-amazon.com/images/I/61t7877TYES._SL1464_.jpg");

        List<Order> orders = Arrays.asList(order);
        model.addAttribute("orders", orders);

        return "home";
    }
}
