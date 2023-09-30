package HW;


import HW.protect.ChainMail;
import HW.protect.Shield;
import HW.warriors.Archer;
import HW.warriors.Infantryman;
import HW.warriors.Warrior;
import HW.weapons.Axe;
import HW.weapons.Bow;
import HW.weapons.CrossBow;
import HW.weapons.Sword;

public class Seminar4OOP {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new ChainMail()));
        team1.add(new Infantryman("Robin", 100, new Axe(), new Shield()));

        Team<Archer> team2 = new Team<>();
        team2.add(new Archer("Hood", 100, new CrossBow(), new Shield()));
        team2.add(new Archer("Mack", 100, new Bow(), new Shield()));

        Team<Infantryman> team3 = new Team<>();
        team3.add(new Infantryman("Baddi", 100, new Sword(), new Shield()));
        team3.add(new Infantryman("Billi", 100, new Axe(),new Shield()));
        System.out.println(team1.getMinArmour());
        System.out.println(team1);
        System.out.println("____________________________");
        System.out.println(team2);
        System.out.println("____________________________");
        System.out.println(team3);

        Battle battle1 = new Battle(new Archer("Mack", 13, new Bow(), new ChainMail()), new Infantryman("Billi", 12, new Axe(), new Shield()));
        battle1.fight();
    }
}
