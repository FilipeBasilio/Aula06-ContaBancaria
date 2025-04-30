public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Data de Abertura: " + conta.getDataAberturaFormatada());
        System.out.println("Saldo Inicial: " + conta.getSaldoFormatado());

        conta.depositar(1500.00);
        System.out.println("Após depósito de R$1500,00: " + conta.getSaldoFormatado());

        boolean saque1 = conta.sacar(500.00);
        System.out.println("Saque de R$500,00 realizado: " + saque1);
        System.out.println("Saldo após saque: " + conta.getSaldoFormatado());

        boolean saque2 = conta.sacar(2000.00);
        System.out.println("Tentativa de saque de R$2000,00: " + saque2);
        System.out.println("Saldo final: " + conta.getSaldoFormatado());
    }
}
