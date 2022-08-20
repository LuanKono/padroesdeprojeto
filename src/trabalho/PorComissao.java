package trabalho;

public class PorComissao extends Empregado {

	private float salario;
	private float comissao;
	private int vendas;

	public PorComissao(String nome, String email, int anoContratacao, float salario) {
		super(nome, email, anoContratacao);
		this.setSalario(salario);
		this.setComissao(comissao);
		this.setVendas(vendas);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public float ganha() {
		float salario = (this.salario + this.comissao) * this.vendas;
		return salario;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nEmail: " + this.getEmail() + "\nAno de contratação: " + this.getAnoContratacao() + "\nSalario: " + this.salario + "\nComissão: " + this.comissao + "\nVendas: " + this.vendas;
	}

}
