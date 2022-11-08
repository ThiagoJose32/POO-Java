package questao;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numConta, String cpf, double taxa, double saldo) {
        super(numConta, cpf, taxa, saldo);
    }

    public void debitar(double valor) {
        valor = valor + 0.30;
        super.debitar(valor);
    }

}
