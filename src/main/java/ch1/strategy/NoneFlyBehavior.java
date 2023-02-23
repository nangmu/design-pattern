package ch1.strategy;

public class NoneFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날지 못합니다");
    }
}
