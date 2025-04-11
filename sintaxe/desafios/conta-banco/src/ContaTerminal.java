/**
 * <h1>Conta Terminal</h1>
 * A Conta Terminal realiza a crição de uma conta com base nas informações passadas pelo cliente
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Junior Fernandes
 * @version 1.0
 * @since   11/04/2025
 */

import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        /**
         * Neste método é realizada a criação da conta com o nome do cliente, agência, número da conta e saldo
         * @param nomeCliente este é o primeiro parâmetro do método
         * @param agencia este é o segundo parâmetro do método
         * @param numeroConta este é o terceiro parâmetro do método
         * @param saldo este é o quarto parâmetro do método
         * @return void apresenta os detalhes da conta criada.
         */

        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Iniciando sistema ***");

        System.out.println("Informe seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Informe sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Informe o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Informe o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + " e conta " + numeroConta + ", seu saldo é de R$" + saldo + " e já está disponível para saque");

    }

}
