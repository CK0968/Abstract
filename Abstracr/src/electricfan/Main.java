package electricfan;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("Choose appliance (fan/light):").toLowerCase();
        Appliance appliance;

        if (choice.equals("fan")) {
            appliance = new Fan();
        } else if (choice.equals("light")) {
            appliance = new Light();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice!");
            return;
        }

        String action = JOptionPane.showInputDialog("Do you want to turn it ON or OFF?").toLowerCase();
        
        if (action.equals("on")) {
            appliance.turnOn();
        } else if (action.equals("off")) {
            appliance.turnOff();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid action!");
        }
    }
}