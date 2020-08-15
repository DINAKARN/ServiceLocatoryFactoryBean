package com.example.demo.serviceImpl;

import com.example.demo.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("PhonePay")
public class PaymentServicePP implements PaymentService {
    @Override
    public void paymentDoing(int val) {
        System.out.println("PaymentSerive through Phone Pay " + val+" is successfull");
    }
}
