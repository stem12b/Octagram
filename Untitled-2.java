import javax.swing.*;
import java.awt.*;

 class HomeScreen extends JFrame {
    private JLabel welcomeLabel;

    public HomeScreen() {
        super("Home Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel homePanel = new JPanel();
        welcomeLabel = new JLabel("Welcome to San Policarpo National High School!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        homePanel.add(welcomeLabel);

        getContentPane().add(homePanel);
    }

    public void setWelcomeLabelText(String text) {
        welcomeLabel.setText(text);
    }
}
