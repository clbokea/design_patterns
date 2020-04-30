package kea.fifth;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        //Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(mallardDuck);
        //ducks.add(redHeadDuck);
        ducks.add(rubberDuck);

        for (Duck d: ducks) {
            d.display();
            d.swim();

            if(d instanceof RubberDuck){
                ((RubberDuck)d).quack();
            }

            if(d instanceof MallardDuck){
                ((MallardDuck)d).fly();
                ((MallardDuck)d).quack();
            }

        }
    }
}
