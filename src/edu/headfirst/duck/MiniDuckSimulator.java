package edu.headfirst.duck;

import edu.headfirst.fly.FlyWithRocket;

/**
 * @author jahangir
 * @since 4/9/16
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallaredDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        rubberDuck.setFlyBehaviour(new FlyWithRocket());
        rubberDuck.performFly();
    }

}
