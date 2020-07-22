package com.quincycheng.cityapp.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class City {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @Column(name="countrycode")
    private String countryCode;
    private String district;
    private int population;

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getDistrict() {
        return district;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
