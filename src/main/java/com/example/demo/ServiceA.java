package com.example.demo;

import org.springframework.stereotype.Service;

// пример циклической зависимости
@Service
public class ServiceA {
    
    private ServiceB serviceB;
   
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
