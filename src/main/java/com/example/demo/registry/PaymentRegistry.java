package com.example.demo.registry;

import com.example.demo.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public interface PaymentRegistry {
    PaymentService getService(String servicetype);
}
