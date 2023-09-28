package task3;

import javax.swing.*;
import java.awt.*;

public class Task3 {
    private final JFrame mainFrame;
    private final JPanel mainPanel;
    private final JTextArea name;
    private final JTextArea secondName;
    private final JTextArea surname;
    private final JTextArea sortedList;

    private final JLabel nameLabel;
    private final JLabel secondNamelabel;
    private final JLabel surnamelabel;
    private final JLabel sortedListLabel;
    private final JButton editButton;


    public Task3(){
        mainPanel = new JPanel();
        mainFrame = new JFrame("Task3");
        name = new JTextArea();
        secondName = new JTextArea();
        surname = new JTextArea();
        sortedList = new JTextArea();
        nameLabel = new JLabel("Имя");
        secondNamelabel = new JLabel("Фамилия");
        surnamelabel = new JLabel("Отчество");
        sortedListLabel = new JLabel("4 список");
        editButton = new JButton("Редактировать");

        configureComponents();
        configureMainPanel();
        configureEditFrame();
        configureMainFrame();
    }

    private void configureMainFrame() {
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(450, 450);
        mainFrame.setVisible(true);
        mainFrame.add(mainPanel);

        mainFrame.pack();
    }

    private void configureMainPanel() {
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        addComponent(gbc,0,0,secondNamelabel);
        addComponent(gbc,0,1,secondName);
        addComponent(gbc,0,2,nameLabel);
        addComponent(gbc,0,3,name);
        //gbc.insets = new Insets(0, 0, 10, 0);
        addComponent(gbc,0,4,surnamelabel);
        addComponent(gbc,0,5,surname);
        addComponent(gbc,1,1,editButton);
        addComponent(gbc,0,6,sortedListLabel);
        addComponent(gbc,0,7,sortedList);
    }

    private void configureEditFrame() {

    }

    private void configureComponents() {
        name.setEditable(false);
        name.setPreferredSize(new Dimension(300, 150));
        name.setLineWrap(true);

        secondName.setEditable(false);
        secondName.setPreferredSize(new Dimension(300, 150));
        secondName.setLineWrap(true);
        secondName.addMouseListener(new ListMouseListener(secondName,sortedList));

        surname.setEditable(false);
        surname.setPreferredSize(new Dimension(300, 150));
        surname.setLineWrap(true);

        sortedList.setEditable(false);
        sortedList.setPreferredSize(new Dimension(300,150));
        sortedList.setLineWrap(true);

        editButton.addActionListener(new EditButtonListener(secondName,name,surname));


    }

    public void addComponent(GridBagConstraints gbc,int x,int y,JComponent component){
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = x;
        gbc.gridy = y;
        mainPanel.add(component, gbc);
    }
}
