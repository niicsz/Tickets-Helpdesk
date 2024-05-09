import java.util.*;

class Ticket {
    private static int count = 0;
    private int id;
    private String issue;

    public Ticket(String issue) {
        this.id = ++count;
        this.issue = issue;
    }

    public int getId() {
        return id;
    }

    public String getIssue() {
        return issue;
    }
}
