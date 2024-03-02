package exercicio06.entidades;

public class ContaCorrente {
    private final int numeroConta;
    private String titularConta;
    private double saldoDaConta;

    public ContaCorrente(int numeroConta, String titularConta, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        depositarConta(depositoInicial);
    }

    public ContaCorrente(int numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void depositarConta(double deposito) {
        saldoDaConta += deposito;
    }

    public double taxaDeSaque() {
        return 5.00;
    }

    public void sacarContar(double saque) {
        saldoDaConta -= saque + taxaDeSaque();
    }

    public String toString() {
        return
                String.format("Conta: %d, Titular da Conta: %s, Saldo da conta: R$%.2f.",
                        numeroConta, titularConta, saldoDaConta);

    }

}
