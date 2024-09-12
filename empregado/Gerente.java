package empregado;
public class Gerente extends Empregado {
    private double salarioMensal;

    public Gerente (int numero, String nome, double salarioMensal) {
        super(numero, nome);
        this.salarioMensal = salarioMensal;
    }

    public double valorSalario() {
        return salarioMensal;
    }
}
