package task3;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMouseListener implements MouseListener {
    private JTextArea secondName;
    private JTextArea sortedList;
    private List<String> text;

    public ListMouseListener(JTextArea secondName, JTextArea sortedList) {
        this.secondName = secondName;
        this.sortedList = sortedList;
        text = new ArrayList<>();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (secondName.getSelectedText() != null) {
            text.add(secondName.getSelectedText());
            Collections.sort(text);
            sortedList.setText(String.join("\n",text));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
