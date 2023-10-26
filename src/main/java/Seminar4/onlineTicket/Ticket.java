package Seminar4.onlineTicket;

import java.util.Date;
/**
 * Абстрактный класс, представляющий билет.
 */
abstract class Ticket implements TicketActions {
    String routeId;
    Date departureTime;
    double price;
}
