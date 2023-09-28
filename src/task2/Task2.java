package task2;

import task1.AddButtonListener;

import javax.swing.*;
import java.awt.*;

public class Task2 {
    private final JFrame mainFrame;
    private final JTextArea firstList;
    private JTextArea secondList;
    private final JPanel mainPanel;
    private final JPanel checkBoxPanel;
    private final JPanel buttonPanel;
    private final JCheckBox even;
    private final JCheckBox odd;
    private final JTextField inputField;
    private final JButton addButton;
    private final JButton deleteButton;


    public Task2(){
        mainFrame = new JFrame("Task2");
        firstList = new JTextArea();
        secondList = new JTextArea();
        mainPanel = new JPanel();
        checkBoxPanel = new JPanel();
        buttonPanel = new JPanel();
        even = new JCheckBox("Четные");
        odd = new JCheckBox("Нечетные");
        deleteButton = new JButton("Очистить 2 список");
        inputField = new JTextField();
        addButton = new JButton("Добавить");

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
        firstList.setEditable(false);
        firstList.setPreferredSize(new Dimension(300, 150));
        secondList.setLineWrap(true);

        secondList.setEditable(false);
        secondList.setPreferredSize(new Dimension(300, 150));
        secondList.setLineWrap(true);

        inputField.setPreferredSize(new Dimension(300, 30));


        addButton.addActionListener(new AddButtonListener(inputField, new JList<>()));
        deleteButton.addActionListener(new DeleteButtonListener(secondList));
        odd.addActionListener(new OddListener(firstList));
        even.addActionListener(new EvenListener(firstList,secondList));
        //firstList.addMouseListener(new ListMouseListener(secondList, firstList));

        checkBoxPanel.add(even);
        checkBoxPanel.add(odd);

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
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
        mainPanel.add(buttonPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 10, 0);
        mainPanel.add(firstList, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
       // gbc.insets = new Insets(10, 0, 10, 0);
        mainPanel.add(checkBoxPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(secondList, gbc);
    }
}
