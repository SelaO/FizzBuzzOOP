package com.company.strategy;

public class FooBarStrategy implements IStrategy {
    @Override
    public String calculate(int i) {
        String str = "";
        if(i % 3 == 0) {
            str += "foo";
        }
        if(String.valueOf(i).endsWith("5")) {
            str += "bar";
        }
        if(str.length() == 0) {
            str = String.valueOf(i);
        }
        return str;
    }
}
