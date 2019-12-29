package com.company;

public class WatchApp extends App {
    public WatchApp() {
        this.hourRate = 95;
        this.programmingLanguage = "Fuschia";
    }

    @Override
    public void develop() {
        System.out.println("Development in Android Watch studio");
    }

    @Override
    public void test() {
        System.out.println("Watch app testing");
    }

    @Override
    public void debug() {
        System.out.println("Watch app debugging");
    }

    @Override
    public void deliver() {
        System.out.println("Delivered to the Watch Play Store");
    }
}