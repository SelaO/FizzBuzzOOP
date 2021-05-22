package com.company.strategy.condition;

public class DivideByN implements ICondition{

    private final int n;

    public DivideByN(int n) {
        this.n = n;
    }

    @Override
    public boolean match(int i) {
        return i % n == 0;
    }
}
