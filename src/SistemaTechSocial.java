import java.util.Scanner;

public class SistemaTechSocial {

    // Scanner utilizado para receber entradas do usuário.
    private final Scanner scanner = new Scanner(System.in);

    // Método principal: inicia a execução do programa.
    public static void main(String[] args) {

        SistemaTechSocial sistema = new SistemaTechSocial();

        sistema.executar();
    }

    // Método responsável por controlar o funcionamento do sistema.
    public void executar() {

        String opcao;

        do {

            exibirMenu();

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {

                case "1":
                    cadastrarSolicitante();
                    break;

                case "2":
                    consultarSolicitacoes();
                    break;

                case "3":
                    solicitarAjuda();
                    break;

                case "4":
                    realizarAtendimento();
                    break;

                case "5":
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

        } while (!opcao.equals("5"));

        scanner.close();
    }

    // Exibe o menu principal do sistema.
    private void exibirMenu() {

        System.out.println("\n==================================");
        System.out.println("       SISTEMA TECH SOCIAL");
        System.out.println("==================================");
        System.out.println("1 - Cadastrar solicitante");
        System.out.println("2 - Consultar solicitações");
        System.out.println("3 - Solicitar ajuda");
        System.out.println("4 - Realizar atendimento");
        System.out.println("5 - Sair");
        System.out.println("==================================");
    }

    // Funcionalidades provisórias, aguardando integração
    // com as classes desenvolvidas pelos outros integrantes.

    private void cadastrarSolicitante() {

        System.out.println("\n[Cadastro de solicitante]");
        System.out.println("Funcionalidade aguardando integração.");
    }

    private void consultarSolicitacoes() {

        System.out.println("\n[Consulta de solicitações]");
        System.out.println("Funcionalidade aguardando integração.");
    }

    private void solicitarAjuda() {

        System.out.println("\n[Solicitação de ajuda]");
        System.out.println("Funcionalidade aguardando integração.");
    }

    private void realizarAtendimento() {

        System.out.println("\n[Realização de atendimento]");
        System.out.println("Funcionalidade aguardando integração.");
    }
}