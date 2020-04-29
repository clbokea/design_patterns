package second;

public abstract class Duck {
    public void quack(){
        System.out.println("Im a duck i can quack");
    }
    public void swim(){
        System.out.println("Im a duck i can swim");
    }
    public abstract void display();
    // add a fly method
    public void fly(){
        System.out.println("Im a Duck i can fly");
    }
}
