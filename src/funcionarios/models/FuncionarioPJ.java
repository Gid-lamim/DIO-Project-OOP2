package funcionarios.models;

public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private int horasTrabalhadas;
    private double valorHora;
    private double valorRemuneracao;

    public FuncionarioPJ(String nome, String documento, int horasTrabalhadas, double valorHora, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.valorRemuneracao = calculaRemuneracao();
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco.getRua() +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneracao=" + valorRemuneracao +
                '}';
    }

    public double calculaRemuneracao(){
        return  horasTrabalhadas * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }
}
