class TicketSystem {
    private List<Ticket> tickets;
    private int lastTicketId;

    public TicketSystem() {
        tickets = new ArrayList<>();
        lastTicketId = 0;
    }

    public void createTicket(String title, String description) {
        lastTicketId++;
        Ticket ticket = new Ticket(lastTicketId, title, description);
        tickets.add(ticket);
        System.out.println("Ticket #" + ticket.getTicketId() + " criado com sucesso!");
    }

    public void displayTickets() {
        if (tickets.isEmpty()) {
            System.out.println("Não há tickets para exibir.");
            return;
        }
        System.out.println("Tickets:");
        for (Ticket ticket : tickets) {
            System.out.println("ID: " + ticket.getTicketId() + ", Título: " + ticket.getTitle() + ", Status: " + ticket.getStatus() + ", Atribuído a: " + ticket.getAssignedTo());
        }
    }

    public void assignTicket(int ticketId, String assignee) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() == ticketId) {
                ticket.setStatus("Em andamento");
                ticket.setAssignedTo(assignee);
                System.out.println("Ticket #" + ticketId + " atribuído a " + assignee + " com sucesso!");
                return;
            }
        }
        System.out.println("Ticket #" + ticketId + " não encontrado.");
    }

    public void closeTicket(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() == ticketId) {
                ticket.setStatus("Fechado");
                System.out.println("Ticket #" + ticketId + " fechado com sucesso!");
                return;
            }
        }
        System.out.println("Ticket #" + ticketId + " não encontrado.");
    }
}
