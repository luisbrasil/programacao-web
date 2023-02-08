import javax.swing.*;

public class Numeros {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Digite números separados por vírgula para serem printados na ordem inversa: ");
        String[] valoresInvertidos = inverteVetor(input.split(","));
        for (String valor : valoresInvertidos) {
            System.out.println(valor);
        }
    }

    public static String[] inverteVetor(String[] valores){
        String[] retorno = new String[valores.length];
        for (int i = 0; i < valores.length; i++) {
            retorno[valores.length-1-i] = valores[i].replaceAll("[^0-9.]", "");
        }
        return retorno;
    }
}
