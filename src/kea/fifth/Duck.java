package fifth;

import kea.fifth.flybehavior.IFly;
import kea.fifth.quackbeavior.IQuack;

public abstract class Duck {

    IQuack quackBehavior;
    IFly flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(IQuack qb) {
        this.quackBehavior = qb;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(IFly fb) {
        this.flyBehavior = fb;
    }

    public void swim(){
        System.out.println("Im a duck i can swim");
    }
    public abstract void display();

}
