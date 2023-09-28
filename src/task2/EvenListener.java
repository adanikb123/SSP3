package task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenListener implements ActionListener {
    private JTextArea firstList;
    private JTextArea secondList;

    public EvenListener(JTextArea firstList, JTextArea secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] text = firstList.getText().split("\n");
        for (int i = 0; i < text.length; i++) {
            if (i % 2 != 0) {
               secondList.append(text[i] + "\n");
            }
        }
    }
}
