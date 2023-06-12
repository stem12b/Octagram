import javax.swing.*;
import java.awt.*;

 class LoadingScreen extends JFrame {
    private JLabel loadingLabel;

    public LoadingScreen() {
        super("Octagram");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel loadingPanel = new JPanel();
        loadingLabel = new JLabel("Loading...");
        loadingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        loadingPanel.add(loadingLabel);

        getContentPane().add(loadingPanel);
    }

    public void setLoadingLabelText(String text) {
        loadingLabel.setText(text);
    }
}
