package trabalho;

public class Gerente extends Empregado {
	
	private float salario;

	public Gerente(String nome, String email, int anoContratacao, float salario) {
		super(nome, email, anoContratacao);
		this.setSalario(salario);
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float ganha() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nEmail: " + this.getEmail() + "\nAno de contratação: " + this.getAnoContratacao() + "\nSalario: " + this.salario;
	}
	
}
