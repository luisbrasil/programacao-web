import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Cliente {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    int id;
    String nome;
    char sexo;
    String cpf;
    ArrayList<Endereco> enderecos;

    public Cliente() {
    }

    public Cliente(String nome, char sexo, String cpf, ArrayList<Endereco> enderecos) {

        this.id = ID_GENERATOR.getAndIncrement();
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.enderecos = enderecos;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Cliente:" + '\n' +
                "id=" + id + '\n' +
                "nome=" + nome + '\n' +
                "sexo=" + sexo + '\n' +
                "cpf=" + cpf + '\n' +
                "endereco(s)= \n" + enderecos.stream().map(Object::toString).collect(Collectors.joining());
    }

    public int getQuantidadeEnderecos(){
        return enderecos.stream().filter(e -> e.isAtivo() == true).toList().size();
    }

    public String exibirTodosEnderecos(){
        String retorno = "";
        for(Endereco endereco:enderecos){
            retorno += endereco.toString();
        }
        return retorno;
    };

}
