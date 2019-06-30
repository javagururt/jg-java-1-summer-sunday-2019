package com.javaguru.lessons.lesson5;

import java.util.Objects;

class Farmer {

    private String name;
    private Gun gun;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    void shoot() {
        if (gun.getBullets() == 0) {
            gun.reload();
        }
        gun.shoot();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmer farmer = (Farmer) o;
        return Objects.equals(name, farmer.name) &&
                Objects.equals(gun, farmer.gun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gun);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", gun=" + gun +
                '}';
    }
}
