import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar ticket");
            System.out.println("2. Ver ticket");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite a descrição do problema: ");
                    String issue = scanner.nextLine();
                    Ticket ticket = new Ticket(issue);
                    ticketSystem.addTicket(ticket);
                    System.out.println("Ticket adicionado com ID: " + ticket.getId());
                    break;
                case 2:
                    System.out.print("Digite o ID do ticket: ");
                    int id = scanner.nextInt();
                    Ticket existingTicket = ticketSystem.getTicket(id);
                    if (existingTicket != null) {
                        System.out.println("Ticket ID: " + existingTicket.getId());
                        System.out.println("Problema: " + existingTicket.getIssue());
                    } else {
                        System.out.println("Ticket não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}