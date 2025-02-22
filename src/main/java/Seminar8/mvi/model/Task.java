package Seminar8.mvi.model;

/**
 * Task - базовая сущность, представляющая задачу.
 */
class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return name + (completed ? " (completed)" : "");
    }
}
