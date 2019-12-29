package com.company;

public class AndroidApp extends App {
    public AndroidApp(){
        this.hourRate = 100;
        this.programmingLanguage = "Kotlin";
    }

    @Override
    public void develop() {
        System.out.println("Development in Android Studio");
    }

    @Override
    public void test() {
        System.out.println("Android app testing");
    }

    @Override
    public void debug() {
        System.out.println("Android app debugging");
    }

    @Override
    public void deliver() {
        System.out.println("Delivered to the Play Store");
    }
}
