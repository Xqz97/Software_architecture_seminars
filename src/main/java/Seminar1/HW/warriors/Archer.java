package Seminar1.HW.warriors;

import Seminar1.HW.protect.Protection;
import Seminar1.HW.weapons.Ranged;

public class Archer extends Warrior<Ranged, Protection>{
    public Archer(String name, int healthPoint, Ranged weapon, Protection shield) {
        super(name, healthPoint, weapon, shield);
    }

    public int distance(){
        return (super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}
