class HelpDesk {
    private Queue<Ticket> tickets;

    public HelpDesk() {
        tickets = new LinkedList<>();
    }

    public void openTicket(String issue) {
        Ticket ticket = new Ticket(issue);
        tickets.add(ticket);
        System.out.println("Ticket #" + ticket.getId() + " aberto com o problema: " + ticket.getIssue());
    }

    public void resolveTicket() {
        if (tickets.isEmpty()) {
            System.out.println("Nenhum ticket para resolver.");
        } else {
            Ticket resolved = tickets.poll();
            System.out.println("Ticket #" + resolved.getId() + " resolvido.");
        }
    }
}
