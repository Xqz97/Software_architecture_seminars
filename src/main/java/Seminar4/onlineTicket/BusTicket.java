package Seminar4.onlineTicket;

class BusTicket extends Ticket {
    int number;
    /**
     * Метод, который позволяет зарезервировать билет.
     *
     * @param ticket Билет, который нужно зарезервировать.
     * @return true, если билет успешно зарезервирован.
     * @pre Билет должен быть в наличии.
     * @pre Направление должно существовать.
     * @pre Пользователь должен быть авторизован.
     * @pre Средства у клиента должны быть.
     * @post Должны быть вычтены деньги со счета
     * @post Подтверждена покупка
     * @post Обновлено наличие билетов.
     */

    public boolean reserveTicket(Ticket ticket) {

        return false;
    }

    @Override
    public boolean reserveTicket() {
        return false;
    }

    @Override
    public boolean deductFunds() {
// Реализация метода
        return false;
    }

    @Override
    public boolean confirmPurchase() {
// Реализация метода
        return false;
    }

    @Override
    public void updateTicketAvailability() {
// Реализация метода
    }

    @Override
    public boolean cancelReservation() {
// Реализация метода
        return false;
    }
}