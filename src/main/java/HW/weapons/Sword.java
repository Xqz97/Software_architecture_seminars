package HW.weapons;

public class Sword implements Melee{
    @Override
    public int damage() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("Sword: %d ", damage());
    }
}
