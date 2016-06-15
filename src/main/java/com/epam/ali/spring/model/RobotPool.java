package com.epam.ali.spring.model;

import com.epam.ali.spring.model.robot.Robot;

import java.util.Collection;
import java.util.Map;

public interface RobotPool {

    Collection<Robot> getRobotsList();

    Map<String, Robot> getRobotsMap();
}
