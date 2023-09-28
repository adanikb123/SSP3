package task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OddListener implements ActionListener {
    private JTextArea firstList;

    public OddListener(JTextArea firstList) {
        this.firstList = firstList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] text = firstList.getText().split("\n");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length; i++) {
            if (i % 2 != 0) {
                result.append(text[i]).append("\n");
            }
        }
        firstList.setText(result.toString());
    }
}
