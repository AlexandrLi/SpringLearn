package com.epam.ali.spring.model;

import com.epam.ali.spring.model.robot.Robot;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {
    private Collection<Robot> robotsList;
    private Map<String, Robot> robotsMap;

    public T1000Pool() {
    }

    public T1000Pool(Map<String, Robot> robotsMap) {
        this.robotsMap = robotsMap;
    }

    @Override
    public Collection<Robot> getRobotsList() {
        return robotsList;
    }

    public void setRobotsList(Collection<Robot> robotsList) {
        this.robotsList = robotsList;
    }

    @Override
    public Map<String, Robot> getRobotsMap() {
        return robotsMap;
    }

    public void setRobotsMap(Map<String, Robot> robotsMap) {
        this.robotsMap = robotsMap;
    }

    public void action() {
        robotsList.forEach(Robot::action);
        robotsMap.forEach((s, robot) -> System.out.println(s + " " + robot));
    }
}
