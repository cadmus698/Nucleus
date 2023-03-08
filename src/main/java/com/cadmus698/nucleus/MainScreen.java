package com.cadmus698.nucleus;

import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.*;


public class MainScreen extends JFrame{
    private JButton addTaskButton;
    private JList todoList;
    private JTextField stopwatchText;
    private JPanel piechartPanel;
    private JPanel todoPanel;
    private JPanel spotifyPanel;
    private JPanel calendarPanel;
    private JPanel window;
    private JPanel sessionPanel;

    public MainScreen(){
        setContentPane(window);
    }
    public static void main(String[] args) {
        MainScreen gui = new MainScreen();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Grade Management");
        gui.setVisible(true);
        gui.pack();
    }
}
