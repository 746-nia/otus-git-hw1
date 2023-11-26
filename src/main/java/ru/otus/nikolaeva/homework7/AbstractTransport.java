package ru.otus.nikolaeva.homework7;

public abstract class AbstractTransport implements Transport {
private Human driver;

    public Human getDriver() {

        return this.driver;
    }

    public void setDriver(Human human) {

        this.driver = human;
    }
}
