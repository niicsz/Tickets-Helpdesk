public class Main {
    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.openTicket("Problema com o computador");
        helpDesk.openTicket("Problema com a internet");
        helpDesk.resolveTicket();
    }
}
