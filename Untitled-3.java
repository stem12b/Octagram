import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class NavigationBar extends JPanel {
    private JButton homeButton;
    private JButton aboutButton;
    private JButton contactButton;

    public NavigationBar() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        homeButton = new JButton("Menu");
        aboutButton = new JButton("Message");
        contactButton = new JButton("Settings");

        add(homeButton);
        add(aboutButton);
        add(contactButton);

        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to handle the home button click
                JOptionPane.showMessageDialog(null, 
                "-Principal   -Teachers     -Events    -Lessons");
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to handle the about button click
                JOptionPane.showMessageDialog(null, "Write a message to the admin.");
            }
        });

        contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to handle the contact button click
                JOptionPane.showMessageDialog(null, "Basta kyut ak.");
            }
        });
    }
}
