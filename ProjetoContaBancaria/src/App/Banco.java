package App;

import Core.ContaBancaria;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(1001, 2, "123456789-10", "Andréa", 100);


        int opcao;
        double valor;

        do {
            System.out.println("_____JuiaBank - Seu banco na Internet_____\n");
            System.out.println("Dígite uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Informações da conta");
            System.out.println("4 - Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println(">>> DEPOSITO - Digite o valor: ");
                    valor = teclado.nextDouble();
                    conta.despositar(valor);
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.println(">>> SAQUE - Digite o valor: ");
                    valor = teclado.nextDouble();
                    boolean resposta = conta.sacar(valor);
                    if (resposta) {
                        System.out.println("   Saque efetuado com sucesso.");
                    } else {
                        System.out.println("   Saldo Insuficiente.");
                    }
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.println(">>> INFORMAÇÕES DA CONTA >>> "+ conta.exibirDados());
                }
                case 4 -> System.out.println(">>> OBRIGADA, VOLTE SEMPRE!");
            }
        }while (opcao != 4);
    }
}