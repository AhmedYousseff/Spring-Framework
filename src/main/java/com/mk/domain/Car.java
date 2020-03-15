package main.java.com.mk.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private BigDecimal price;
}
