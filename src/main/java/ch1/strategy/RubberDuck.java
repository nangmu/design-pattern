package ch1.strategy;

public class RubberDuck extends Duck{

    RubberDuck() {
        this.flyBehavior = new NoneFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("고무오리");
    }
}
