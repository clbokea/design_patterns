package kea.fifth;

import kea.fifth.eatbeahviour.IEat;
import kea.fifth.flybehaviour.IFly;
import kea.fifth.quackbehaviour.IQuack;

public abstract class Duck {

    IFly flybehaviour;
    IQuack quackbehaviour;
    IEat eatbehaviour;

    public IFly getFlybehaviour() {
        return flybehaviour;
    }

    public void getEatbehaviour() {
        eatbehaviour.eat();
    }

    public void setEatbehaviour(IEat eatbehaviour) {
        this.eatbehaviour = eatbehaviour;
    }

    public void performFly() {
        flybehaviour.fly();
    }

    public void setFlybehaviour(IFly flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public void getQuackbehaviour() {
        quackbehaviour.quack();
    }

    public void setQuackbehaviour(IQuack quackbehaviour) {
        this.quackbehaviour = quackbehaviour;
    }

    public void swim(){
        System.out.println("Im a duck i can swim");
    }
    public abstract void display();

}
