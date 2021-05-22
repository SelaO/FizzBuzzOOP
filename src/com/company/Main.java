package com.company;

import com.company.output.ConsoleOutputProvider;
import com.company.output.EmailOutputProvider;
import com.company.strategy.FizzBuzzStrategy;
import com.company.strategy.Rule;
import com.company.strategy.RuleBasedStrategy;
import com.company.strategy.condition.AndConditions;
import com.company.strategy.condition.DivideByN;
import com.company.strategy.condition.EndsWithN;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        List<Rule> rules = new ArrayList<>();
        rules.add(new Rule(new DivideByN(3), "foo"));
        rules.add(new Rule(new EndsWithN(String.valueOf(5)), "bar"));



        RuleBasedStrategy ruleBasedStrategy = new RuleBasedStrategy(rules);

        players.add(new Player("p1", new ConsoleOutputProvider(), ruleBasedStrategy));
        players.add(new Player("p2", new EmailOutputProvider(), new FizzBuzzStrategy()));

        Game game = new Game(players, 100);
        game.start();
    }

}
