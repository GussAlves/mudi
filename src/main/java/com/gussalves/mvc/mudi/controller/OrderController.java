package com.gussalves.mvc.mudi.controller;

import com.gussalves.mvc.mudi.dto.NewProductOrderForm;
import com.gussalves.mvc.mudi.model.ProductOrder;
import com.gussalves.mvc.mudi.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private ProductOrderRepository orderRepository;

    @RequestMapping("form")
    public String newOrder() {
        return "order/form";
    }

    @PostMapping("new")
    public String saveNewOrder(NewProductOrderForm newProductOrderForm) {
        ProductOrder produtoOrder = newProductOrderForm.toOrder();
        orderRepository.save(produtoOrder);
        return "order/form";
    }
}