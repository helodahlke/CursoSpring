package com.payroll.services;


import com.payroll.entities.Payment;
import com.payroll.entities.Worker;
//import javafx.concurrent.Worker;
import com.payroll.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {


    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        Payment pay = new Payment();
        pay.setName(worker.getName());
        pay.setDailyIncome(worker.getDailyIncome());
        pay.setDays(days);
        return pay;
    }
}
