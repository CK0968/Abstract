package printer;

import javax.swing.JOptionPane;

class TextPrinter implements Printable {
    @Override
    public void print(String content) {
        JOptionPane.showMessageDialog(null, "Printing text: " + content);
    }
}