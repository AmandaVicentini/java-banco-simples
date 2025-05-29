import java.util.Scanner;

public class Projeto_Banco {
    public static void main(String[] args) {
        String nome = "Amanda Vicentini";
        String tipoDeConta = "Corrente";
        double saldoInicial = 3200.93;
        int opcaoDesejada;
        double valorReceber;
        double valorTransferir;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);

    while (true) { // O menu do banco vai aparecer infinitamente até o usuário escolher a opção 4 (sair).
        System.out.println("Operações:");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Receber Valor");
        System.out.println("3. Transferir Valor");
        System.out.println("4. Sair");
        System.out.println("Digite a opção Desejada:");
        opcaoDesejada = scanner.nextInt();

        if (opcaoDesejada == 1) {
            System.out.println("Saldo: R$ " + saldoInicial);

        } else if (opcaoDesejada == 2) {
            System.out.println("Digite o valor a receber: ");
            valorReceber = scanner.nextDouble();
            saldoInicial += valorReceber;
            System.out.println("Saldo Atualizado: R$ " + saldoInicial);

        } else if (opcaoDesejada == 3) {
            System.out.println("Digite o valor a transferir: ");
            valorTransferir = scanner.nextDouble();
            if (valorTransferir <= saldoInicial) {
                saldoInicial -= valorTransferir;
                System.out.println("Saldo Atualizado: R$ " + saldoInicial);
            } else {
                System.out.println("Opção inválida! Valor excede o saldo.");
            }
        } else if (opcaoDesejada == 4) {
            System.out.println("Operação encerrada!");
            break;
        } else {
            System.out.println("Opção inválida! Tente novamente.");
        }
    }

        scanner.close();
    }
}


