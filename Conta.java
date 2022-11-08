package questao;

public class Conta {

    private String numConta;
    private String cpf;
    private double taxa;
    private double saldo;

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String numConta, String cpf, double taxa, double saldo) {
        this.numConta = numConta;
        this.cpf = cpf;
        this.taxa = 40;
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        if(valor > 0){
            this.saldo = this.saldo + valor;
        }
    }

    @Override
    public void debitar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        }
    }

    public void atualizar() {
        this.salvdo = this.saldo - taxa;
    }
}

// for (Conta conta: listaContas){                   Percorre a lista de contas (listaContas) e em cada execução ele pega um item da lista, posição por posição
// ...
// }