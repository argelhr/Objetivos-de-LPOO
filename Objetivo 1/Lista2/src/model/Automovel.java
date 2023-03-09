package model;

import java.util.Objects;

public class Automovel {
    private String renavan,placa,cor,combustivel,chassi;
    private int num_rodas,quilometragem;
    private double valor_locacao;

    public Automovel() {
    }

    public Automovel(String renavan, String placa, String cor, String combustivel, String chassi, int num_rodas, int quilometragem, double valor_locacao) {
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.combustivel = combustivel;
        this.chassi = chassi;
        this.num_rodas = num_rodas;
        this.quilometragem = quilometragem;
        this.valor_locacao = valor_locacao;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(int num_rodas) {
        this.num_rodas = num_rodas;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    @Override
    public String toString() {
        return "Automovel{\n" +
                "renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", chassi='" + chassi + '\'' +
                ", num_rodas=" + num_rodas +
                ", quilometragem=" + quilometragem +
                ", valor_locacao=" + valor_locacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automovel automovel)) return false;
        return Objects.equals(renavan, automovel.renavan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(renavan);
    }
}
