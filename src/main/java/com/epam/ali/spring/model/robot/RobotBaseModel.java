package com.epam.ali.spring.model.robot;

import com.epam.ali.spring.model.parts.Hand;
import com.epam.ali.spring.model.parts.Head;
import com.epam.ali.spring.model.parts.Leg;

public abstract class RobotBaseModel implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public RobotBaseModel(Head head, Hand hand, Leg leg) {
        System.out.println("RobotBaseModel init");
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public RobotBaseModel() {

    }

    public Head getHead() {

        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
