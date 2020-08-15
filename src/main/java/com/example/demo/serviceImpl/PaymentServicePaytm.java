package com.example.demo.serviceImpl;

import com.example.demo.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("Paytm")
public class PaymentServicePaytm implements PaymentService {
    @Override
    public void paymentDoing(int val) {
        System.out.println("PaymentSerive through Paytm" + val+" is successfull");
    }
}
