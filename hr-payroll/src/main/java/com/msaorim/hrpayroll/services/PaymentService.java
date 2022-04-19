package com.msaorim.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msaorim.hrpayroll.feignclients.WorkerFeignClient;
import com.msaorim.hrpayroll.model.Payment;
import com.msaorim.hrpayroll.model.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient wfc;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = wfc.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
