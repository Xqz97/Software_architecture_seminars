package Seminar8.mvvm;

class Book {
    private String title;
    private boolean isRead;

    public Book(String title) {
        this.title = title;
        this.isRead = false;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public boolean isRead() {
        return isRead;
    }
// тернарный оператор в Java
    @Override
    public String toString() {
        return title + (isRead ? " (прочитана)" : " (не прочитана)");
    }
}