package com.springboot.DeliveryManagmentSystemMongo.entity.address;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class District {
    @NotNull
    private long districtId;
    @NotNull
    private String districtName;
    @NotNull
    private String street;
    @NotNull
    private String zipCode;
}
