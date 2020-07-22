package com.quincycheng.cityapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Country {
    @Id
    private String code;
    private String name;
//    private String continent;
//    private String region;
//    private float surfaceArea;
//    private int indepYear;
//    private int population;
//    private float lifeExpectancy;
//    private float gnp;
//    private float gnpoid;
//    private String localName;
//    private String governmentForm;
//    private String headOfState;
//    private int capitial;
//    private String code2;

    public String getName() {
        return name;
    }
}
