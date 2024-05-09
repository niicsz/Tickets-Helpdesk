import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Ticket {
    private int ticketId;
    private String title;
    private String description;
    private String status;
    private String assignedTo;

    public Ticket(int ticketId, String title, String description) {
        this.ticketId = ticketId;
        this.title = title;
        this.description = description;
        this.status = "Aberto";
        this.assignedTo = "Não atribuído";
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
}
