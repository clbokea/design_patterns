package kea.fifth;

import kea.fifth.quackbehaviour.IQuack;
import kea.fifth.quackbehaviour.Squick;

public class RubberDuck extends Duck {

    public RubberDuck(){
        setQuackbehaviour(new Squick());
    }

    @Override
    public void display() {
        System.out.println("I Am a Rubber Duck");
    }

}
