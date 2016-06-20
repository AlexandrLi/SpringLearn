package com.epam.ali.spring;

import com.epam.ali.spring.model.Color;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@javax.inject.Qualifier
public @interface RobotColor {
    Color color();
}
