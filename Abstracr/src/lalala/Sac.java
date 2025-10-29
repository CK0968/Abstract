package lalala;

import javax.swing.JOptionPane;

public class Sac {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("Choose a shape (circle/rectangle):");

        if (choice.equalsIgnoreCase("circle")) {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
            Shape circle = new Circle(radius);
            JOptionPane.showMessageDialog(null, "Area of Circle: " + circle.calculateArea());
        } 
        else if (choice.equalsIgnoreCase("rectangle")) {
            double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length:"));
            double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
            Shape rectangle = new Rectangle(length, width);
            JOptionPane.showMessageDialog(null, "Area of Rectangle: " + rectangle.calculateArea());
        } 
        else {
            JOptionPane.showMessageDialog(null, "Invalid choice!");
        }
    }
}