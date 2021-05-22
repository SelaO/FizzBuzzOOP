package com.company.strategy.condition;

import java.util.List;

public class OrConditions implements ICondition {

    private final List<ICondition> conditions;

    public OrConditions(List<ICondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean match(int i) {
        for (ICondition condition : conditions) {
            if (condition.match(i)) {
                return true;
            }
        }

        return false;
    }
}
