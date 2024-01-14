package com.serenitydojo;

public class Dog {
    private String name;
    private String favouriteToy;
    private int age;
    private boolean isFed;
    private static String DOG_NOISE = "Woof";



    public String getName() {
        return name;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }

    public void feed() {
        this.isFed = true;
    }

    public boolean isFed() {
        return this.isFed;
    }

    public Dog(String name, String favouriteToy, int age) {
        this.name = name;
        this.favouriteToy = favouriteToy;
        this.age = age;
    }
}