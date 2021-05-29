package com.henriques.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriques.hrpayroll.entities.Payment;
import com.henriques.hrpayroll.entities.Worker;
import com.henriques.hrpayroll.feignclients.WorkerFeignClient;


@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeignClient.findByID(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
