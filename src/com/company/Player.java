package com.company;

import com.company.output.IOutputProvider;
import com.company.strategy.IStrategy;

import java.text.MessageFormat;

public class Player {

    private String name;
    private IOutputProvider outputProvider;
    private IStrategy strategy;

    public Player(String name, IOutputProvider outputProvider, IStrategy strategy) {
        this.name = name;
        this.outputProvider = outputProvider;
        this.strategy = strategy;
    }

    void play(int i) {
        String value = strategy.calculate(i);
        outputProvider.print(MessageFormat.format(" {0} {1}", name, value));
    }
}
