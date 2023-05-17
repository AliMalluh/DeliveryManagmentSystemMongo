package com.springboot.DeliveryManagmentSystemMongo.Controller;

import com.springboot.DeliveryManagmentSystemMongo.Repo.OrderRepo;
import com.springboot.DeliveryManagmentSystemMongo.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepo repo;


        @PostMapping
        public Order addProduct(@RequestBody Order order) {
            return repo.save(order);
        }

        @GetMapping
        public List<Order> getProduct() {
            return repo.findAll();
        }


}
