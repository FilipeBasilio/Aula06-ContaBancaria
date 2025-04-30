import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ContaBancaria {
    private double saldo;
    private final Date dataAbertura;

    // Construtor sem argumentos
    public ContaBancaria() {
        this.saldo = 0.00;
        this.dataAbertura = new Date(); // data atual
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Getter para data de abertura
    public Date getDataAbertura() {
        return dataAbertura;
    }

    // Retorna a data de abertura formatada como "dd/MM/yyyy"
    public String getDataAberturaFormatada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataAbertura);
    }

    // Retorna o saldo formatado como moeda brasileira (R$)
    public String getSaldoFormatado() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return nf.format(saldo);
    }

    // Depositar valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Sacar valor da conta (sem permitir saldo negativo)
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
