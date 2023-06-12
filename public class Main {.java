import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Main {
    public static void main(String[] args) {
        LoadingScreen loadingScreen = new LoadingScreen();
        loadingScreen.setVisible(true);

        // Simulating some loading process
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loadingScreen.setLoadingLabelText("Loading complete!");
        loadingScreen.setVisible(false);

        HomeScreen homeScreen = new HomeScreen();
        homeScreen.setVisible(true);

        JFrame mainFrame = new JFrame("Octagram");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
        mainFrame.setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel(new BorderLayout());
        NavigationBar navigationBar = new NavigationBar();
        contentPanel.add(navigationBar, BorderLayout.NORTH);

        mainFrame.getContentPane().add(contentPanel);
        mainFrame.setVisible(true);
    }
}
