package Seminar8.mvpvm.view;

import Seminar8.mvpvm.viewModel.TaskViewModel;

import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}
