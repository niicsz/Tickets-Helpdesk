public class Ticket {
    private static int count = 0;
    private int id;
    private String issue;
    private User user; 
    public Ticket(String issue, User user) { 
        this.id = ++count;
        this.issue = issue;
        this.user = user; 

    public int getId() {
        return id;
    }

    public String getIssue() {
        return issue;
    }

    public User getUser() { 
        return user;
    }
}