package task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteButtonListener implements ActionListener {
    private JTextArea secondList;

    public DeleteButtonListener(JTextArea secondList) {
        this.secondList = secondList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        secondList.setText("");
    }
}
