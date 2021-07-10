package com.sam.ms.userinfo.model;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.ToString;
@Data
@ToString
@Component
public class Address implements Serializable {
    private static final long serialVersionUID = -5074054035704940374L;
    private int id;
    private String block;
    private int floor;
    private int unit;
    private String street1;
    private String street2;
    private int postalCode;
}