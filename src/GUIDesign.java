import javax.swing.*;

public class GUIDesign extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIDesign");
        frame.setContentPane(new GUIDesign().GUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel GUI;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton krypteraButton;
    private JButton dekrypteraButton;
    private JButton button3;
    private JButton button4;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JButton openButton;
    private JButton saveButton;
    private JButton cryptButton;
    private JButton decryptButton;
    private JButton helpButton;
    private JButton selectKeyButton;
}

o


