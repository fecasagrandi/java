package carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Vectra", 2004, 85000.0);
        Carro carro2 = new Carro("Fiat", "Uno", 2022, 9000.0);

        System.out.println("Informações do carro 1: ");
        carro1.exibirInfo();

        System.out.println("Informações do carro 2: ");
        carro2.exibirInfo();
    }
}