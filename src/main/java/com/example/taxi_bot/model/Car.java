package com.example.taxi_bot.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Car {

    @Id
    private int id;

    private String carType;

    private int tariff;

}
