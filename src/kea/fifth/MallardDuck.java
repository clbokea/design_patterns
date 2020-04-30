package kea.fifth;

import kea.fifth.flybehaviour.FlyWithWings;
import kea.fifth.quackbehaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        setFlybehaviour(new FlyWithWings());
        setQuackbehaviour(new Quack());
    }

    public void display() {
        System.out.println("Im a Mallard Duck can you see me?");
    }


}
