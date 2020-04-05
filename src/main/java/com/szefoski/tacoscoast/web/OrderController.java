package com.szefoski.tacoscoast.web;

import com.szefoski.tacoscoast.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class OrderController {

    @GetMapping("/orders/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PostMapping("/orders")
    public String processOrder(Order order) {
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
