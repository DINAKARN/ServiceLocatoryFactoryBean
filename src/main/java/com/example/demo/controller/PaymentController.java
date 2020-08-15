package com.example.demo.controller;

import com.example.demo.model.Payment;
import com.example.demo.registry.PaymentRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PaymentController {


    private final PaymentRegistry paymentRegistry;

    @Autowired
    public PaymentController(PaymentRegistry paymentRegistry) {
        this.paymentRegistry = paymentRegistry;
    }

    @PostMapping("/do")
    public void doPayment(@RequestBody Payment payment) {
        paymentRegistry.getService(payment.getPaymentType()).paymentDoing(payment.getAmount());
    }

    @GetMapping("/check")
    public String doStatus() {
        return "Working";
    }
}
