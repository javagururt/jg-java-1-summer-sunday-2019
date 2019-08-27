package com.javaguru.lessons.homework;

class Animal {

    private String name;
    private String birthday;

    protected void sound() {
        System.out.println("Animal sound..." + name + " ... " + birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
