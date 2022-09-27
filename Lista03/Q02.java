import java.util.Scanner;

public class Lista03_Q02 {
    private int n1, n2;

    public int getN1(){
        return n1;
    }
    public int getN2(){
        return n2;
    }

    public int menu(int n1, int n2){
        System.out.print("Digite uma das operações para os valores:\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n");
        System.out.print("Opção: ");
        int opc;
        Scanner scan = new Scanner(System.in);
        opc = scan.nextInt();

        switch(opc){
            case 1:
                opc = soma(n1, n2);
            break;

            case 2:
                opc = subtracao(n1, n2);
            break;

            case 3:
                opc = multiplicacao(n1, n2);
            break;

            case 4:
                opc = divisao(n1, n2);
            break;

            default:
                System.out.print("Opcção inválida!");
        }
        return opc;
    }

    private int soma(int n1, int n2){
        return n1+n2;
    }

    private int subtracao(int n1, int n2){
        return n1-n2;
    }

    private int multiplicacao(int n1, int n2){
        return n1*n2;
    }

    private int divisao(int n1, int n2){
        return n1/n2;
    }
}
