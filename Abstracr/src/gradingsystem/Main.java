package gradingsystem;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 3 grades (separated by spaces):");

        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No grades entered!");
            return;
        }

        String[] parts = input.trim().split("\\s+");
        if (parts.length != 3) {
            JOptionPane.showMessageDialog(null, "Please enter exactly 3 grades!");
            return;
        }

        double[] grades = new double[3];
        for (int i = 0; i < 3; i++) {
            grades[i] = Double.parseDouble(parts[i]);
        }

        Student student = new GradeCalculator(grades);
        double average = student.calculateAverage();

        JOptionPane.showMessageDialog(null, "Average = " + String.format("%.1f", average));
    }
}