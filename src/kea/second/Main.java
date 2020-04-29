package second;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(mallardDuck);
        ducks.add(redHeadDuck);

        for (Duck d: ducks) {
            d.display();
            d.quack();
            d.swim();
            d.fly(); // added
        }

    }
}
