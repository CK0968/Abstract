package vehicle;

import javax.swing.JOptionPane;

class Car implements Vehicle {
    private int speed = 0;
    
    @Override
    public void start() {
        JOptionPane.showMessageDialog(null, "Car started.");
    }
    
    @Override
    public void speedUp(int increment) {
        speed += increment;
        JOptionPane.showMessageDialog(null, "Car speed: " + speed + " km/h");
    }
}