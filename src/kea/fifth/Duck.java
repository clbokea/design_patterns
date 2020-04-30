package kea.fifth;

import kea.fifth.flybehaviour.IFly;
import kea.fifth.quackbehaviour.IQuack;

public abstract class Duck {

    IFly flybehaviour;
    IQuack quackbehaviour;


    public IFly getFlybehaviour() {
        return flybehaviour;
    }

    public void setFlybehaviour(IFly flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public IQuack getQuackbehaviour() {
        return quackbehaviour;
    }

    public void setQuackbehaviour(IQuack quackbehaviour) {
        this.quackbehaviour = quackbehaviour;
    }

    public void swim(){
        System.out.println("Im a duck i can swim");
    }
    public abstract void display();

}
