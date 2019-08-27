package com.javaguru.lessons.homework;

class Dog extends Mammal {

    private double weight;

    @Override
    protected void sound() {
        System.out.println("vaf-vaf");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
