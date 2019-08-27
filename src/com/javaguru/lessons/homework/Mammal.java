package com.javaguru.lessons.homework;

class Mammal extends Animal {

    public int countOfKids;
    protected String breed;
    private String color;

    @Override
    protected void sound() {
        System.out.println("Mammal sound !!!!");
        System.out.println(this.getName());
        System.out.println(this.getBirthday());
        System.out.println("Mammal breed: " + breed + " mammal color: " + color + " kids: " + countOfKids);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
