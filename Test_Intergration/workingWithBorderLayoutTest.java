import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class workingWithBorderLayoutTest {

    workingWithBorderLayout app = new workingWithBorderLayout();

    @Test
    void borderFrame() {
        JFrame BorderFrame = new JFrame("Borderlayout Demo");
        BorderFrame.setSize(600, 400);
        BorderFrame.setLayout(new BorderLayout());
    }

    @Test
    void borderLabel() {
        JLabel BorderLabel = new JLabel("Application Tittle");
        BorderLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    @Test
    void borderPanel() {
        JPanel Borderpanel = new JPanel();
        Borderpanel.setLayout(new GridLayout(3,1));

        JButton Button1 = new JButton("Option-1");
        JButton Button2 = new JButton("Option-2");
        JButton Button3 = new JButton("Option-3");

        Borderpanel.add(Button1);
        Borderpanel.add(Button2);
        Borderpanel.add(Button3);
    }

    @Test
    void borderScroller() {
        JTextArea BorderTextArea = new JTextArea("Type here.....");
        BorderTextArea.setLineWrap(true);
        BorderTextArea.setWrapStyleWord(true);

        JScrollPane BorderScroller = new JScrollPane(BorderTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    @Test
    void submitButton() {
        JButton submitButton = new JButton("Submit");
    }
}