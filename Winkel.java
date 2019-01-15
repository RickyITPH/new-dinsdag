import java.util.Scanner;

class Winkel{
	public static void main(String [] args) {
	String again = "yes";
	int totaalWaarde = 0;
	
		do {
		Scanner artikel = new Scanner(System.in);
		System.out.println("Hallo, wat wilt u kopen? " +
		"brood 1," +
		"vlees 2" +
		"of vis 3?");	
		int menuKeuze = artikel.nextInt();

		if (menuKeuze == 1) {
			totaalWaarde += 1;
		} else if (menuKeuze == 2) {
			totaalWaarde += 2;
		} else if (menuKeuze == 3) {
			totaalWaarde += 3;
		}
		System.out.println(totaalWaarde);
		} while (again == "yes");
	}
	
}



