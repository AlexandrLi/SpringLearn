package com.epam.ali.spring.model;

public class ModelT1000 extends BaseModel {
    private String color;
    private int year;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String color, int year) {
        super(head, hand, leg);
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
    }

    public void init() {
        System.out.println("Init T1000 from XML config");
    }

    public void destroy() {
        System.out.println("destroy T1000 from XML config");
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}
