import java.lang.String;
public class Q03 {
    private int qtdVogais = 0;

    public int getQtdVogais(){
        return qtdVogais;
    }
    public void setQtdVogais(int qtdVogais){
        this.qtdVogais = qtdVogais;
    }

    public int contaVogais(String palavra){
        int aux;
        System.out.println("Aqui jais a palavra digitada: " + palavra);
        for(aux=0; aux<palavra.length(); aux++){
            char c = palavra.charAt(aux);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                qtdVogais++;
            }
        }
        return qtdVogais;
    }
}
