package com.example.beansdemo1.configuration;

import com.example.beansdemo1.service.CarVehicleService;
import com.example.beansdemo1.service.PlaneVehicleService;
import com.example.beansdemo1.service.VehicleService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


    @Configuration
    public class VehicleConfiguration {
        @Bean
        //@Qualifier("carVehicleServiceConfiguration")
        @ConditionalOnProperty(value = "vehicle.service.mode",havingValue = "car",matchIfMissing = false)
        public VehicleService carVehicleServiceConfiguration(){
            return new CarVehicleService();
        }
        @Bean
        //@Primary
        //@Qualifier("planeVehicleServiceConfiguration")
        @ConditionalOnProperty(value = "vehicle.service.mode",havingValue = "plane",matchIfMissing = false)
        public VehicleService planeVehicleServiceConfiguration(){
            return new PlaneVehicleService();
        }
    }







