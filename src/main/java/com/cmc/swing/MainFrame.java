package com.cmc.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

  public MainFrame() {
    super("MyTitle");
    setSize(300, 300);
    Container content = getContentPane();
    content.add(new JButton("Button One"));

  }

}
