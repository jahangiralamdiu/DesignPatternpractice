package edu.headfirst.duck;

import edu.headfirst.fly.FlyBehaviour;
import edu.headfirst.quack.QuackBehaviour;

/**
 * @author jahangir
 * @since 4/9/16
 */
public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public abstract void display();

    public void swim() {
        System.out.println("I am swimming");
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
