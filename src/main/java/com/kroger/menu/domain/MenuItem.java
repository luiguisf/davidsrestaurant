package com.kroger.menu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuItem {

    @JsonProperty("id")
    private int id;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("price_small")
    private Double priceSmall;
    @JsonProperty("price_large")
    private Double priceLarge;
    @JsonProperty("small_portion_name")
    private String smallPortionName;
    @JsonProperty("large_portion_name")
    private String largePortionName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPriceSmall() {
        return priceSmall;
    }

    public void setPriceSmall(Double priceSmall) {
        this.priceSmall = priceSmall;
    }

    public Double getPriceLarge() {
        return priceLarge;
    }

    public void setPriceLarge(Double priceLarge) {
        this.priceLarge = priceLarge;
    }

    public String getSmallPortionName() {
        return smallPortionName;
    }

    public void setSmallPortionName(String smallPortionName) {
        this.smallPortionName = smallPortionName;
    }

    public String getLargePortionName() {
        return largePortionName;
    }

    public void setLargePortionName(String largePortionName) {
        this.largePortionName = largePortionName;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
