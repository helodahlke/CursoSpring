package com.payroll.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import com.payroll.entities.Worker;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);//no postman, fazer requisição com GET para http://localhost:8001/workers/(id do worker)


}
