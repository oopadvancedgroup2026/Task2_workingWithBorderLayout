import javax.swing.*;
import java.awt.*;

public class workingWithBorderLayout {

    public workingWithBorderLayout() {
        this.BorderFrame();
    }

    public JFrame BorderFrame(){
        JFrame BorderFrame = new JFrame("Borderlayout Demo");
        BorderFrame.setSize(600, 400);
        BorderFrame.getContentPane().setBackground(Color.LIGHT_GRAY);

        BorderFrame.add(this.BorderLabel(), BorderLayout.NORTH);
        BorderFrame.add(this.BorderPanel(),BorderLayout.WEST);
        BorderFrame.add(this.BorderScroller(), BorderLayout.CENTER);
        BorderFrame.add(this.SubmitButton(), BorderLayout.SOUTH);

        BorderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderFrame.setVisible(true);
        return BorderFrame;
    }


    public  JLabel BorderLabel(){
        JLabel BorderLabel = new JLabel("Application Title");
        BorderLabel.setHorizontalAlignment(JLabel.CENTER);

        return BorderLabel;
    }

    public JPanel BorderPanel(){
        JPanel Borderpanel = new JPanel();
        Borderpanel.setLayout(new GridLayout(3,1));


        JButton Button1 = new JButton("Option-1");
        JButton Button2 = new JButton("Option-2");
        JButton Button3 = new JButton("Option-3");

        Borderpanel.add(Button1);
        Borderpanel.add(Button2);
        Borderpanel.add(Button3);

        return Borderpanel;
    }


    public JScrollPane BorderScroller(){

        JTextArea BorderTextArea = new JTextArea("Type here.....");
        BorderTextArea.setLineWrap(true);
        BorderTextArea.setWrapStyleWord(true);

        JScrollPane BorderScroller = new JScrollPane(BorderTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        return BorderScroller;
    }


    public JButton SubmitButton(){
        JButton submitButton = new JButton("Submit");

        return submitButton;
    }






}
