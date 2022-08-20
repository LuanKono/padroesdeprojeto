package trabalho;

public class Principal {
	public static void main(String[] args) {
		//Empregado antonio =  new Empregado(); ***Não é possível instanciar antonio com a classe Empregado, pois a classe Empregado é uma classe abstrata!
		Gerente antonio = new Gerente("Antonio", "antonio@gmail.com", 2004, 6500);
	}
}
