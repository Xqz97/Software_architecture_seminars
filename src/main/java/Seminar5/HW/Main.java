package Seminar5.HW;

import Seminar5.HW.view.ConsoleView;
import Seminar5.HW.view.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}
