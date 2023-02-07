import javax.swing.*;

public class Pessoa {
    int idade;

    public String retornaFaixaEtaria(){
        if (this.idade < 0){
            return "Feto";
        }
        else if (this.idade < 12 ) {
            return "Criança";
        }
        else if (this.idade < 18) {
            return "Adolescente";
        }
        else if (this.idade < 60) {
            return "Adulto";
        }
        else if (this.idade < 140){
            return "Idoso";
        }
        else{
            return "Morto";
        }
    }

    public Pessoa() {
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
