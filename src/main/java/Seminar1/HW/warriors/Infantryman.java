package Seminar1.HW.warriors;

import Seminar1.HW.protect.Protection;
import Seminar1.HW.weapons.Melee;

public class Infantryman extends Warrior<Melee, Protection>{
    public Infantryman(String name, int healthPoint, Melee weapon, Protection shield) {
        super(name, healthPoint, weapon, shield) ;
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
