package edu.headfirst.duck;

import edu.headfirst.fly.FlyWithWings;
import edu.headfirst.quack.Quack;

/**
 * @author jahangir
 * @since 4/9/16
 */
public class MallaredDuck extends Duck {

    public MallaredDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am black");
    }
}
