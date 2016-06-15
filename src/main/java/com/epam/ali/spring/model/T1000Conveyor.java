package com.epam.ali.spring.model;

import com.epam.ali.spring.model.robot.Robot;

public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobot();
}
