package com.company;

public abstract class App {

    public String programmingLanguage;
    public int hourRate;

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public int getHourRate() {
        return hourRate;
    }

    abstract public void develop();
    abstract public void test();
    abstract public void debug();
    abstract public void deliver();
}
