package Seminar8.mvi.presenter;

import Seminar8.mvi.model.Intent;
import Seminar8.mvi.model.TaskCompletedIntent;
import Seminar8.mvi.view.BaseView;
import Seminar8.mvi.model.TasksViewState;
import Seminar8.mvpvm.model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter связывает Model и View, обрабатывая намерения и обновляя состояние представления.
 */
class TasksPresenter {
    private final List<Task> tasks = new ArrayList<>();
    private final BaseView view;

    public TasksPresenter(BaseView view) {
        this.view = view;
        tasks.add(new Task("Помыть посуду"));
        tasks.add(new Task("Постирать белье"));
    }

    public void dispatch(Intent intent) {
        if (intent instanceof TaskCompletedIntent) {
            int taskId = ((TaskCompletedIntent) intent).getTaskId();
            tasks.get(taskId).complete();
        }
        view.render(new TasksViewState(tasks));
    }

    public void loadTasks() {
        view.render(new TasksViewState(tasks));
    }
}