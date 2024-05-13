import java.util.HashMap;
import java.util.Map;

public class TicketSystem {
    private Map<Integer, Ticket> tickets;

    public TicketSystem() {
        this.tickets = new HashMap<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
    }

    public Ticket getTicket(int id) {
        return tickets.get(id);
    }
}