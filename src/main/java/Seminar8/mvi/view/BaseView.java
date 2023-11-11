package Seminar8.mvi.view;

import Seminar8.mvi.model.TasksViewState;

/**
 * BaseView - базовый интерфейс для всех видов.
 */
public interface BaseView {
    void render(TasksViewState state);
}

