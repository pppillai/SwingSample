package com.cmc.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

  public MainFrame() {
    super("MyTitle");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container content = getContentPane();
    content.setLayout(new BorderLayout());

    JPanel southPanel = new JPanel(new FlowLayout());
    JButton button1 = new JButton("ButtonOne");
    button1.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(MainFrame.this, "Button One Pressed");
      }
    });

    southPanel.add(button1);
    southPanel.add(new JButton("ButtonTwo"));
    southPanel.add(new JButton("ButtonThree"));
    content.add(southPanel, BorderLayout.SOUTH);


    JPanel northPanel = new JPanel(new FlowLayout());
    northPanel.add(new JLabel("Enter your name"));
    northPanel.add(new JTextField(10));
    String[] options = new String[]{"Option1", "Option2", "Option3"};
    northPanel.add(new JComboBox(options));

    content.add(northPanel, BorderLayout.NORTH);

    content.add(new JScrollPane(new JTextArea()), BorderLayout.CENTER);
  }

}
