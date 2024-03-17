package edu.jeferson.aulaJava.desafioBanco;

import java.util.Locale;
import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem vindo a conta Bancaria DIO-Java!");
        System.out.print("Digite o número da sua agência: ");
        int agencia = scanner.nextInt();
        System.out.print("Digite o número da sua conta: ");
        String contaCorente = scanner.next();
        scanner.nextLine();
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o saldo da sua conta: ");
        double saldo;
        saldo = scanner.nextDouble();
        System.out.println("Olá " + titular + " a sua agencia é: " + agencia + " sua conta é: "
        + contaCorente + " e o seu saldo é: " + saldo);


    }
}
