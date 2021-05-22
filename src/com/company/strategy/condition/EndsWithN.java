package com.company.strategy.condition;

public class EndsWithN implements ICondition {

    private final String n;

    public EndsWithN(String n) {
        this.n = n;
    }

    @Override
    public boolean match(int i) {
        return String.valueOf(i).endsWith(n);
    }


}
