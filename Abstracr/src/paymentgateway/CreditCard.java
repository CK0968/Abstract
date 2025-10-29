package paymentgateway;

import javax.swing.JOptionPane;

class CreditCard implements Payment {
    @Override
    public void processPayment(double amount) {
        JOptionPane.showMessageDialog(null, "Paid " + amount + " using Credit Card.");
    }
}