package Seminar8.mvpvm.viewModel;

import Seminar8.mvpvm.model.Task;

public class TaskViewModel {
private String displayName;

public TaskViewModel(Task task) {
        this.displayName = task.getName() + (task.isCompleted() ? " (completed)" : "");
        }

public String getDisplayName() {
        return displayName;
        }
}