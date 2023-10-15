package Seminar2.singleton;
public class Main {
    public static void main(String[] args) {
// Получаем экземпляр Singleton
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

// Вызываем методы
        singleton.doSomething();
    }
}