package task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MoveButtonListener implements ActionListener {
    private JTextArea secondList;
    private JList<String> list;

    public MoveButtonListener(JTextArea secondList,JList<String> list ){
        this.secondList = secondList;
        this.list = list;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         secondList.append(String.join("",list.getSelectedValuesList()));
         if(secondList.getText().length()> 100){
             createDialogWindow();
         }
    }

    public void createDialogWindow() {
        JDialog warning = new JDialog();
        warning.setSize(250,200);
        warning.setLayout(new BorderLayout());
        JButton jButton =new JButton("OK");
        jButton.addActionListener(e -> {
            warning.setVisible(false);
        });
        warning.add(new JLabel("Вы ввели больше чем 100 символов"),BorderLayout.NORTH);
        warning.add(jButton,BorderLayout.SOUTH);
        warning.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        warning.setVisible(true);
    }
}
