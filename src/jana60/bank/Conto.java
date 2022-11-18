package jana60.bank;

import java.util.Random;

public class Conto{
	
	public String name;
	private int iban;
	private int saldo = 0;
	
	public Conto(String name,int iban,int saldo) {

		this.name = name;
		Random rnd = new Random();
		this.iban = rnd.nextInt(99999);
		this.saldo = saldo;
	}
	public int getIban() {
		
		return iban;
	}
	public void setIban(int iban) {
		
		this.iban = iban;
	}
	public int getSaldo() {
		
		return saldo;
	}
	public void setSaldo(int saldo) {
		
		this.saldo = saldo;
	}



public String toString() {
		
		return "Nome Titolare: " + name
				+ "\nIban contocorrente: " + iban
				+ "\nil saldo attuale è: " + saldo;
	}
}
