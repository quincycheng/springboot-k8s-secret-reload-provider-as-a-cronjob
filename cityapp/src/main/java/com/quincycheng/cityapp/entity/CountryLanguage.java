package com.quincycheng.cityapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CountryLanguage {
    @Id
    private String countryCode;
    private String language;
    private boolean isOfficial;
    private float percentage;

}
