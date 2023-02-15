import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor hora no formato 'xx.xx' "));

        FolhaDePagamento folha1 = new FolhaDePagamento(horasTrabalhadas, valorHora);
        folha1.calculaFolhaPagamento();

    }
}