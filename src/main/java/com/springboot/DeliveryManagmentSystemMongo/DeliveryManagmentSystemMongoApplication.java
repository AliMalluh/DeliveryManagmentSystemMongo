package com.springboot.DeliveryManagmentSystemMongo;

import com.springboot.DeliveryManagmentSystemMongo.Repo.OrderRepo;
import com.springboot.DeliveryManagmentSystemMongo.entity.Order;
import com.springboot.DeliveryManagmentSystemMongo.entity.address.Address;
import com.springboot.DeliveryManagmentSystemMongo.entity.address.District;
import com.springboot.DeliveryManagmentSystemMongo.entity.address.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeliveryManagmentSystemMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryManagmentSystemMongoApplication.class, args);
	}
}
