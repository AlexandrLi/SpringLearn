package com.epam.ali.spring.model.robot;

import com.epam.ali.spring.model.Color;
import org.springframework.beans.factory.annotation.Required;

public class ModelT1000 extends RobotBaseModel {
    private Color color;
    private int year;

    public ModelT1000() {
    }

    public Color getColor() {
        return color;
    }

    @Required
    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    @Required
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("T1000 color: " + this.color + ", year: " + this.year);
    }

}
