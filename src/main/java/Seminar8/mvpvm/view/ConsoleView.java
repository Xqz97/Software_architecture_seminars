package Seminar8.mvpvm.view;



import Seminar8.mvpvm.viewModel.TaskViewModel;

import java.util.List;

public class ConsoleView implements TaskView {
    @Override
    public void showTasks(List<TaskViewModel> taskViewModels) {
        for (int i = 0; i < taskViewModels.size(); i++) {
            System.out.println((i + 1) + ". " + taskViewModels.get(i).getDisplayName());
        }
    }
}
