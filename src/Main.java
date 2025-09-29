import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String tipoDeConta;
        boolean negativado;
        double saldo;
        double sacado;
        double depositado;



        //menu
        int opcao = 0;


        System.out.println("==============");
        System.out.print("Qual o nome do cliente? ");
        nome = scanner.nextLine();

        System.out.print("Tipo de conta? ");
        tipoDeConta = scanner.nextLine();

        System.out.print("Saldo Atual? ");
        saldo = scanner.nextDouble();

        negativado = saldo < 0;

        System.out.println("\n==============");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Negativado?: " + (negativado ? "Sim" : "Não"));
        System.out.println("==============");

        //menu iniciado

        String menu = """
                **Digite sua opção**
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("O seu saldo é: " + saldo);
                    break;

                case 2:
                    System.out.println("Quanto deseja transferir?");
                    sacado = scanner.nextDouble();
                    saldo = saldo - sacado;
                    break;

                case 3:
                    System.out.println("Quanto recebeu?");
                    depositado = scanner.nextDouble();
                    saldo = saldo + depositado;
                    break;

                case 4:
                    System.out.println("Você saiu.");
                    break;

                default:
                    System.out.println("Opção Invalida. Insira de 1-4");
            }

        }

        scanner.close();
    }
}