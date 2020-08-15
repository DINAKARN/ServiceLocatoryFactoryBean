package com.example.FactoryBean.registry;

import com.example.FactoryBean.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public interface PaymentRegistry {
    PaymentService getService(String servicetype);
}
