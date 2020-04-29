package forth;

public class RubberDuck extends Duck implements IFly, IQuack {

    public void display() {
        System.out.println("Im a Rubber Duck can you see me?");
    }

    public void fly(){
        System.out.println("I can fly");
    }

    public void quack(){
        System.out.println("I am a Rubber Duck, i am Squeaking");
    }


}
