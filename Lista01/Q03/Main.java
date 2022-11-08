package Lista01.Q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista01.Q03.Q03 obj = new Lista01.Q03.Q03();
        System.out.print("Digite uma palavra: ");
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        System.out.print("A palavra " + palavra + " tem " + obj.contaVogais(palavra) + " vogais!");

    }
}
