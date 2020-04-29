package fifth;

import kea.fifth.flybehavior.FlyWithWings;
import kea.fifth.flybehavior.IFly;
import kea.fifth.quackbeavior.IQuack;
import kea.fifth.quackbeavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display() {
        System.out.println("Im a Mallard Duck can you see me?");
    }

}
