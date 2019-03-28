package com.kroger.menu.controllers;

import com.kroger.menu.domain.Menu;
import com.kroger.menu.domain.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/menu_items.json")
    public Menu menu(@RequestParam("category") String category) {

        return this.menuService.searchByCategory(category);

    }
}
