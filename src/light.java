import java.util.Scanner;
public class light {
	private double wavelength;
	private double frequency;
	private double energy;
	final private double speedoflight = 3e8;
	final private double planck = 6.626e-34;
	public light(double wavelength, double frequency, double energy) {
		this.wavelength = wavelength;
		this.frequency = frequency;
		this.energy = energy;
	}
	public void setWavelength(double wavelength) {
		this.wavelength = wavelength;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public double getWavelength() {
		return wavelength;
	}
	public double getFrequency() {
		return frequency;
	}
	public double getEnergy() {
		return energy;
	}
	public String solveWave() {
		double frequency = speedoflight/wavelength;
		double energy = frequency*planck;
		return "The frequency is "+frequency+" hertz.\nThe energy is "+energy+" joules.";
	}
	public String solveFreq() {
		double wavelength = speedoflight/frequency;
		double energy = frequency*planck;
		return "The wavelength is "+wavelength+" meters.\nThe energy is "+energy+" joules.";
	}
	public String solveEnergy() {
		double frequency = energy/planck;
		double wavelength = speedoflight/frequency;
		return "The wavelength is "+wavelength+" meters.\nThe frequency is "+frequency+" hertz.";
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		light l1 = new light(0, 0, 0);
		System.out.println("0 = end, 1 = wavelength (meters), 2 = frequency (hertz), 3 = energy (joules)");
		while(true) {
			System.out.print("What information do you have? ");
			int input = keyboard.nextInt();
			if (input == 0) {
				break;
			}
			if (input == 1) {
				System.out.print("What is the wavelength? ");
				double wavelength = keyboard.nextDouble();
				l1.setWavelength(wavelength);
				System.out.println(l1.solveWave());
			}
			if (input == 2) {
				System.out.print("What is the frequency? ");
				double frequency = keyboard.nextDouble();
				l1.setFrequency(frequency);
				System.out.println(l1.solveFreq());
			}
			if (input == 3) {
				System.out.print("What is the energy? ");
				double energy = keyboard.nextDouble();
				l1.setEnergy(energy);
				System.out.println(l1.solveEnergy());
			}
		}
	}
}
