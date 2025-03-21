package exercicios_senac.ex9;

public class Main {
    public static void main(String[] args) {
        OuterClass externa = new OuterClass();

        OuterClass.InnerClass interna = externa.new InnerClass();
        interna.exibir();
    }
}
