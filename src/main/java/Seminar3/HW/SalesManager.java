package Seminar3.HW;

class SalesManager {
    public void printCarModel(CarInformation car) {
        String model = car.getModel();
        System.out.println("Модель: " + model);
    }

    public void printCarPrice(CarPricing car) {
        String priceInfo = car.getPriceInfo();
        System.out.println(priceInfo);
    }
}