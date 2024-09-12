package empregado;
public class Empregado {
    private int numero;
    private String nome;

    public Empregado(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int numero() {
        return numero;
    }

    public String nomeFuncionario() {
        return nome;
    }

    public double valorSalario() {
        throw new UnsupportedOperationException("Unimplemented method 'valorSalario'");
    }
}