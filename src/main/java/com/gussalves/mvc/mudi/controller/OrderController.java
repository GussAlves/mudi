package com.gussalves.mvc.mudi.controller;

import com.gussalves.mvc.mudi.dto.NewProductOrderForm;
import com.gussalves.mvc.mudi.model.ProductOrder;
import com.gussalves.mvc.mudi.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private ProductOrderRepository orderRepository;

    @RequestMapping("form")
    public String newOrder(NewProductOrderForm newProductOrderForm) {
        return "order/form";
    }

    @PostMapping("new")
    public String saveNewOrder(@Valid NewProductOrderForm newProductOrderForm, BindingResult result) {

        if (result.hasErrors())
            return "order/form";

        ProductOrder productOrder = newProductOrderForm.toOrder();
        orderRepository.save(productOrder);
        return "order/form";
    }
}