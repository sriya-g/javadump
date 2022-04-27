import java.util.Scanner;
public class rotation {
	static Scanner keyboard = new Scanner(System.in);
	private double A;
	private double B;
	private double C;
	private double D;
	private double E;
	private double F;
	private double theta;
	public rotation(double A, double B, double C, double D, double E, double F, double theta) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		this.E = E;
		this.F = F;
		this.theta = theta;
	}
	public void setA(double A) {
		this.A = A;
	}
	public void setB(double B) {
		this.B = B;
	}
	public void setC(double C) {
		this.C = C;
	}
	public void setD(double D) {
		this.D = D;
	}
	public void setE(double E) {
		this.E = E;
	}
	public void setF(double F) {
		this.F = F;
	}
	public void setTheta(double theta) {
		this.theta = theta;
	}
	public double getA() {
		return A;
	}
	public double getB() {
		return B;
	}
	public double getC() {
		return C;
	}
	public double getD() {
		return D;
	}
	public double getE() {
		return E;
	}
	public double getF() {
		return F;
	}
	public double getTheta() {
		return theta;
	}
	public String toString() {
		return A+"x^2 + "+B+"xy + "+C+"y^2 + "+D+"x + "+E+"y + "+F+" = 0";
	}
	public String calcSection() {
		double discriminant = (B*B) - 4*A*C;
		if (discriminant < 0 && A == C) {
			return "Circle";
		}
		else if (discriminant < 0 && A != C) {
			return "Ellipse";
		}
		else if (discriminant == 0) {
			return "Parabola";
		}
		else {
			return "Hyperbola";
		}
	}
	public double calcTheta() {
		double theta = (A-C)/B;
		theta = Math.atan(1/theta);
		theta = theta/2;
		theta = Double.parseDouble(String.format("%.2f", theta));
		return theta;
	}
	public String calcNew() {
		double cosTheta = Math.cos(theta);
		double sinTheta = Math.sin(theta);
		double a = (A*cosTheta*cosTheta)+(C*sinTheta*sinTheta)+(B*sinTheta*cosTheta);
		a = Double.parseDouble(String.format("%.2f", a));
		double b = (-A*2*sinTheta*cosTheta)+(C*2*sinTheta*cosTheta)+(B*(2*cosTheta*cosTheta - 1));
		b = Double.parseDouble(String.format("%.2f", b));
		b = 0; //may not be 0 already due to rounding theta
		double c = (A*sinTheta*sinTheta)-(B*sinTheta*cosTheta)+(C*cosTheta*cosTheta);
		c = Double.parseDouble(String.format("%.2f", c));
		double d = (D*cosTheta) + (E*sinTheta);
		d = Double.parseDouble(String.format("%.2f", d));
		double e = -(D*sinTheta) + (E*cosTheta);
		e = Double.parseDouble(String.format("%.2f", e));
		return a+"x^2 + "+b+"xy + "+c+"y^2 + "+d+"x + "+e+"y + "+F+" = 0";
	}
	public static void main(String[] args) {
		System.out.println("Ax^2 + Bxy +Cy^2 + Dx + Ey + F = 0");
		System.out.print("A: ");
		Double A = keyboard.nextDouble();
		System.out.print("B: ");
		Double B = keyboard.nextDouble();
		System.out.print("C: ");
		Double C = keyboard.nextDouble();
		if (A == 0 && B == 0 && C == 0) {
			System.out.println("Not a conic");
			System.exit(0);
		}
		System.out.print("D: ");
		Double D = keyboard.nextDouble();
		System.out.print("E: ");
		Double E = keyboard.nextDouble();
		System.out.print("F: ");
		Double F = keyboard.nextDouble();
		rotation r1 = new rotation(A, B, C, D, E, F, 0);
		System.out.println(r1);
		System.out.println(r1.calcSection());
		r1.setTheta(r1.calcTheta());
		System.out.println("Theta = "+r1.getTheta()+" radians");
		System.out.println(r1.calcNew());
	}
}
