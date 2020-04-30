package kea.fifth;

import kea.fifth.eatbeahviour.EatNicely;
import kea.fifth.flybehaviour.FloNoWay;
import kea.fifth.flybehaviour.RideAMC;
import kea.fifth.quackbehaviour.Mute;
import kea.fifth.quackbehaviour.Squick;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Duck md = new MallardDuck();

        md.display();
        md.swim();
        md.performFly();
        md.getQuackbehaviour();


        Duck rd = new RubberDuck();
        rd.display();
        rd.swim();
        rd.getQuackbehaviour();

        // enj jæger skyder anden!
        md.setFlybehaviour(new FloNoWay());
        md.setQuackbehaviour(new Mute());
        md.display();
        md.performFly();
        md.getQuackbehaviour();


        md.setFlybehaviour(new RideAMC());
        md.performFly();


        md.setEatbehaviour(new EatNicely());
        md.getEatbehaviour();



    }
}
