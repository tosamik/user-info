package com.sam.ms.userinfo.model;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Addresses implements Serializable {
    private static final long serialVersionUID = -4165929806212460337L;
    private List<Address> addresses;
}
