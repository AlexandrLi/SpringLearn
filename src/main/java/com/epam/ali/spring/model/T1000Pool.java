package com.epam.ali.spring.model;

import com.epam.ali.spring.RobotColor;
import com.epam.ali.spring.model.robot.Robot;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.Collection;

//@SuppressWarnings("SpringJavaAutowiringInspection")
public class T1000Pool implements RobotPool {

    @Resource(name = "robotsList")
    private Collection<Robot> robotsList;
    @Inject
    @RobotColor(color = Color.BLACK)
    private Robot blackT1000;
    @Inject
    @RobotColor(color = Color.WHITE)
    private Robot whiteT1000;

    public T1000Pool() {
    }

    public Robot getBlackT1000() {
        return blackT1000;
    }

    public void setBlackT1000(Robot blackT1000) {
        this.blackT1000 = blackT1000;
    }

    public Robot getWhiteT1000() {
        return whiteT1000;
    }

    public void setWhiteT1000(Robot whiteT1000) {
        this.whiteT1000 = whiteT1000;
    }

    @Override
    public Collection<Robot> getRobotsList() {
        return robotsList;
    }

    public void setRobotsList(Collection<Robot> robotsList) {
        this.robotsList = robotsList;
    }


    public void action() {
        robotsList.forEach(Robot::action);
    }
}
