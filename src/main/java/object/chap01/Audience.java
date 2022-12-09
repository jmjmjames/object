package object.chap01;

public class Audience {

    private final Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }


    public Long buy(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        }

        // pay ticket
        bag.setTicket(ticket);
        bag.minusAmount(ticket.getFee());
        return ticket.getFee();
    }
}
