package paymentsystem;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String type = JOptionPane.showInputDialog("Enter employee type (full/part):");

        if (type == null) return;
        type = type.trim().toLowerCase();

        String name = JOptionPane.showInputDialog("Enter employee name:");
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter rate per hour:"));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));

        Employee emp;

        if (type.equals("full")) {
            emp = new FullTimeEmployee(name, rate);
        } else if (type.equals("part")) {
            emp = new Parttime(name, rate, hours);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid employee type!");
            return;
        }

        double pay = emp.calculatePay();
        JOptionPane.showMessageDialog(null, 
            "Employee: " + name + 
            "\nPay: " + String.format("%.2f", pay)
        );
    }
}
