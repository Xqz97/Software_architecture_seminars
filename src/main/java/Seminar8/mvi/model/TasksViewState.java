package Seminar8.mvi.model;

import Seminar8.mvi.model.ViewState;
import Seminar8.mvpvm.model.Task;

import java.util.List;

/**
 * TasksViewState - состояние, которое отображает список задач.
 */
public class TasksViewState implements ViewState {
    private final List<Task> tasks;

    public TasksViewState(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Список задач:\n");
        for (int i = 0; i < tasks.size(); i++) {
            builder.append((i + 1)).append(". ").append(tasks.get(i).toString()).append("\n");
        }
        return builder.toString();
    }
}