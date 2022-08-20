package conta;

//import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		//Scanner input = new Scanner(System.in);

		Integer numeroConta;
		float saldoConta;
		Integer aniverCli;
		float limiteConta;

		numeroConta = 1789;
		saldoConta = 756.90f;
		aniverCli = 15;

		Poupanca poup_01 = new Poupanca(numeroConta, saldoConta, aniverCli);

		numeroConta = 12174;
		saldoConta = 241.95f;
		limiteConta = 02;

		Poupanca poup_02 = new Poupanca(numeroConta, saldoConta, aniverCli);
				
		numeroConta = 3441;
		saldoConta = 10522.00f;
		limiteConta = 50000;
		
		Especial espec_01 = new Especial(numeroConta, saldoConta, limiteConta);
			
		numeroConta = 2049;
		saldoConta = 5840.05f;
		limiteConta = 7000;
		
		Especial espec_02 = new Especial(numeroConta, saldoConta, limiteConta);
		
		System.out.println(poup_01.toString() + "\n");
		System.out.println(poup_02.toString() + "\n");
		System.out.println(espec_01.toString() + "\n");
		System.out.println(espec_02.toString() + "\n");
		
		if(poup_01.debitaSaldo(110.00f)) {
			System.out.println(poup_01.toString());
			System.out.println("Valor debitado!\n");
		} else {
			System.out.println(poup_01.toString());
			System.out.println("Valor NAO debitado devido a falta de saldo!\n");
		}
		
		if(espec_01.debitaSaldo(50000.00f)) {
			System.out.println(espec_01.toString());
			System.out.println("Valor debitado!\n");
		} else {
			System.out.println(espec_01.toString());
			System.out.println("Valor NAO debitado devido a falta de saldo!\n");
		}
	}
}
