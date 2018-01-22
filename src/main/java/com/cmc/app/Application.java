package com.cmc.app;

import com.cmc.swing.MainFrame;

import javax.swing.*;

public class Application {

  public static void main(String[] args) {
    MainFrame maf = new MainFrame();
    maf.setVisible(true);
    maf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
