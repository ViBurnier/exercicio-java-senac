package exercicios_senac.ex3;

public class BankAccount {
    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    private double deposit(double newValue){
        if(newValue > 0){
           saldo = getSaldo() + newValue;
           return newValue;
        } else {
            return newValue;
        }
    }

    private double withdraw(double newValue){
        if(getSaldo() > 0 && newValue < getSaldo()){
            saldo = getSaldo() - newValue;
            return newValue;
        }
        else{
            return newValue;
        }
    }

    public void acao(String acao, double valor){
        switch (acao){

            case "deposit":
                if(valor > 0) {
                    System.out.println("Voce depositou: " + deposit(valor));
                }else{
                    System.out.println("Valor incorreto.");
                }
                break;

            case "withdraw":
                if(getSaldo() > 0 && valor < getSaldo()){
                    System.out.println("Voce sacou: " + withdraw(valor));
                } else{
                    System.out.println("Voce nao tem dinheiro o suficiente ou o valor que voce tentou sacar foi menor que 0.");
                }
                break;
        }
    }

    public void acao(String acao){
        switch (acao){
            case "getSaldo":
                System.out.println("Seu saldo e de: " + getSaldo());
                break;

        }
    }

}
