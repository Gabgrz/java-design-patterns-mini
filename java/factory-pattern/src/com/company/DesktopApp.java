package com.company;

public class DesktopApp extends App {
    public DesktopApp() {
        this.hourRate = 90;
        this.programmingLanguage = "Java";
    }
    @Override
    public void develop() {
        System.out.println("Development in IntelliJ");
    }

    @Override
    public void test() {
        System.out.println("Desktop app testing");
    }

    @Override
    public void debug() {
        System.out.println("Desktop app debugging");
    }

    @Override
    public void deliver() {
        System.out.println("Delivered to the Microsoft Store");
    }
}