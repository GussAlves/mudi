package com.gussalves.mvc.mudi.controller;

import com.gussalves.mvc.mudi.model.ProductOrder;
import com.gussalves.mvc.mudi.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductOrderRepository productOrderRepository;

    @GetMapping("/home")
    public String home(Model model) {

        Iterable<ProductOrder> productOrders = productOrderRepository.findAll();
        model.addAttribute("orders", productOrders);

        return "home";
    }
}
