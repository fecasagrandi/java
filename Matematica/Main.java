package Matematica;

public class Main {
    public static void main (String[] args) {
        Retangulo ret = new Retangulo(5,3);
        System.out.println("Base = " + ret.retornarBase());
        System.out.println("Altura = " + ret.retornaAltura());
        System.out.println("Area = " + ret.CalcularArea());
        System.out.println("Perimetro = " + ret.CalcularPerimetro());
    }
}
