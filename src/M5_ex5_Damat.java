import java.util.ArrayList;
import java.util.Scanner;

public class M5_ex5_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables:
		int edat = 0;
		String nom = "";
		boolean titolB = false;
		boolean aturB = false;
		String titol = "";
		String atur = "";
		int numBeques = 5;
		int i = 0;		
		
		ArrayList<String> nomsBeques = new ArrayList<String>();	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tenim 5 beques disponibles!");
		System.out.println("");
		
		while(i < numBeques) {
			System.out.println("Quin es el teu nom?: ");
			nom = entrada.next();
			nomsBeques.add(nom);
			System.out.println("Quina edat tens?: ");
			edat = entrada.nextInt();
			System.out.println("Disposes d´un títol universitari?: (Si/No)");
			titol = entrada.next();
			titolB = (titol.equalsIgnoreCase("si")) ? true: false;
			System.out.println("Estas a l´atur?:");
			atur = entrada.next();
			aturB = (atur.equalsIgnoreCase("si")) ? true :false;
				if ((aturB) || (titolB && (edat >=18))) {
				System.out.println("Beca atorgada, felicitats!");
				System.out.println("");
				i++;
				}else {
				System.out.println("Ho sentim, no et podem atorgar la Beca, mes sort a la vida! Pau i amor!");
				System.out.println("");
				}//if
	
			}//while
		
			System.out.println("Els alumnes que han aconseguit una beca son: " + nomsBeques); 
	}

}
