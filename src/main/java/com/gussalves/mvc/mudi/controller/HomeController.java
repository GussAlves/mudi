package com.gussalves.mvc.mudi.controller;

import com.gussalves.mvc.mudi.model.ProductOrder;
import com.gussalves.mvc.mudi.model.ProductStatus;
import com.gussalves.mvc.mudi.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ProductOrderRepository productOrderRepository;

    @GetMapping
    public String home(Model model) {
        Iterable<ProductOrder> productOrders = productOrderRepository.findAll();
        model.addAttribute("orders", productOrders);
        return "home";
    }

    //Method receives parameter entered by user and returns list of selected status
    @GetMapping("/{status}")
    public String forStatus(@PathVariable("status") String status, Model model) {
        Iterable<ProductOrder> productOrders = productOrderRepository.findByStatus(ProductStatus.valueOf(status.toUpperCase(Locale.ROOT)));
        model.addAttribute("orders", productOrders);
        model.addAttribute("status", status);
        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/home";
    }
}