package Seminar2.HW;

public class WarriorFactory {
    public Warrior createWarrior(String warriorType) {
        if ("Archer".equalsIgnoreCase(warriorType)) {
            return new Archer();
        } else if ("Swordsman".equalsIgnoreCase(warriorType)) {
           return new Swordsman();
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип животного");
        }
    }
}

