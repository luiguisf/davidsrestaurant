package com.kroger.menu.domain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuService {
    private List<MenuItem> menu;

    public void pupulate(List<MenuItem> menu) {
        this.menu = Collections.unmodifiableList(menu);
    }


    public Menu searchByCategory(String category) {

        List<MenuItem> menuItems = menu.stream().filter(m -> m.getShortName().startsWith(category)).collect(Collectors.toList());

        Menu m = new Menu();
        m.setMenuItems(menuItems);

        return m;
    }

}
