package exercicios_senac.ex10;

public class MathOperations {


    public void sum(double num1, double num2){
        double result = num1 + num2;
        System.out.println(result);

    }

    public void sum(double num1, double num2, double num3){
        double result = num1 + num2 + num3;
        System.out.println(result);
    }

    public static void main(String[] args) {
        MathOperations soma = new MathOperations();

        soma.sum(2, 2);
    }
}
