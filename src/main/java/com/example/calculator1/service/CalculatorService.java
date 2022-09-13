package com.example.calculator1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInt{
    @Override
    public int plus(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public int multiple(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if(b==0) throw new IllegalArgumentException("Значение b неверно");
        return (double)a/b;
    }
}
