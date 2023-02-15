import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso em kg"));
        char sexo = JOptionPane.showInputDialog("Digite o seu sexo(F ou M)").charAt(0);

        Imc imc = new Imc(peso,altura,sexo);
        JOptionPane.showMessageDialog(null,imc.calculaImc());
    }
}