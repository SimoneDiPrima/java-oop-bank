package jana60.bank;

import java.util.Scanner;
import java.util.Random;


public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name: ");
		String name = sc.nextLine();
		Random rnd = new Random();
		int iban = rnd.nextInt(99999);
		int saldo = 0;
		Conto c = new Conto(name,iban,saldo);
		System.out.println(c);
		System.out.println("Quanti soldi vuoi aggiungere??");
		int addMoney = sc.nextInt();
		System.out.println("il tuo nuovo saldo sara di :" + addMoney + "€");
		System.out.println("Quanti soldi vuoi prelevare??");
		int getMoney = sc.nextInt();
		saldo = addMoney - getMoney;
		if(saldo <= 0 ) {
			System.out.print("siamo spiacenti il tuo saldo non ti consente di ritirare la cifra richiesta");
		}
		else {
			System.out.print("il tuo nuovo saldo sara di: " + saldo + "€");
		}
	}
}
