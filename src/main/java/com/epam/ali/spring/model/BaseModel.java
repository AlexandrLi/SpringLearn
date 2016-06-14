package com.epam.ali.spring.model;

public abstract class BaseModel implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public BaseModel(Head head, Hand hand, Leg leg) {
        System.out.println("BaseModel init");
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public BaseModel() {

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
