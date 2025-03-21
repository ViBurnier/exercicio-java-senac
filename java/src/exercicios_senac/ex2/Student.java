package exercicios_senac.ex2;

public class Student {
    public String name;
    private int age;

    public void setAluno(String name, int age) {
        if(age > 0){
            this.age = age;
            this.name = name;
        }

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
