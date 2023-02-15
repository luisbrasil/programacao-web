import java.util.concurrent.atomic.AtomicInteger;

public class Endereco {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    int id;
    String estado;
    String cidade;
    String bairro;
    String rua;
    int numero;
    boolean ativo;

    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro, String rua, int numero) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.ativo = true;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Endereco: " + '\n' +
                "id=" + id + '\n' +
                "estado=" + estado + '\n' +
                "cidade=" + cidade + '\n' +
                "bairro=" + bairro + '\n' +
                "rua=" + rua + '\n' +
                "numero=" + numero + '\n' +
                "ativo=" + ativo + '\n' +
                "\n";
    }
}
