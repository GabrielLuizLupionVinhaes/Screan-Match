package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracao;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public void exibeFichaTecnica(){
        System.out.println("br.com.alura.screenmatch.modelos.Filme: "+nome);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
