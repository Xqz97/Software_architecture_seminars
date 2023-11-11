package Seminar8.mvp.presenter;

import Seminar8.mvp.model.Animal;
import Seminar8.mvp.view.IView;

public class AnimalPresenter {
    private Animal animal;
    private IView view;

    public AnimalPresenter(Animal animal, IView view) {
        this.animal = animal;
        this.view = view;
    }

    public void updateView() {
        view.displayAnimal(animal.getName(), animal.getSpecies());
    }
}