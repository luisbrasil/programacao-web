import javax.swing.*;

public class OrdenaVetor {
    public static void main(String[] args){
        String valores = JOptionPane.showInputDialog("Digite 3 valores separados por virgula: ");
        String[] valoresSplitados = valores.split(",");
        int[] valoresInteiros = new int[valoresSplitados.length];
        for (int i = 0; i < valoresSplitados.length; i++){
            valoresInteiros[i] = Integer.parseInt(valoresSplitados[i]);
        }
        int[] vetorOrdenado = vetorSort(valoresInteiros);
        printaVetorInteiro(vetorOrdenado);
    }

    public static int[] vetorSort(int[] vetor){
        for (int i = 0; i<vetor.length-1; i++){
            for (int j = 0; i < vetor.length-1-j; j++){
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    };

    public static void printaVetorInteiro(int[] vetor){
        String vetorString = "";
        for(int i = 0; i < vetor.length; i++){
            vetorString += vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null,vetorString);
    }
}
