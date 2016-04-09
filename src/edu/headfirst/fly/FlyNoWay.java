package edu.headfirst.fly;

/**
 * @author jahangir
 * @since 4/9/16
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
