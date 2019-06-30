package com.javaguru.lessons.lesson5;

import java.util.Objects;

class Gun {

    private String model;
    private int bullets;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    void shoot() {
        if (bullets > 0) {
            bullets--;
            System.out.println("Pif-paf");
        } else {
            System.out.println("No ammo");
        }
    }

    void reload() {
        System.out.println("Reloading...");
        bullets = 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gun gun = (Gun) o;
        return bullets == gun.bullets &&
                Objects.equals(model, gun.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, bullets);
    }

    @Override
    public String toString() {
        return "Gun{" +
                "model='" + model + '\'' +
                ", bullets=" + bullets +
                '}';
    }
}
