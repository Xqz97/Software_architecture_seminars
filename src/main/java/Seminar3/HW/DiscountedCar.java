package Seminar3.HW;

// Принцип подстановки Лисков (Liskov Substitution Principle - LSP)
class DiscountedCar extends Car {
    private CarDiscount discountStrategy;

    public DiscountedCar(String model, int price, CarDiscount discountStrategy) {
        super(model, price);
        this.discountStrategy = discountStrategy;
    }

    @Override
    public String getPriceInfo() {
        int discountedPrice = discountStrategy.applyDiscount(getPrice());
        return "Цена со скидкой: $" + discountedPrice;
    }
}