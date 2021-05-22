package com.company.output;

import java.text.MessageFormat;

public class ConsoleOutputProvider implements IOutputProvider {
    @Override
    public void print(String str) {
        System.out.println(MessageFormat.format("console {0}", str));
    }
}
