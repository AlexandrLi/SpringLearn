package com.epam.ali.spring.model.robot;

import com.epam.ali.spring.model.parts.Hand;
import com.epam.ali.spring.model.parts.Head;
import com.epam.ali.spring.model.parts.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class RobotBaseModel implements Robot {
    @Autowired
    @Qualifier("sonyHead")
    private Head head;
    @Autowired
    @Qualifier("lgHand")
    private Hand hand;
    @Autowired
    @Qualifier("lgLeg")
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
