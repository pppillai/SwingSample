package com.cmc.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

  public MainFrame() {
    super("MyTitle");
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container content = getContentPane();
    content.setLayout(new BorderLayout());

    JPanel jpanel = new JPanel(new FlowLayout());
    jpanel.add(new JButton("ButtonOne"));
    jpanel.add(new JButton("ButtonTwo"));
    jpanel.add(new JButton("ButtonThree"));
    content.add(jpanel, BorderLayout.SOUTH);
    content.add(new JScrollPane(new JTextArea()), BorderLayout.CENTER);
  }

}
