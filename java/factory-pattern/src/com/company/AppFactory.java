package com.company;

public class AppFactory {

    public static App createApp(GrzAppCatalog.Environment env) {
        App app;
        switch (env) {
            case ANDROID:
                app = new AndroidApp();
                break;
            case IOS:
                app = new iOSApp();
                break;
            case DESKTOP:
                app = new DesktopApp();
                break;
            case WATCH:
                app = new WatchApp();
                break;
            default:
                app = new FlutterApp();
        }
        return app;
    }
}