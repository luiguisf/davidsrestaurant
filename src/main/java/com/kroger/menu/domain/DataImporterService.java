package com.kroger.menu.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataImporterService {

    private String davidsEndpoint;
    private RestTemplate restTemplate;
    private MenuService menuService;



    public DataImporterService(@Value("${davidsrestaurant.menu.endpoint}") String davidsEndpoint,
                               MenuService menuService) {
        this.davidsEndpoint = davidsEndpoint;
        this.menuService = menuService;
        this.restTemplate = new RestTemplate();
    }

    public void importMenu() {
        Menu menu = restTemplate.getForObject(davidsEndpoint, Menu.class);
        menuService.pupulate(menu.getMenuItems());
    }

}
