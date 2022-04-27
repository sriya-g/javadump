import java.util.Scanner;
public class ElectronConfig3 {
	public static String s(int numElectrons, int x) {
		String sOrb;
		if (numElectrons <= 0) {
			System.exit(0);
		}
		if (numElectrons < 2) {
			sOrb = x+"s"+String.valueOf(numElectrons);
		}
		else {
			sOrb = x+"s2, ";
		}
		return sOrb;
	}
	public static String p(int numElectrons, int x) {
		String pOrb = "";
		if (numElectrons <= 0) {
			System.exit(0);
		}
		if (numElectrons < 6) {
			pOrb = x+"p"+String.valueOf(numElectrons);
		}
		else {
			pOrb = x+"p6, ";
		}
		return pOrb;
	}
	public static String d(int numElectrons, int x) {
		String dOrb = "";
		if (numElectrons <= 0) {
			System.exit(0);
		}
		if (numElectrons < 10) {
			dOrb = x+"d"+String.valueOf(numElectrons);
		}
		else {
			dOrb = x+"d10, ";
		}
		return dOrb;
	}
	public static String f(int numElectrons, int x) {
		String fOrb = "";
		if (numElectrons <= 0) {
			System.exit(0);
		}
		if (numElectrons < 14) {
			fOrb = x+"f"+String.valueOf(numElectrons);
		}
		else {
			fOrb = x+"f14, ";
		}
		return fOrb;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many electrons does this element have? ");
		int numElectrons = keyboard.nextInt();
		int x = 1;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
		x++;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
		System.out.print(p(numElectrons,x));
		numElectrons = numElectrons - 6;
		x++;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
		System.out.print(p(numElectrons,x));
		numElectrons = numElectrons - 6;
		x++;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
		x--;
		System.out.print(d(numElectrons,x));
		numElectrons = numElectrons - 10;
		x++;
		System.out.print(p(numElectrons,x));
		numElectrons = numElectrons - 6;
		x++;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
		x--;
		System.out.print(d(numElectrons,x));
		numElectrons = numElectrons - 10;
		x++;
		System.out.print(p(numElectrons,x));
		numElectrons = numElectrons - 6;
		x++;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
		x--;
		x--;
		System.out.print(f(numElectrons,x));
		numElectrons = numElectrons - 14;
		x++;
		System.out.print(d(numElectrons,x));
		numElectrons = numElectrons - 10;
		x++;
		System.out.print(p(numElectrons,x));
		numElectrons = numElectrons - 6;
		x++;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
		x--;
		x--;
		System.out.print(f(numElectrons,x));
		numElectrons = numElectrons - 14;
		x++;
		System.out.print(d(numElectrons,x));
		numElectrons = numElectrons - 10;
		x++;
		System.out.print(p(numElectrons,x));
		numElectrons = numElectrons - 6;
		x++;
		System.out.print(s(numElectrons,x));
		numElectrons = numElectrons - 2;
	}
}
