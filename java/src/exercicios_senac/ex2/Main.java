package exercicios_senac.ex2;

public class Main {
    public static void main(String[] args) {
        Student aluno = new Student();

        aluno.setAluno("Vitor", 12);

        System.out.println("Olá " + aluno.getName() + ", vi que você tem " + aluno.getAge());
    }
}
