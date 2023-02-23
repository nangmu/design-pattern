package ch1.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());

        System.out.println(ducks);
        System.out.println("청둥오리가 날개에 상처를 입어서 날지 못한다");
        ducks.get(0).setFlyable(new NoneFlyBehavior());

        System.out.println(ducks);
    }
}
