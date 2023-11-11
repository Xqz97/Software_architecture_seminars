package Seminar8.mvi.view;

import Seminar8.mvi.model.TasksViewState;

class ConsoleView implements BaseView {

    @Override
    public void render(TasksViewState state) {
        if (state instanceof TasksViewState) {
            TasksViewState tasksState = (TasksViewState) state;
            System.out.println(tasksState);
        } else {
            System.out.println("Неизвестное состояние.");
        }
    }
}
