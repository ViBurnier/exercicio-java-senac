package exercicios_senac.ex8;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 2010);
        Car car2 = new Car("VolksWagen", 2017);

        System.out.println("Carro 1: " + car1.brand + ", " +  car1.year);
        System.out.println("Carro 2: " + car2.brand + ", " +  car2.year );


    }
}
