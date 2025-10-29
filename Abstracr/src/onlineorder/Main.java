package onlineorder;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String orderType = JOptionPane.showInputDialog("Order type (online/phone):");

        if (orderType == null) return;
        orderType = orderType.trim().toLowerCase();

        String itemName = JOptionPane.showInputDialog("Enter item name:");
        if (itemName == null || itemName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No item entered!");
            return;
        }

        Order order;

        if (orderType.equals("online")) {
            order = new OnlineOrder();
        } else if (orderType.equals("phone")) {
            order = new PhoneOrder();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid order type!");
            return;
        }

        order.placeOrder(itemName);
    }
}