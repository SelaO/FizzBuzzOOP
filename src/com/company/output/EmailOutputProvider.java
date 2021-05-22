package com.company.output;

import java.text.MessageFormat;

public class EmailOutputProvider implements IOutputProvider{
    @Override
    public void print(String str) {
        System.out.println(MessageFormat.format("email {0}", str));
    }
}
