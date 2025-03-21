package exercicios_senac.ex4;


public class Manager extends Employee{
    public String cargo;

    public Manager(String name, double salary, String cargo){
        super(name, salary);
        this.cargo = cargo;
    }

    @Override
    public void infoFuncionario(){
        super.infoFuncionario();
        System.out.println("Cargo: " + cargo);
    }



}