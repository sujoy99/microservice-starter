package com.starter.ps.api.service;

import com.starter.ps.api.entity.Payment;
import com.starter.ps.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    private String paymentProcessing() {
        //api should be 3rd party payment gateway (paypal,paytm...)
        return new Random().nextBoolean() ? "success" : "false";
    }
}
