public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Criar Ticket");
            System.out.println("2. Exibir Tickets");
            System.out.println("3. Atribuir Ticket");
            System.out.println("4. Fechar Ticket");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite o título do ticket: ");
                    String title = scanner.nextLine();
                    System.out.print("Digite a descrição do ticket: ");
                    String description = scanner.nextLine();
                    ticketSystem.createTicket(title, description);
                    break;
                case 2:
                    ticketSystem.displayTickets();
                    break;
                case 3:
                    System.out.print("Digite o ID do ticket que deseja atribuir: ");
                    int ticketId = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do usuário para atribuir o ticket: ");
                    String assignee = scanner.nextLine();
                    ticketSystem.assignTicket(ticketId, assignee);
                    break;
                case 4:
                    System.out.print("Digite o ID do ticket que deseja fechar: ");
                    ticketId = scanner.nextInt();
                    ticketSystem.closeTicket(ticketId);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
