package kea.third;

public abstract class Duck {
    public void quack(){
        System.out.println("Im a duck i can quack");
    }
    public void swim(){
        System.out.println("Im a duck i can swim");
    }
    public abstract void display();
    public void fly(){System.out.println("Im a duck i can fly");}
}
