import javax.swing.*;

public class FaixaEtaria {
    public static void main(String[] args){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade:"));
        Pessoa pessoa = new Pessoa(idade);
        JOptionPane.showMessageDialog(null, pessoa.retornaFaixaEtaria());
    }
}