package com.company;

public class GrzAppCatalog {

    enum Environment {
        ANDROID, IOS, DESKTOP, WATCH, FLUTTER, HOLA};

    public void orderApp(Environment env){
        final App app = AppFactory.createApp(env);
        app.develop();
        app.test();
        app.debug();
        app.deliver();
    }

    public static void main(String[] args) {
        new GrzAppCatalog().orderApp(Environment.ANDROID);
        new GrzAppCatalog().orderApp(Environment.IOS);
        new GrzAppCatalog().orderApp(Environment.DESKTOP);
        new GrzAppCatalog().orderApp(Environment.HOLA);
    }
}