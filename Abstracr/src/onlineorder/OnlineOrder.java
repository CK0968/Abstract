package onlineorder;
import javax.swing.JOptionPane;
class OnlineOrder implements Order {
    @Override
    public void placeOrder(String itemName) {
        JOptionPane.showMessageDialog(null, "Online order placed for: " + itemName);
    }
}