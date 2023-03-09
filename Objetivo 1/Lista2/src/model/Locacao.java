package model;

import java.sql.Time;
import java.util.Date;

public class Locacao {
    private Date dataLocacao,dataDevolucao;
    private Time horaLocacao,horaDevolucao;
    private int quilometragem;
    private double valorCalcao,valor_locacao;
    private boolean devolvido;

    public Locacao() {
    }

    public Locacao(Date dataLocacao, Date dataDevolucao, Time horaLocacao, Time horaDevolucao, int quilometragem, double valorCalcao, double valor_locacao, boolean devolvido) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaLocacao = horaLocacao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Time getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(Time horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public Time getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dataLocacao=" + dataLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", horaLocacao=" + horaLocacao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
