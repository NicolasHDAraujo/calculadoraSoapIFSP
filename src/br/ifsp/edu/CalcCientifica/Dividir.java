package br.ifsp.edu.CalcCientifica;

public class Dividir implements ServicoInterface{
     private double valorInputA;
    private double valorInputB;
    private String operacao = "Divisao";
    private String tipoCalculo = "Simples";
    
    
    
    @Override
    public double calcular() throws Exception{
        return valorInputA / valorInputB;
    }

    public double getValorInputA() {
        return valorInputA;
    }

    public void setValorInputA(double valorInputA) {
        this.valorInputA = valorInputA;
    }

    public double getValorInputB() {
        return valorInputB;
    }

    public void setValorInputB(double valorInputB) {
        this.valorInputB = valorInputB;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public boolean operacaoE(String operacao){
        if (this.operacao.equals(operacao)){
            return true;
        }
        return false;
    }

    public String getTipoCalculadora() {
        return tipoCalculo;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculo = tipoCalculadora;
    }

    @Override
    public boolean calculoE(String tipoCalculo) {
        return true;
    }
}
