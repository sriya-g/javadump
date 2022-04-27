import java.util.Scanner;
import java.lang.Math;
public class vectorz3 {
	public int ax, ay, bx, by;
	static Scanner keyboard = new Scanner(System.in);
	public vectorz3() {
		System.out.print("What is the x coordinate of vector A? ");
		ax = keyboard.nextInt();
		System.out.print("What is the y coordinate of vector A? ");
		ay = keyboard.nextInt();
		System.out.print("What is the x coordinate of vector B? ");
		bx = keyboard.nextInt();
		System.out.print("What is the y coordinate of vector B? ");
		by = keyboard.nextInt();
	}
	public void setax(int ax) {
		this.ax = ax;
	}
	public void setay(int ay) {
		this.ay = ay;
	}
	public void setbx(int bx) {
		this.bx = bx;
	}
	public void setby(int by) {
		this.by = by;
	}
	public int getax() {
		return ax;
	}
	public int getay() {
		return ay;
	}
	public int getbx() {
		return bx;
	}
	public int getby() {
		return by;
	}
	public String toString() {
		return "A = <"+ax+", "+ay+"> \nB = <"+bx+", "+by+">";
	}
	public String addVector() {
		int rx = ax + bx;
		int ry = ay + by;
		return "<"+ax+", "+ay+"> + <"+bx+", "+by+"> = <"+rx+", "+ry+">";
	}
	public String subtVector() {
		int rx = ax - bx;
		int ry = ay - by;
		return "<"+ax+", "+ay+"> - <"+bx+", "+by+"> = <"+rx+", "+ry+">";
	}
	public String ijVector() {
		return "A = "+ax+"i + "+ay+"j \nB= "+bx+"i + "+by+"j";
	}
	public String scaleVector(int scalar) {
		int sax = ax*scalar;
		int say = ay*scalar;
		int sbx = bx*scalar;
		int sby = by*scalar;
		return "A = <"+sax+", "+say+"> \nB = <"+sbx+", "+sby+">";
	}
	public String dotProd() {
		int prod = (ax*bx)+(ay*by);
		return "The dot product is "+prod;
	}
	public String angle() {
		int prod = (ax*bx)+(ay*by);
		double aProd = Math.sqrt((ax*ax)+(ay*ay));
		double bProd = Math.sqrt((bx*bx)+(by*by));
		double angle = prod/(aProd*bProd);
		angle = Math.acos(angle);
		angle = Math.toDegrees(angle);
		angle = Math.round(angle*100.0)/100.0;
		return "Interior angle = "+angle+" degrees.";
	}
	public String mag() {
		double mag = Math.sqrt((ax*ax)+(ay*ay));
		mag = Math.round(mag*100.0)/100.0;
		double mag2 = Math.sqrt((bx*bx)+(by*by));
		mag2 = Math.round(mag2*100.0)/100.0;
		return "The magnitude of <"+ax+", "+ay+"> is "+mag+"\nThe magnitude of <"+bx+", "+by+"> is "+mag2;
		
	}
	public static void main(String[] args) {
		vectorz3 v1 = new vectorz3();
		System.out.println("\n"+v1);
		int input;
		System.out.println("\nend = 0\nadd =  1\nsubtract = 2\nscalar multiplication = 3\nij = 4\ndot product = 5\nangle = 6\nChange Vectors = 7\nMagnitude = 8");
		while(true) {
			System.out.print("\nWhich operation do you want to do? ");
			input = keyboard.nextInt();
			if (input == 1) {
				System.out.println(v1.addVector());
			}
			if (input == 2) {
				System.out.println(v1.subtVector());
			}
			if (input == 4) {
				System.out.println(v1.ijVector());
			}
			if (input == 3) {
				System.out.print("What is the scalar? ");
				int scalar = keyboard.nextInt();
				System.out.println(v1.scaleVector(scalar));
			}
			if (input == 5) {
				System.out.println(v1.dotProd());
			}
			if (input == 6) {
				System.out.println(v1.angle());
			}
			if (input == 7) {
				v1 = new vectorz3();
				System.out.println("\n"+v1);
			}
			if (input == 8) {
				System.out.println(v1.mag());
			}
			if (input == 0) {
				break;
			}
		}
	}
}
