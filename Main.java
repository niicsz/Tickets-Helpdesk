import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        User user = new User(name);

        TicketSystem ticketSystem = new TicketSystem();

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
                    Ticket ticket = new Ticket(issue, user); 
                    ticketSystem.addTicket(ticket);
                    System.out.println(user.getName() + ", ticket adicionado com ID: " + ticket.getId());
                    break;
                case 2:
                    System.out.print("Digite o ID do ticket: ");
                    int id = scanner.nextInt();
                    Ticket existingTicket = ticketSystem.getTicket(id);
                    if (existingTicket != null) {
                        System.out.println("Ticket ID: " + existingTicket.getId());
                        System.out.println("Problema: " + existingTicket.getIssue());
                        System.out.println("Aberto por: " + existingTicket.getUser().getName()); 
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