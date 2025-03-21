package exercicios_java_casa.ex2;

import java.time.LocalDate;

public class LerIdade {
    private int year, month, days;

    // Obtém a data atual
    LocalDate dataAtual = LocalDate.now();

    // Extrai o ano, mês e dia
    int anoAtual = dataAtual.getYear();
    int mesAtual = dataAtual.getMonthValue();
    int diaAtual = dataAtual.getDayOfMonth();

    public void setIdade(int days, int month, int year){
        int dias;
        int idade;
        int calculo = 0;
        if(days < 0 || month < 0 || year < 0 || anoAtual < year){
            dias = 0;
            idade = 0;
        }
        else{
            calculo = ((anoAtual - year - 1) * 365) + (((12 - month) * 30) + (30 - days)) + ((mesAtual - 1) * 30) + diaAtual;
            dias = calculo % 365;
            idade = (int) Math.floor(calculo / 365);
        }

        infoUser(idade, dias, calculo);

    }

    public void infoUser(int idade, int dias, int diasTotais){
        if(idade == 0 || dias == 0 || diasTotais == 0){
            System.out.println("Insira sua data de nascimento correta!");
        }
        else{
            System.out.println("Voce tem " + idade + " anos e " + dias + " de existencia");
            System.out.println("Voce existe a " + diasTotais + " dias");
        }
    }

}
