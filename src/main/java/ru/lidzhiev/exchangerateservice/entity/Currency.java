package ru.lidzhiev.exchangerateservice.entity;

import lombok.Data;

import java.util.Map;

@Data
public class Currency {
    private String disclaimer1;
    private String license;
    private int timeStamp;
    private String base;
    private Map<String, Double> rates;
    private Integer integer;
}
