import java.util.Scanner;
public class conicSection {
	static Scanner keyboard = new Scanner(System.in);
	private double a;
	private double b;
	private double c;
	private double h;
	private double k;
	private String conic;
	private String hv;
	public conicSection(String conic, String hv, double a, double b, double c, double h, double k) {
		this.conic = conic;
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
		this.k = k;
		this.hv = hv;
	}
	public void seta(double a) {
		this.a = a;
	}
	public void setb(double b) {
		this.b = b;
	}
	public void setc(double c) {
		this.c = c;
	}
	public void seth(double h) {
		this.h = h;
	}
	public void setk(double k) {
		this.k = k;
	}
	public void setConic(String conic) {
		this.conic = conic;
	}
	public void sethv(String hv) {
		this.hv = hv;
	}
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	public double getc() {
		return c;
	}
	public double geth() {
		return h;
	}
	public double getk() {
		return k;
	}
	public String getConic() {
		return conic;
	}
	public String gethv() {
		return hv;
	}
	public String formula() {
		String formula = "";
		switch(conic) {
		case "ELLIPSE":
			formula = "((x -"+h+")/"+(a*a)+") + ((y - "+k+")/"+(b*b)+") = 1";
			break;
		case "HYPERBOLA":
			if (hv.equals("H")) {
				formula = "((x -"+h+")/"+(a*a)+") - ((y - "+k+")/"+(b*b)+") = 1";
			}
			else if (hv.equals("V")) {
				formula = "((y -"+k+")/"+(a*a)+") - ((x - "+h+")/"+(b*b)+") = 1";
			}
			else {
				System.out.println("Error");
				System.exit(0);
			}
			break;
		case "PARABOLA":
			if (hv.equals("H")) {
				formula = "y = (1/"+(4*a)+")(x - "+h+")^2 + "+k;
			}
			else if (hv.equalsIgnoreCase("V")) {
				formula = "x = (1/"+(4*a)+")(y - "+k+")^2 + "+h;
			}
			else {
				System.out.println("Error");
				System.exit(0);
			}
			break;
		case "CIRCLE":
			formula = "(x - "+h+")^2 - (y - "+k+")^2 = "+(a*a);
			break;
		}
		return "The equation is "+formula;
	}
	public double calcC() {
		double cc = 0;
		switch(conic) {
			case "ELLIPSE":
			if (a > b) {
				cc = (a*a)-(b*b);
				cc = Math.sqrt(cc);
			}
			else if (b > a) {
				cc = (b*b)-(a*a);
				cc = Math.sqrt(cc);
			}
			else {
				System.out.println("Circle"); 
			}
				break;
			case "HYPERBOLA":
				cc = (a*a)+(b*b);
				cc = Math.sqrt(cc);
				break;
			}
		cc = Double.parseDouble(String.format("%.2f", cc));
		return cc;
	}
	public String center() {
		return "The center is ("+h+", "+k+")";
	}
	public String foci() {
		String foci = "";
		switch(conic) {
			case "ELLIPSE":
				if (b > a) {
					String foci1 = "("+h+", "+(k+c)+")";
					String foci2 = "("+h+", "+(k-c)+")";
					foci = "The foci are "+foci1+" and "+foci2;
				}
				else {
					String foci1 = "("+(h+c)+", "+k+")";
					String foci2 = "("+(h-c)+", "+k+")";
					foci = "The foci are "+foci1+" and "+foci2;
				}
				break;
			case "HYPERBOLA":
				if (hv.equals("h")) {
					String foci1 = "("+(h+c)+", "+k+")";
					String foci2 = "("+(h-c)+", "+k+")";
					foci = "The foci are "+foci1+" and "+foci2;
				}
				else {
					String foci1 = "("+h+", "+(k+c)+")";
					String foci2 = "("+h+", "+(k-c)+")";
					foci = "The foci are "+foci1+" and "+foci2;
				}
				break;
			case "PARABOLA":
			if (hv.equals("H")) {
				String foci1 = "("+h+", "+(k+a)+")";
				foci = "The foci is "+foci1;
			}
			else {
				String foci1 = "("+(h+a)+", "+k+")";
				foci = "The foci is "+foci1;
			}
				break;
		}
		return foci;
	}
	public String vertices() {
		String vertex = "";
		switch(conic) {
			case "ELLIPSE":
				String vertex1 = "("+(h+a)+", "+k+")";
				String vertex2 = "("+(h-a)+", "+k+")";
				String vertex3 = "("+h+", "+(k+b)+")";
				String vertex4 = "("+h+", "+(k-b)+")";
				vertex = "The vertexes are "+vertex1+", "+vertex2+", "+vertex3+", "+vertex4;
				break;
			case "HYPERBOLA":
				if (hv.equals("H")) {
					vertex1 = "("+(h+a)+", "+k+")";
					vertex2 = "("+(h-a)+", "+k+")";
					vertex = "The vertexes are "+vertex1+", "+vertex2;
				}
				else {
					vertex1 = "("+h+", "+(k+a)+")";
					vertex2 = "("+h+", "+(k-a)+")";
					vertex = "The vertexes are "+vertex1+", "+vertex2;
				}
				break;
			}
		return vertex;
	}
	public String directrix() {
		if (hv.equals("H")) {
			return "x = "+h+" - "+a;
		}
		else {
			return "y = "+k+" - "+a;
		}
	}
	public String asymptotes() {
		String asym = "";
		if (hv.equals("H")) {
			String asym1 = "y = ("+b+"/"+a+")(x - "+h+") +"+k;
			String asym2 = "y = -("+b+"/"+a+")(x - "+h+") +"+k;
			asym = "The asymptotes are "+asym1+" and "+asym2;
		}
		else {
			String asym1 = "x = ("+a+"/"+b+")(y - "+k+") +"+h;
			String asym2 = "x = -("+a+"/"+b+")(y - "+k+") +"+h;
			asym = "The asymptotes are "+asym1+" and "+asym2;
		}
		return asym;
	}
	public double eccentricity() {
		double eccentricity = 0;
		switch(conic) {
			case "ELLIPSE":
				eccentricity = (c/a);
				eccentricity = Double.parseDouble(String.format("%.2f", eccentricity));
				break;
			case "HYPERBOLA":
				eccentricity = (c/a);
				eccentricity = Double.parseDouble(String.format("%.2f", eccentricity));
				break;
			case "PARABOLA":
				eccentricity = 1;
				break;
			case "CIRCLE":
				eccentricity = 0;
				break;
			}
		return eccentricity;
	}
	public static void main(String[] args) {
		conicSection c1 = new conicSection("", "", 0, 0, 0, 0, 0);
		System.out.print("What kind of conic section do you want to graph? ");
		String conic = keyboard.nextLine();
		conic = conic.toUpperCase();
		if ((!conic.equals("ELLIPSE")) && (!conic.equals("HYPERBOLA")) && (!conic.equals("PARABOLA")) && (!conic.equals("CIRCLE"))) {
			System.out.println("Not a conic section");
			System.exit(0);
		}
		c1.setConic(conic);
		System.out.print("h = ");
		double h = keyboard.nextDouble();
		c1.seth(h);
		System.out.print("k = ");
		double k = keyboard.nextDouble();
		c1.setk(k);
		switch(conic) {
		case "ELLIPSE":
			System.out.print("a = ");
			double a = keyboard.nextDouble();
			c1.seta(a);
			System.out.print("b = ");
			double b = keyboard.nextDouble();
			c1.setb(b);
			System.out.println(c1.formula());
			System.out.println(c1.center());
			double c = c1.calcC();
			c1.setc(c);
			System.out.println(c1.foci());
			System.out.println(c1.vertices());
			break;
		case "HYPERBOLA":
			System.out.print("a = ");
			a = keyboard.nextDouble();
			c1.seta(a);
			System.out.print("b = ");
			b = keyboard.nextDouble();
			c1.setb(b);
			System.out.print("Horizontal or vertical? (h or v) ");
			String hv = keyboard.next();
			hv = hv.toUpperCase();
			c1.sethv(hv);
			System.out.println(c1.formula());
			System.out.println(c1.center());
			c1.setc(c1.calcC());
			System.out.println(c1.foci());
			System.out.println(c1.vertices());
			System.out.println(c1.asymptotes());
			break;
		case "PARABOLA":
			System.out.print("p = ");
			double p = keyboard.nextDouble();
			c1.seta(p);
			System.out.print("Horizontal or vertical? (h or v) ");
			hv = keyboard.next();
			hv = hv.toUpperCase();
			c1.sethv(hv);
			System.out.println(c1.formula());
			System.out.println(c1.center());
			System.out.println(c1.foci());
			System.out.println(c1.directrix());
			break;
		case "CIRCLE":
			System.out.print("Radius: ");
			double radius = keyboard.nextDouble();
			c1.seta(radius);
			System.out.println(c1.formula());
			System.out.println(c1.center());
			break;
		}
		System.out.println("The eccentricity is "+c1.eccentricity());
	}
}
