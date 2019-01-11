import javax.swing.*;

public class GUIDesign {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIDesign");
        frame.setContentPane(new GUIDesign().GUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel GUI;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JButton openButton;
    private JButton saveButton;
    private JButton cryptButton;
    private JButton decryptButton;
    private JButton helpButton;
    private JButton selectKeyButton;
}


