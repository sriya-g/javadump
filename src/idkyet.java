import javax.swing.*;
import java.util.Random;
public class idkyet {
    static Random r = new Random();
    private String name;
    private int age;
    private String color;
    private String type;
    public idkyet(String name, int age, String color, String type) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public String toString() {
        return "This pet is a "+color+" "+type+" named "+name+". It is "+age+" years old.";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Congrats on your new pet!");
        String typ = JOptionPane.showInputDialog("Enter pet species: ");
        String nam = JOptionPane.showInputDialog("Enter pet name: ");
        String[] possibleColors = {"Red", "Blue", "Yellow", "Green", "Tan", "Hairless", "Purple", "Brown", "Gray", "Gold", "Silver"};
        int rand = r.nextInt(possibleColors.length);
        String colo = possibleColors[rand];
        int ag = r.nextInt(15);
        idkyet p1 = new idkyet(nam, ag, colo, typ);
        JOptionPane.showMessageDialog(null, p1.toString());
    }
}
