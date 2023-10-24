package Seminar3.HW;

class StandartDiscount implements CarDiscount {
    public int applyDiscount(int price) {
        return price - (price * 10 / 100); // Стандартная скидка 10%
    }
}