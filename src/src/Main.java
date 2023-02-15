import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 =  new Endereco("Paraná","Paranavaí","Sumaré","Rua Papabarro",157);
        endereco1.setAtivo(false);
        Endereco endereco2 =  new Endereco("Paraná","Paranavaí","Centro","Rua Casanova",222);
        ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
        enderecos.add(endereco1);
        enderecos.add(endereco2);

        Cliente cliente = new Cliente("Marcio", 'M',"157.420.123-45",enderecos);

        JOptionPane.showMessageDialog(null,cliente.toString());
        JOptionPane.showMessageDialog(null,"A quantidade de endereços ativos é: "+ cliente.getQuantidadeEnderecos());
        JOptionPane.showMessageDialog(null,cliente.exibirTodosEnderecos());


    }
}