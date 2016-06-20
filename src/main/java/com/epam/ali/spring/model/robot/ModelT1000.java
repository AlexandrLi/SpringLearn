package com.epam.ali.spring.model.robot;

import com.epam.ali.spring.model.Color;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Named;

@Named("t1000")
public class ModelT1000 extends RobotBaseModel {

    private Color color;

    private int year;

    public ModelT1000() {
    }

    public Color getColor() {
        return color;
    }

    @Value("BLACK")
    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    @Value("2016")
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
