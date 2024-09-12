package empregado;

public class Main {
    public static void main(String[] args) {
        Vendedor e1 = new Vendedor(1, "Felipe Moreira Casagrandi", 1000, 5000, 0.1);
        Gerente e2 = new Gerente(2, "Peter do Ei nerd", 3000);
        Horista e3 = new Horista(3, "Zoio", 20, 160);

        Empregado maiorSalario = e1; // assumimos que e1 tem o maior salário inicialmente
        if (e2.valorSalario() > maiorSalario.valorSalario()) {
            maiorSalario = e2;
        }
        if (e3.valorSalario() > maiorSalario.valorSalario()) {
            maiorSalario = e3;
        }

        System.out.println("Empregado com o maior salário: " + maiorSalario.nomeFuncionario() + " - Salário: " + maiorSalario.valorSalario());
    }
}
