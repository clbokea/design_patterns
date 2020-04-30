package kea.forth;

public class RubberDuck extends Duck implements IQuack {

    @Override
    public void display() {
        System.out.println("I Am a Rubber Duck");
    }

    @Override
    public void quack(){
        System.out.println("I squick");
    }

}
