package com.company.strategy;

import java.util.List;

public class RuleBasedStrategy implements IStrategy {

    private final List<Rule> conditionsResultsPairs;

    public RuleBasedStrategy(List<Rule> conditionsResultsPairs) {
        this.conditionsResultsPairs = conditionsResultsPairs;
    }

    @Override
    public String calculate(int i) {
        StringBuilder result = new StringBuilder();
        for (Rule rule : conditionsResultsPairs) {
            if (rule.getCondition().match(i)) {
                result.append(rule.getResult());
            }
        }

        return result.isEmpty() ? String.valueOf(i) : result.toString();
    }
}
