package Seminar8.mvp.view;

// Реализация вида
public class AnimalImpl implements IView {
    @Override
    public void displayAnimal(String name, String species) {
        System.out.println("Имя: " + name + ", Вид: " + species);
    }
}