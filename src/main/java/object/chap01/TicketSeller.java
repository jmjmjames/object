package object.chap01;

public class TicketSeller {

    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    // Theater가 파는 것이 아닌 Seller가 파는 것이다.
    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
