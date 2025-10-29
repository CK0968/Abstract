package printer;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String type = JOptionPane.showInputDialog("Choose printer (text/image):");

        if (type == null) return;
        type = type.trim().toLowerCase();

        String content = JOptionPane.showInputDialog("Enter content:");
        if (content == null || content.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No content entered!");
            return;
        }

        Printable printer;

        if (type.equals("text")) {
            printer = new TextPrinter();
        } else if (type.equals("image")) {
            printer = new ImagePrinter();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid printer type!");
            return;
        }

        printer.print(content);
    }
}
