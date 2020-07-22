package com.quincycheng.cityapp.controller;

import com.quincycheng.cityapp.ConfigProperties;
import com.quincycheng.cityapp.entity.City;
import com.quincycheng.cityapp.entity.Country;
import com.quincycheng.cityapp.repository.CityRepository;
import com.quincycheng.cityapp.repository.CountryLanguageRepository;
import com.quincycheng.cityapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@RefreshScope
@Controller
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryLanguageRepository countryLanguageRepository;

    @Value("${spring.datasource.url}")
    private String dburl;

    @Value("${spring.datasource.username}")
    private String dbusername;

    @Value("${spring.datasource.password}")
    private String dbpassword;

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping("/")
    public String main(Model model) {
        int idx = (int) (Math.random() * cityRepository.count());
        Page<City> cityPage = cityRepository.findAll(PageRequest.of(idx, 1));
        City c = cityPage.getContent().get(0);
        Country country = countryRepository.findById(c.getCountryCode()).get();

        model.addAttribute("city", c.getName());
        model.addAttribute("district", c.getDistrict());
        model.addAttribute("population", c.getPopulation());
        model.addAttribute("country", country.getName());

        model.addAttribute("dburl", this.dburl);
        model.addAttribute("dbusername", this.dbusername);
        model.addAttribute("dbpassword", this.dbpassword);
        return "welcome";
    }
}
