package edu.headfirst.duck;

import edu.headfirst.fly.FlyNoWay;
import edu.headfirst.quack.Squack;

/**
 * @author jahangir
 * @since 4/9/16
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squack();
    }

    @Override
    public void display() {
        System.out.println("I am red");
    }
}
