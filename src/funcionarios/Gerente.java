package funcionarios;

import funcionarios.models.Bonificacao;
import funcionarios.models.Endereco;
import funcionarios.models.FuncionarioPJ;

public class Gerente extends FuncionarioPJ implements Bonificacao {
    private double valorBonificacao;


    public Gerente(String nome, String documento, int horasTrabalhadas, double valorHora, Endereco endereco, double porcentagem) {
        super(nome, documento, horasTrabalhadas, valorHora, endereco);
        this.valorBonificacao = calculaBonificacao( porcentagem);
    }

    @Override
    public double calculaBonificacao(double porcentagem) {
        return super.getValorRemuneracao() * porcentagem/100d + 100d;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Bonificacao=" + valorBonificacao +
                '}';
    }


}
