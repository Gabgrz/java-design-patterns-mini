package com.company;

public class FlutterApp extends App {
    public FlutterApp() {
        this.hourRate = 120;
        this.programmingLanguage = "Dart";
    }
    @Override
    public void develop() {
        System.out.println("Development in VS Studio");
    }

    @Override
    public void test() {
        System.out.println("Flutter app testing");
    }

    @Override
    public void debug() {
        System.out.println("Flutter app debugging");
    }

    @Override
    public void deliver() {
        System.out.println("Delivered to the Play Store");
    }
}