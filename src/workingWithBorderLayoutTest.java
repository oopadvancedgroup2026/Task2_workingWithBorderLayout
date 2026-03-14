import javax.swing.*;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class workingWithBorderLayoutTest {
    workingWithBorderLayout app;
    JFrame appFrame;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        app = new workingWithBorderLayout();
        appFrame = app.BorderFrame();
    }

    @org.junit.jupiter.api.Test
    void borderFrame() {
        assertNotNull(appFrame);
        assertEquals("Borderlayout Demo", appFrame.getTitle());
        assertTrue(appFrame.getLayout() instanceof BorderLayout);
    }

    @org.junit.jupiter.api.Test
    void borderLabel() {
        JLabel label = app.BorderLabel();
        assertNotNull(label);
        assertEquals("Application Tittle", app.BorderLabel().getText());
    }

    @org.junit.jupiter.api.Test
    void borderPanel() {
        JPanel Panel = app.BorderPanel();
        JButton b1 = (JButton) Panel.getComponent(0);
        JButton b2 = (JButton) Panel.getComponent(1);
        JButton b3 = (JButton) Panel.getComponent(2);

        assertNotNull(Panel);
        assertEquals(3, Panel.getComponentCount());

        assertNotNull(b1);
        assertNotNull(b2);
        assertNotNull(b3);

        assertEquals("Option-1", b1.getText());
        assertEquals("Option-2", b2.getText());
        assertEquals("Option-3", b3.getText());
    }

    @org.junit.jupiter.api.Test
    void borderScroller() {
        JScrollPane pane = (JScrollPane) app.BorderScroller();
        JTextArea area = (JTextArea) pane.getViewport().getView();

        assertNotNull(pane);
        assertEquals(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS , pane.getVerticalScrollBarPolicy());
        assertEquals(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER, pane.getHorizontalScrollBarPolicy());
        assertEquals(3, pane.getComponentCount());

        assertNotNull(area);
        assertEquals("Type here.....", area.getText());
        assertEquals(true, area.getLineWrap());
        assertEquals(true, area.getWrapStyleWord());

    }

    @org.junit.jupiter.api.Test
    void SubmitButton() {
    }
}