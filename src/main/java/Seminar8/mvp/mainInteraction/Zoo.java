package Seminar8.mvp.mainInteraction;

import Seminar8.mvp.model.Animal;
import Seminar8.mvp.presenter.AnimalPresenter;
import Seminar8.mvp.view.AnimalImpl;
import Seminar8.mvp.view.IView;

public class Zoo {
    public static void main(String[] args) {
        // Создаем модель
        Animal lion = new Animal("Лев", "Млекопитающее");

        // Создаем вид
        IView animalView = new AnimalImpl();

        // Создаем представителя
        AnimalPresenter animalPresenter = new AnimalPresenter(lion, animalView);

        // Обновляем вид
        animalPresenter.updateView();
    }
}