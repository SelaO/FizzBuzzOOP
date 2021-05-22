package com.company.strategy.condition;

import java.util.List;

public class AndConditions implements ICondition {

    private final List<ICondition> conditions;

    public AndConditions(List<ICondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean match(int i) {
        for (ICondition condition : conditions) {
            if (!condition.match(i)) {
                return false;
            }
        }

        return true;
    }
}
