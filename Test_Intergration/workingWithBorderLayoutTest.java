import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class workingWithBorderLayoutTest {

    workingWithBorderLayout app = new workingWithBorderLayout();

    @Test
    void borderFrame() {
        JFrame BorderFrame = new JFrame("Borderlayout Demo");
        assertNotNull(BorderFrame);
        assertTrue(BorderFrame.getLayout() instanceof BorderLayout);
        BorderFrame.setSize(600, 400);
        Dimension size = BorderFrame.getSize();
        assertEquals(600, size.width);
        assertEquals(400, size.height);


    }

    @Test
    void borderLabel() {
        JLabel BorderLabel = new JLabel("Application Tittle", JLabel.CENTER);
        assertNotNull(BorderLabel);
        assertEquals("Application Tittle", BorderLabel.getText());
        assertEquals(JLabel.CENTER, BorderLabel.getHorizontalAlignment());
    }


    @Test
    void borderPanel() {
        JPanel Borderpanel = new JPanel(new GridLayout(1, 3)); // set GridLayout with 3 columns
        Borderpanel.add(new JButton("Option-1"));
        Borderpanel.add(new JButton("Option-2"));
        Borderpanel.add(new JButton("Option-3"));

        assertNotNull(Borderpanel);
        assertTrue(Borderpanel.getLayout() instanceof GridLayout);
        assertEquals(3, Borderpanel.getComponentCount());

        JButton b1 = (JButton) Borderpanel.getComponent(0);
        JButton b2 = (JButton) Borderpanel.getComponent(1);
        JButton b3 = (JButton) Borderpanel.getComponent(2);

        assertEquals("Option-1", b1.getText());
        assertEquals("Option-2", b2.getText());
        assertEquals("Option-3", b3.getText());
    }


    @Test
    void borderScroller() {
        JTextArea BorderTextArea = new JTextArea("Type here.....");
        BorderTextArea.setLineWrap(true);
        BorderTextArea.setWrapStyleWord(true);

        assertTrue(BorderTextArea.getLineWrap());
        assertTrue(BorderTextArea.getWrapStyleWord());

        JScrollPane scroller = new JScrollPane(BorderTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        assertNotNull(scroller);
        assertEquals(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                scroller.getVerticalScrollBarPolicy());
        assertEquals(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER,
                scroller.getHorizontalScrollBarPolicy());
    }


    @Test
    void submitButton() {
        JButton submitButton = new JButton("Submit");
        assertNotNull(submitButton);
        assertEquals("Submit", submitButton.getText());

    }
}