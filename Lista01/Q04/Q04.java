package Lista01.Q04;

public class Q04 {
    private float resultado;

    public float getResultado() {
        return this.resultado;
    }
    public void calculaImposto(Float salario){
        if(salario <= 2000){
            this.resultado = salario;
        } else if(salario <= 3500) {
            this.resultado = salario * 115;
            this.resultado = this.resultado / 100;
        } else if(salario <= 5000) {
            this.resultado = salario * 122;
            this.resultado = this.resultado / 100;
        }
        else {
            this.resultado = salario * 130;
            this.resultado = this.resultado / 100;
        }
    }
}
