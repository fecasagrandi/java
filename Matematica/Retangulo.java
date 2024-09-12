package Matematica;

public class Retangulo {
    private int Base, Altura;

    public Retangulo(int b, int a) {
        Base = b;
        Altura = a;
    }
    public int retornarBase(){
        return Base;
    }
    public int retornaAltura(){
        return Altura;
    }
    public int CalcularArea(){
        return retornarBase() * retornaAltura();
    }
    public int CalcularPerimetro(){
        return retornarBase() * 2 + retornaAltura() * 2;
    }
}
