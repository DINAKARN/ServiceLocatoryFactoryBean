package com.example.FactoryBean.serviceImpl;

import com.example.FactoryBean.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("GooglePay")
public class PaymentServiceGP implements PaymentService {

    @Override
    public void paymentDoing(int val) {
        System.out.println("PaymentSerive through  Google Pay " + val + " is successfull");
    }
}
