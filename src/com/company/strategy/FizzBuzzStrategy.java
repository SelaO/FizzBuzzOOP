package com.company.strategy;

public class FizzBuzzStrategy implements IStrategy {
    @Override
    public String calculate(int i) {
        String str = "";
        if(i % 3 == 0) {
            str += "fizz";
        }
        if(i % 5 == 0) {
            str += "buzz";
        }
        if(str.length() == 0) {
            str = String.valueOf(i);
        }
        return str;
    }
}
