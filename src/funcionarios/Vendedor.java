package funcionarios;

import funcionarios.models.Bonificacao;
import funcionarios.models.Endereco;
import funcionarios.models.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements Bonificacao {
    private double valorBonificacao;

    public Vendedor(String nome, String documento, Double valorSalario, Endereco endereco, double porcentagem) {
        super(nome, documento, valorSalario, endereco);
        this.valorBonificacao = calculaBonificacao(porcentagem);
    }

    @Override
    public double calculaBonificacao(double porcentagem) {
        return super.getValorSalario() + porcentagem/100d;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "Bonificacao=" + valorBonificacao +
                '}';
    }
}
