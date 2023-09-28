package task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonListener implements ActionListener {
    private JTextField jTextField;
    private JList<String> jTextArea;
    private DefaultListModel<String> dim = new DefaultListModel<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        dim.addElement(jTextField.getText());
        jTextField.setText("");
    }

    public AddButtonListener(JTextField jTextField, JList<String> jTextArea) {
        this.jTextField = jTextField;
        this.jTextArea = jTextArea;
        this.jTextArea.setModel(dim);
    }
}
