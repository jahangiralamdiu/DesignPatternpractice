package edu.headfirst.quack;

/**
 * @author jahangir
 * @since 4/9/16
 */
public class NoQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
