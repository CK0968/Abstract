package onlineorder;
import javax.swing.JOptionPane;
class PhoneOrder implements Order {
    @Override
    public void placeOrder(String itemName) {
        JOptionPane.showMessageDialog(null, "Phone order placed for: " + itemName);
    }
}
