package forth;

public abstract class Duck {
    public void swim(){
        System.out.println("Im a duck i can swim");
    }
    public abstract void display();

    // Take out what varies and put it in an interface of its own
    /*
    public void quack(){
        System.out.println("Im a duck i can quack");
    }
    public void fly(){
        System.out.println("Im a Duck i can fly");
    } */
}
