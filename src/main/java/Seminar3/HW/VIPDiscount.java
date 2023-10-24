package Seminar3.HW;

class VIPDiscount implements CarDiscount {
    public int applyDiscount(int price) {
        return price - (price * 20 / 100); // VIP-скидка 20%
    }
}