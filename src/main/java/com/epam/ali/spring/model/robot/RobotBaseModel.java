package com.epam.ali.spring.model.robot;

import com.epam.ali.spring.model.parts.Hand;
import com.epam.ali.spring.model.parts.Head;
import com.epam.ali.spring.model.parts.Leg;

import javax.inject.Inject;
import javax.inject.Named;

public abstract class RobotBaseModel implements Robot {

    @Inject
    @Named("lgHead")
    private Head head;
    @Inject
    @Named("sonyHand")
    private Hand hand;
    @Inject
    @Named("sonyLeg")
    private Leg leg;

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
