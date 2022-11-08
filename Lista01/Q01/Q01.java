package Lista01.Q01;

public class Q01 {
    private int valor;

    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }

    public String parImpar(){
        if(valor % 2 == 0){
            return "par";
        } else {
            return "impar";
        }
    }
}
