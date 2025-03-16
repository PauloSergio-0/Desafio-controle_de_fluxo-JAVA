package edu.paulo.challengedio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Digite o numero 1: ");
            int num1 = scanner.nextInt(); 
            
            System.out.println("Digite o numero 2: ");
            int num2 = scanner.nextInt(); 
            
            scanner.close();
            Contador challenge = new Contador();

            challenge.diferenca(num1, num2);

        } catch (ParametrosInvalido e) {
            System.out.println(e.getMessage());
        }
    }
}
