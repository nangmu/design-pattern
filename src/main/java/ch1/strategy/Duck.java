package ch1.strategy;

abstract class Duck {
    void quack() {
        System.out.println("꽥꽥");
    }
    void swim() {
        System.out.println("수영중");
    }
    abstract void display();

    void fly() {
        System.out.println("날아다니는중");
    }
}
