package com.company;

public class Main {

    public static void main(String[] args) {
       new Factory().createComplex();
       new Client().Sit(new MagicChair());
    }
}
