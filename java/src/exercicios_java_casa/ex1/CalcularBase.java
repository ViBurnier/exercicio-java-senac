package exercicios_java_casa.ex1;

public class CalcularBase {
    private double base, altura;

    public CalcularBase(double base, double altura){
        this.base = base;
        this.altura = altura;
    };

    public double resultado(){
        double resultado;
        if(base > 0 && altura > 0){
            resultado = altura * base;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public static void main(String[] args) {
        CalcularBase calcular = new CalcularBase(10, 5);
        System.out.println("O resultado da area e: " + calcular.resultado());
    }



}
