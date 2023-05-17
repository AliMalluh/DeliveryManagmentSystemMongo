package com.springboot.DeliveryManagmentSystemMongo.Repo;

import com.springboot.DeliveryManagmentSystemMongo.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepo extends MongoRepository<Order, Integer> {
}
