package com.example.beansdemo1;

import com.example.beansdemo1.service.VehicleTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Beansdemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Beansdemo1Application.class, args);
		VehicleTestService vehicleTestService= context.getBean(VehicleTestService.class);
		vehicleTestService.testvehicle();
	}

}
