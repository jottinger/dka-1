package com.autumncode.dka1;

import java.io.PrintWriter;

public class BasicDKA implements DKA {
    private final PrintWriter writer;

    public BasicDKA(PrintWriter writer) {
        this.writer = writer;
    }

    @Override
    public void doSomething() {
        writer.println("Hello");
    }
}
