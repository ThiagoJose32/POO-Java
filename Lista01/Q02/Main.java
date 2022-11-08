package Lista01.Q02;

import Lista01.Q04.Q04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora simples");
        Lista01.Q02.Q02 q2 = new Lista01.Q02.Q02();
        int n1, n2;
        System.out.print("Digite o primeiro valor: ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = scan.nextInt();
        System.out.printf("Resultado = " + q2.menu(n1, n2));

    }
}
