package com.ioverlap.dojo.consumingrest.entity;

import com.fasterxml.jackson.databind.JsonNode;

public class CountryByName {

    private String name;

    private JsonNode country;

    public CountryByName() {
    }

    public CountryByName(String name, JsonNode country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonNode getCountry() {
        return country;
    }

    public void setCountry(JsonNode country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryByName{" +
                "name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}