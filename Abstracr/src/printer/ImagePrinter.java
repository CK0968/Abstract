package printer;

import javax.swing.JOptionPane;

class ImagePrinter implements Printable {
    @Override
    public void print(String content) {
        JOptionPane.showMessageDialog(null, "Printing image: " + content);
    }
}
