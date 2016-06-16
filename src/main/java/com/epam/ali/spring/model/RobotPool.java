package com.epam.ali.spring.model;

import com.epam.ali.spring.model.robot.Robot;

import java.util.Collection;

public interface RobotPool {

    Collection<Robot> getRobotsList();
}
