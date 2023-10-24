package Seminar3.HW;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi A4", 50000);
        DiscountedCar discountedCar = new DiscountedCar("BMW X5", 80000, new VIPDiscount());

        SalesManager salesManager = new SalesManager();
        salesManager.printCarModel(car);
        salesManager.printCarPrice(car);

        System.out.println();

        salesManager.printCarModel(discountedCar);
        salesManager.printCarPrice(discountedCar);
    }
}