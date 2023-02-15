import javax.swing.*;

public class FolhaDePagamento {
    int horasTrabalhadas;
    float valorHora;

    public FolhaDePagamento() {
    }

    public FolhaDePagamento(int horasTrabalhadas, float valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void calculaFolhaPagamento(){
        float salarioBruto = this.valorHora * this.horasTrabalhadas;
        String porcentagemImpostoDeRenda;
        float valorImpostoRenda;
        float valorINSS = salarioBruto*0.10F;
        float valorFGTS = salarioBruto*0.11F;

        if(salarioBruto <= 900){
            porcentagemImpostoDeRenda = "Isento";
            valorImpostoRenda = 0;
        }
        else if(salarioBruto <= 1500 ){
            porcentagemImpostoDeRenda = "5%";
            valorImpostoRenda = salarioBruto * 0.05F;
        }
        else if(salarioBruto <= 2500){
            porcentagemImpostoDeRenda = "10%";
            valorImpostoRenda = salarioBruto * 0.1F;
        }
        else{
            porcentagemImpostoDeRenda = "20%";
            valorImpostoRenda = salarioBruto * 0.2F;
        }

        String folhaDePagamento = String.format("Salário Bruto: (%.2f * %d) : R$%.2f\n",this.valorHora,this.horasTrabalhadas,salarioBruto) +
                String.format("(-) IR (%s)                        : R$%.2f\n",porcentagemImpostoDeRenda,valorImpostoRenda) +
                "(-) INSS (10%)                   : " + String.format("R$%.2f\n",valorINSS) +
                "FGTS (11%)                       : " + String.format("R$%.2f\n",valorFGTS) +
                String.format("Total de descontos        : R$%.2f\n",valorINSS + valorImpostoRenda) +
                String.format("Salário Líquido                : R$%.2f\n",salarioBruto - valorINSS - valorImpostoRenda);


        JOptionPane.showMessageDialog(null,folhaDePagamento);
    }

}
