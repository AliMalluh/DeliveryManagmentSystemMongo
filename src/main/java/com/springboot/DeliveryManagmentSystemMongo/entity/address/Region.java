package com.springboot.DeliveryManagmentSystemMongo.entity.address;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    @NotNull
    private long regionId;
    @NotNull
    private String regionName;
}
