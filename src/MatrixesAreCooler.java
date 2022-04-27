import java.util.Scanner;
public class MatrixesAreCooler {
	private double a, b, c, d, e, f, g, h, i;
	public MatrixesAreCooler(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
	}
	public MatrixesAreCooler() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the values for your 3x3 matrix.");
		System.out.print("a: ");
		a = keyboard.nextDouble();
		System.out.print("b: ");
		b = keyboard.nextDouble();
		System.out.print("c: ");
		c = keyboard.nextDouble();
		System.out.print("d: ");
		d = keyboard.nextDouble();
		System.out.print("e: ");
		e = keyboard.nextDouble();
		System.out.print("f: ");
		f = keyboard.nextDouble();
		System.out.print("g: ");
		g = keyboard.nextDouble();
		System.out.print("h: ");
		h = keyboard.nextDouble();
		System.out.print("i: ");
		i = keyboard.nextDouble();
		//keyboard.close(); to close
	}
	public String toString() {
		return a+"\t"+b+"\t"+c+"\n"+d+"\t"+e+"\t"+f+"\n"+g+"\t"+h+"\t"+i;
	}
	public boolean isInvertable() {
		boolean isInvertable = true; //dont name the instance variable the same as the method
		double determinant = (a*e*i+b*f*g+c*d*h)-(c*e*g+a*f*h+b*d*i);
		if (determinant == 0) {
			isInvertable = false; //return false;
		}
		return isInvertable; //return true;
	}
	public double detMinor(double a, double b, double c, double d) {
		double detMinor = a*d-b*c;
		return detMinor;
	}
	public MatrixesAreCooler invertMatrix() {
		double ma = detMinor(e, f, h, i);
		double mb = -detMinor(d, f, g, i);
		double mc = detMinor(d, e, g, h);
		double md = -detMinor(b, c, h, i);
		double me = detMinor(a, c, g, i);
		double mf = -detMinor(a, b, g, h);
		double mg = detMinor(b, c, e, f);
		double mh = -detMinor(a, c, d, f);
		double mi = detMinor(a, b, d, e);
		double x = mb;
		double y = mc;
		double z = mf;
		mb = md;
		mc = mg;
		md = x;
		mf = mh;
		mg = y;
		mh = z;
		double determinant = (a*e*i+b*f*g+c*d*h)-(c*e*g+a*f*h+b*d*i);
		double ai = (1/determinant)*ma;
		ai = Math.round(ai*100.0)/100.0;
		double bi = (1/determinant)*mb;
		bi = Math.round(bi*100.0)/100.0;
		double ci = (1/determinant)*mc;
		ci = Math.round(ci*100.0)/100.0;
		double di = (1/determinant)*md;
		di = Math.round(di*100.0)/100.0;
		double ei = (1/determinant)*me;
		ei = Math.round(ei*100.0)/100.0;
		double fi = (1/determinant)*mf;
		fi = Math.round(fi*100.0)/100.0;
		double gi = (1/determinant)*mg;
		gi = Math.round(gi*100.0)/100.0;
		double hi = (1/determinant)*mh;
		hi = Math.round(hi*100.0)/100.0;
		double ii = (1/determinant)*mi;
		ii = Math.round(ii*100.0)/100.0;
		MatrixesAreCooler m1 = new MatrixesAreCooler(ai, bi, ci, di, ei, fi, gi, hi, ii);
		return m1;
	}
	public static void main(String[] args) {
		MatrixesAreCooler m1 = new MatrixesAreCooler();
		System.out.println(m1);
		boolean isInvertable = m1.isInvertable();
		if (isInvertable == false) { //or !isInvertable
			System.out.println("This matrix cannot be inverted.");
		}
		else {
			System.out.println("This matrix can be inverted.");
			System.out.println("Next, the inverse will be displayed.");
			System.out.println(m1.invertMatrix());
		}
	}
}
