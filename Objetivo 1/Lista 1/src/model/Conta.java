package model;

public class Conta {
    private long numero;
    private double saldo = 5;

    public Conta() {
    }

    public Conta(long numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public void deposita(double aux){
        this.saldo += aux;
    }
    public void sacar(double aux){
        if(aux > this.saldo){
            System.out.println("Saldo insuficiente");
        }
        else
            this.saldo -= aux;
    }

    public void atualiza(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
