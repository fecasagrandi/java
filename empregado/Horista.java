package empregado;
public class Horista extends Empregado {
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(int numero, String nome, double valorHora, int horasTrabalhadas) {
        super(numero, nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double valorSalario() {
        return valorHora * horasTrabalhadas;
    }
}