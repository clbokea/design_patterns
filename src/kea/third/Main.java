package third;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(mallardDuck);
        ducks.add(redHeadDuck);
        ducks.add(rubberDuck);
        ducks.add(decoyDuck);

        for (Duck d: ducks) {
            System.out.println("===============");
            d.display();
            d.quack();
            d.swim();
            d.fly();

        }
    }
}
