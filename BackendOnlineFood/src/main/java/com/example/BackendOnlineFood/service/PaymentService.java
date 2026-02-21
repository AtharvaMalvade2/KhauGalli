package com.example.BackendOnlineFood.service;

import com.stripe.exception.StripeException;
import com.example.BackendOnlineFood.model.Order;
import com.example.BackendOnlineFood.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
