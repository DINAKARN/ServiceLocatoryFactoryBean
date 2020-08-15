package com.example.FactoryBean.serviceImpl;

import com.example.FactoryBean.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("PhonePay")
public class PaymentServicePP implements PaymentService {
    @Override
    public void paymentDoing(int val) {
        System.out.println("PaymentSerive through Phone Pay " + val+" is successfull");
    }
}
