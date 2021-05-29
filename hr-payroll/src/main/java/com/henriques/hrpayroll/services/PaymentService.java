package com.henriques.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.henriques.hrpayroll.entities.Payment;
import com.henriques.hrpayroll.entities.Worker;


@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workerId, int days) {
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("id", String.valueOf(workerId));
		StringBuilder URL = new StringBuilder();
		URL = URL.append(workerHost).append("/workers/{id}");
		Worker worker = restTemplate.getForObject(URL.toString(), Worker.class, uriVariable);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
