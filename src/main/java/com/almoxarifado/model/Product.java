package com.almoxarifado.model;

public class Product {
    public String name;
    public int code;
    public String price_unit;
    public String description;
    public String validity;
    public String quantity;
    public String overall_price;

    public Product(String name, int code, String price_unit, String description, String validity, String quantity,
            String overall_price) {
        this.name = name;
        this.code = code;
        this.price_unit = price_unit;
        this.description = description;
        this.validity = validity;
        this.quantity = quantity;
        this.overall_price = overall_price;
    }

    public Product() {
    }

}