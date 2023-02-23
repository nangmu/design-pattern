package ch1.strategy;

abstract class Duck {
    FlyBehavior flyBehavior = new SimpleFlyBehavior();
    void quack() {
        System.out.println("꽥꽥");
    }
    void swim() {
        System.out.println("수영중");
    }
    abstract void display();

    void fly() {
        flyBehavior.fly();
    }
    public void setFlyable(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "flyBehavior=" + flyBehavior +
                '}';
    }
}
