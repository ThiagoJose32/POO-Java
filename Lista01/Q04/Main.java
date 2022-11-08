package Lista01.Q04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Q04 imposto = new Q04();
        System.out.print("Digite o salário: ");
        Scanner scan = new Scanner(System.in);
        float valor = scan.nextFloat();
        imposto.calculaImposto(valor);
        System.out.print("Para o salário de " + valor + "R$ deverá ser pago " + imposto.getResultado() + "R$ de imposto!");

    }
}
