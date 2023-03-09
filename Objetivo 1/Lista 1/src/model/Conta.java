package model;

public class Conta {
    private double saldo = 5;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
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
                "saldo=" + saldo +
                '}';
    }

}
