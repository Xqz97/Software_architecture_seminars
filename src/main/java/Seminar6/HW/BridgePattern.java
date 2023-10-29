package Seminar6.HW;

// Определяем абстрактный класс животного
abstract class Animal {
    protected Device device;

    public Animal(Device device) {
        this.device = device;
    }

    public abstract void move();
}

// Конкретная реализация абстрактного класса Animal - Лев
class Lion extends Animal {
    public Lion(Device device) {
        super(device);
    }

    @Override
    public void move() {
        device.moveDevice();
    }
}

// Конкретная реализация абстрактного класса животного - Обезьяна
class Monkey extends Animal {
    public Monkey(Device device) {
        super(device);
    }

    @Override
    public void move() {
        device.moveDevice();
    }
}

// Определяем абстрактный класс устройства для передвижения.
abstract class Device {
    public abstract void moveDevice();
}

// Конкретная реализация абстрактного класса Device - Колесный транспорт
class WheeledDevice extends Device {
    @Override
    public void moveDevice() {
        // Код для перемещения колесного устройства
        System.out.println("Перемещение на колесном устройстве.");
    }
}

// Конкретная реализация абстрактного класса устройства - Водный транспорт
class WaterDevice extends Device {
    @Override
    public void moveDevice() {
        // Код для перемещения водного устройства
        System.out.println("Перемещение на водном устройстве.");
    }
}

// Тестовый класс
public class BridgePattern {
    public static void main(String[] args) {
        // Создаем колесное устройство
        Device wheels = new WheeledDevice();

        // Создаем водное устройство
        Device water = new WaterDevice();

        // Создаем животных с разными устройствами
        Animal lion = new Lion(wheels);
        Animal monkey = new Monkey(water);

        // Двигаем животных
        lion.move();    // Вывод: Перемещение на колесном устройстве.
        monkey.move();  // Вывод: Перемещение на водном устройстве.
    }
}