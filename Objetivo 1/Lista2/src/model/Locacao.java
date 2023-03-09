package model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Locacao {
    private int OS;
    private LocalDate dataLocacao,dataDevolucao;
    private LocalTime horaLocacao,horaDevolucao;
    private int quilometragem;
    private double valorCalcao,valor_locacao;
    private boolean devolvido;

    public Locacao() {
    }

    public Locacao(int OS, LocalDate dataLocacao, LocalDate dataDevolucao, LocalTime horaLocacao, LocalTime horaDevolucao, int quilometragem, double valorCalcao, double valor_locacao, boolean devolvido) {
        this.OS = OS;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaLocacao = horaLocacao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public int getOS() {
        return OS;
    }

    public void setOS(int OS) {
        this.OS = OS;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalTime horaDevolucao) {
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
                "OS=" + OS +
                ", dataLocacao=" + dataLocacao +
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