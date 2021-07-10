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
    private List<Address> addresses;
}
