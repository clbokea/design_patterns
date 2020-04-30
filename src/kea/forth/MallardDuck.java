package kea.forth;

public class MallardDuck extends Duck implements IFly, IQuack {
    public void display() {
        System.out.println("Im a Mallard Duck can you see me?");
    }

    @Override
    public void fly() {
        System.out.println("Im a duck i can fly");
    }

    @Override
    public void quack() {
        System.out.println("Im a duck i can Quack");
    }
}
