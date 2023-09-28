package task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditButtonListener implements ActionListener {
    private final JDialog editFrame;
    private final JTextField inputField;
    private final JButton addButton;

    public EditButtonListener(JTextArea secondName, JTextArea name, JTextArea surname) {
        this.inputField = new JTextField();
        this.editFrame = new JDialog();
        this.addButton = new JButton("Добавить");


        inputField.setPreferredSize(new Dimension(250, 40));
        addButton.addActionListener(e -> {
            String[] text = inputField.getText().split(" ");
            secondName.append(text[0] + "\n");
            name.append(text[1] + "\n");
            surname.append(text[2] + "\n");
            inputField.setText("");
            editFrame.setVisible(false);
        });
        configureEditFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        editFrame.setVisible(true);
    }

    public void configureEditFrame() {
        editFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        editFrame.setLayout(new BorderLayout());
        editFrame.setSize(450, 400);

        editFrame.add(inputField, BorderLayout.NORTH);
        editFrame.add(addButton, BorderLayout.SOUTH);
        editFrame.pack();
    }
}
