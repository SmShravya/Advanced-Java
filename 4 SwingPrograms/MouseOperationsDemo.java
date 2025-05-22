package lab4Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseOperationsDemo extends JFrame {

    private JButton clickButton;
    private JLabel messageLabel;

    public MouseOperationsDemo() {
        // Frame setup
        setTitle("Mouse Operations Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with vertical layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create button
        clickButton = new JButton("Click Me!");
        clickButton.setFont(new Font("Arial", Font.BOLD, 16));
        clickButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Create message label just below the button
        messageLabel = new JLabel(" ");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        messageLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // small spacing

        // Add components to panel
        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(clickButton);
        mainPanel.add(messageLabel);
        mainPanel.add(Box.createVerticalGlue());

        add(mainPanel);

        // Mouse events
        clickButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                messageLabel.setText("Mouse Down on Button");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                messageLabel.setText("Mouse Up on Button");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    messageLabel.setText("Double Click on Button");
                } else {
                    messageLabel.setText("Single Click on Button");
                }
            }
        });

        // Center window
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseOperationsDemo::new);
    }
}
