package Seminar3.HW;

// Принцип единственной обязанности (Single Responsibility Principle - SRP)
class Car implements CarInformation, CarPricing{
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    // Метод получения информации о цене автомобиля
    public String getPriceInfo() {
        return "Цена: $" + price;
    }
}
