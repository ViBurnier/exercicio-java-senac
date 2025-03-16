package exercicios_senac.ex3;

public class Main {
    public static void main(String[] args) {
        BankAccount banco = new BankAccount();

        banco.acao("deposit", 100);
        banco.acao("deposit", 50);
        banco.acao("getSaldo");
        banco.acao("withdraw", 20);
        banco.acao("getSaldo");
        banco.acao("deposit", 50);
        banco.acao("getSaldo");
}}
