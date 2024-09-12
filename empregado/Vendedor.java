package empregado;
public class Vendedor extends Empregado {
    private double salarioBase, valorVendaMes, percComissao;

    public Vendedor(int numero, String nome, double salarioBase, double valorVendaMes, double percComissao) {
        super(numero, nome);
        this.salarioBase = salarioBase;
        this.valorVendaMes = valorVendaMes;
        this.percComissao = percComissao;
    }

    public double valorSalario() {
        return salarioBase + (valorVendaMes * percComissao / 100);
    }
}