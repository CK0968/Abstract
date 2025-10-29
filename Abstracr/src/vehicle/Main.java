package vehicle;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        String input = JOptionPane.showInputDialog("Enter speed increment:");
        if (input == null) return;

        int increment = Integer.parseInt(input);
        car.speedUp(increment);
    }
}