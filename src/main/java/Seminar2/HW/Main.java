package Seminar2.HW;

import Seminar2.fabric.Animal;
import Seminar2.fabric.AnimalFactory;

public class Main {
    public static void main(String[] args) {
        WarriorFactory warriorFactory = new WarriorFactory();
        Warrior Archer1 = warriorFactory.createWarrior("Archer");
        System.out.println(Archer1.miliOrRangeDamage());

        Warrior Swordsman1 = warriorFactory.createWarrior("Swordsman");
        System.out.println(Swordsman1.miliOrRangeDamage());
    }
}
