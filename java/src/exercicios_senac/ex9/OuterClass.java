package exercicios_senac.ex9;

public class OuterClass {
    String name = "Vitor";

    public class InnerClass{
        public void exibir(){
            System.out.println(name);
        }
    }
}
