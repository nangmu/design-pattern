package ch1.strategy;

public class SimpleFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("나는중");
    }
}
