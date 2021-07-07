package com.sam.ms.userinfo.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
    private String block;
    private String floor;
    private String unit;
    private String street1;
    private String street2;
    private String postalCode;
}
