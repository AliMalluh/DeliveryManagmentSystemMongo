package com.springboot.DeliveryManagmentSystemMongo.entity;

import com.springboot.DeliveryManagmentSystemMongo.entity.address.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Order {
    @Id
    private int id;
    private Address senderAddress;
    private Address receiverAddress;
    private String status;
    private String type;
}
