package com.company;

public class Factory implements AbstractComplexFactory{
    @Override
    public void complexNumber(float real, float image) {
        System.out.println("z="+real+"+"+image+"i");
    }

    @Override
    public void createComplex() {

        complexNumber(5,5);
    }
}
