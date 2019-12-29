package com.company;

public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    private SimpleSingleton(){}

    public static SimpleSingleton getInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
            System.out.println("Created Singleton instance");
        }
        else{
            System.out.println("Unable to create new Single instance as there's already one");
        }
        return instance;
    }

    public static void main(String[] args) {
        SimpleSingleton kubernetesMaster = SimpleSingleton.getInstance();
        SimpleSingleton kubernetesMaster2 = SimpleSingleton.getInstance();
    }
}