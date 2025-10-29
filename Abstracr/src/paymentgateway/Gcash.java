package paymentgateway;

import javax.swing.JOptionPane;

class Gcash implements Payment {
    @Override
    public void processPayment(double amount) {
        JOptionPane.showMessageDialog(null, "Paid " + amount + " using Gcash.");
    }
}