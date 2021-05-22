package com.company.strategy;

import com.company.strategy.condition.ICondition;

public class Rule {

    private ICondition condition;
    private String result;

    public Rule(ICondition condition, String result) {
        this.condition = condition;
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public ICondition getCondition() {
        return condition;
    }
}
