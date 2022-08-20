package conta;

public class Poupanca extends Conta {

	private Integer aniversario;

	public Poupanca(Integer putNumero, float putSaldo, Integer aniversario) {
		super(putNumero, putSaldo);
		this.aniversario = aniversario;
	}

	public Integer getAniversario() {
		return aniversario;
	}

	public void setAniversario(Integer aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "Numero:" + this.getNumero() + "\nSaldo:" + this.getSaldo();
	}

}
