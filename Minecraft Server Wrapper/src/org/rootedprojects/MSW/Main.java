package org.rootedprojects.MSW;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Hans Goor on 3-4-2014.
 * CopyRight Rooted Inc.
 * DO NOT EDIT THIS CODE WITHOUT PERMISSION OF ROOTED INC.
*/

public class Main extends JPanel {
    private JButton btn_start;
    private JButton btn_stop;
    private JButton btn_reload;
    private JTextArea txt_output;
    private JTextField txt_input;
    private JButton btn_send;

    public Main() {
        //construct components
        btn_start = new JButton ("Start Sever");
        btn_stop = new JButton ("Stop Server");
        btn_reload = new JButton ("Reload tha Server");
        txt_output = new JTextArea (5, 5);
        txt_input = new JTextField (5);
        btn_send = new JButton ("Send");

        //adjust size and set layout
        setPreferredSize (new Dimension(667, 373));
        setLayout (null);

        //add components
        add (btn_start);
        add (btn_stop);
        add (btn_reload);
        add (txt_output);
        add (txt_input);
        add (btn_send);

        //set component bounds (only needed by Absolute Positioning)
        btn_start.setBounds (5, 5, 100, 20);
        btn_stop.setBounds (115, 5, 110, 20);
        btn_reload.setBounds (235, 5, 140, 20);
        txt_output.setBounds (5, 30, 655, 310);
        txt_input.setBounds (5, 345, 545, 25);
        btn_send.setBounds (560, 345, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Main());
        frame.pack();
        frame.setVisible (true);
    }
}
