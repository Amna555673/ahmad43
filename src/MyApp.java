import javax.swing.*;
import java.awt.*;

public class MyApp {

    private JFrame frame;
    private JPanel buttonPanel;
    private JButton button;
    private JLabel newLabel;

    public MyApp() {
        frame = new JFrame("My Application");
        buttonPanel = new JPanel();
        button = new JButton("Click Me");
        newLabel = new JLabel();

        // Initialize the UI design
        designUI();
        
        frame.add(buttonPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public void designUI() {
        // Change button color to green and font size
        button.setBackground(Color.GREEN);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyApp());
    }
}
