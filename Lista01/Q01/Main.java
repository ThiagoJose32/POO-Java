package Lista01.Q01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Verificador DE PAR OU ÍMPAR");
        Lista01.Q01.Q01 q1 = new Lista01.Q01.Q01();
        System.out.print("Digite o valor: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        q1.setValor(x);
        System.out.print("O valor: " + q1.getValor() + " é " + q1.parImpar());
    }
}