package com.company;

public class iOSApp extends App{
    public iOSApp(){
        this.hourRate = 150;
        this.programmingLanguage = "Swift";
    }
    @Override
    public void develop() {
        System.out.println("Development in Apple Studio");
    }

    @Override
    public void test() {
        System.out.println("iOS app testing");
    }

    @Override
    public void debug() {
        System.out.println("iOS app debugging");
    }

    @Override
    public void deliver() {
        System.out.println("Delivered to the Apple store");
    }
}
