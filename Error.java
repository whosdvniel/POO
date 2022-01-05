package com.company;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Error extends JFrame implements ActionListener{
    private JFrame frame1 = new JFrame();
    private JLabel jcomp = new JLabel("Răspuns greșit!");
    private JButton buton1 = new JButton("Ok");
    Error(){
        setLayout(null);
        frame1.setSize(200,200);
        buton1.addActionListener(this);
        frame1.add(buton1);
        frame1.add(jcomp);
        jcomp.setBounds(40,10,150,50);
        buton1.setBounds(70,100,50,50);
        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buton1)
            frame1.dispose();
    }
}
