package funcionarios;

import funcionarios.models.Endereco;
import funcionarios.models.FuncionarioCLT;

public class OperadorDeCaixa  extends FuncionarioCLT {
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

}
