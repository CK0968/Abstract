package paymentgateway;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String method = JOptionPane.showInputDialog("Choose payment method (credit/gcash):");

        if (method == null) return;
        method = method.trim().toLowerCase();

        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount:"));

        Payment payment;

        if (method.equals("credit")) {
            payment = new CreditCard();
        } else if (method.equals("gcash")) {
            payment = new Gcash();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid payment method!");
            return;
        }

        payment.processPayment(amount);
    }
}