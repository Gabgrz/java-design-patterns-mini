package com.company;

public class BillPughSingleton {

    // This pattern is also known as "Initialization on demand holder".

    private BillPughSingleton(){}

    private static class SingletonHolder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private static BillPughSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        // Object is not created twice
        System.out.println(BillPughSingleton.getInstance().toString());
        System.out.println(BillPughSingleton.getInstance().toString());
    }
}

