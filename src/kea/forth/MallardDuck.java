package forth;

public class MallardDuck extends Duck implements IFly, IQuack {

    public void display() {
        System.out.println("Im a Mallard Duck can you see me?");
    }

    public void fly() {
        System.out.println("I can fly");
    }
    public void quack() {
        System.out.println("I can Quack");
    }
}
