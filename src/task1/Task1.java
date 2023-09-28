package task1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Task1 {
    private JFrame mainFrame;
    private JTextArea secondList;
    private JTextField inputField;
    private JButton addButton;
    private JPanel mainPanel;
    private JButton moveButton;
    private JList<String> list;

    public Task1() {
        mainFrame = new JFrame("Task1");
        secondList = new JTextArea();
        inputField = new JTextField();
        addButton = new JButton("Добавить");
        moveButton = new JButton("Переместить во 2 список");
        mainPanel = new JPanel();
        list = new JList<>();

        configureComponents();
        configureMainPanel();
        configureMainFrame();
    }

    public void configureMainFrame() {
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(450, 450);
        mainFrame.setVisible(true);
        mainFrame.add(mainPanel);

        mainFrame.pack();
    }

    public void configureComponents() {
        list.setPreferredSize(new Dimension(300,150));

        secondList.setEditable(false);
        secondList.setPreferredSize(new Dimension(300, 150));
        secondList.setLineWrap(true);
        inputField.setPreferredSize(new Dimension(300, 30));

        addButton.addActionListener(new AddButtonListener(inputField, list));
        moveButton.addActionListener(new MoveButtonListener(secondList,list));
     //   list.addListSelectionListener( new ListMouseListener(list,text));
    }

    public void configureMainPanel() {
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(inputField, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(addButton, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(moveButton, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 10, 0);
        mainPanel.add(list, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(secondList, gbc);

    }
}
