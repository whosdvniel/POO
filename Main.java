package com.company;


import com.sun.net.httpserver.Authenticator;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyPanel extends JPanel implements  ActionListener{
    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JTextField jcomp4;
    private JTextField jcomp5;
    private JTextField jcomp6;
    private JTextField jcomp7;
    private JTextField jcomp8;
    private JButton jcomp10;
    private JButton jcomp11;
    private JLabel jcomp13;
    private JLabel jcomp14;
    private JLabel jcomp15;
    private JLabel jcomp16;
    private JLabel jcomp17;


    public MyPanel() {
        //construct components
        jcomp1 = new JButton ("Buton1");
        jcomp2 = new JButton ("Răspunde");
        jcomp3 = new JButton ("Răspunde");
        jcomp4 = new JTextField (5);
        jcomp5 = new JTextField (5);
        jcomp6 = new JTextField (5);
        jcomp7 = new JTextField (5);
        jcomp8 = new JTextField (5);
        jcomp10 = new JButton ("Răspunde");
        jcomp11 = new JButton ("Răspunde");
        jcomp13 = new JLabel ("Ce nu-i nici în casă, nici afară, dar e și-n casă și în afară?");
        jcomp14 = new JLabel ("Ce roată nu se mișcă atunci când mașina virează?");
        jcomp15 = new JLabel ("Cu cât scoți mai mult din ea, cu atât devine mai mare. Ce e?");
        jcomp16 = new JLabel ("Cine are urechi și nu aude?");
        jcomp17 = new JLabel ("Ce merge în sus şi în jos, dar nu se mişcă?");


        //adjust size and set layout
        setPreferredSize (new Dimension (752, 430));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp10);
        add (jcomp11);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);


        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (200, 60, 100, 20);
        jcomp2.setBounds (200, 120, 100, 20);
        jcomp3.setBounds (200, 180, 100, 20);
        jcomp4.setBounds (10, 60, 180, 20);
        jcomp5.setBounds (10, 120, 180, 20);
        jcomp6.setBounds (10, 180, 180, 20);
        jcomp7.setBounds (10, 240, 180, 20);
        jcomp8.setBounds (10, 300, 180, 20);
        jcomp10.setBounds (200, 240, 100, 20);
        jcomp11.setBounds (200, 300, 105, 20);
        jcomp13.setBounds (10, 20, 335, 30);
        jcomp14.setBounds (10, 80, 335, 30);
        jcomp15.setBounds (10, 140, 335, 29);
        jcomp16.setBounds (10, 200, 335, 30);
        jcomp17.setBounds (10, 260, 335, 30);


        jcomp1.addActionListener(this);
        jcomp2.addActionListener(this);
        jcomp3.addActionListener(this);
        jcomp10.addActionListener(this);
        jcomp11.addActionListener(this);
    }
    

    public static void main (String[] args) {
        JFrame frame = new JFrame ("Ghicitori");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jcomp1)
            if(jcomp4.getText().equals("fereastra"))
            {
                Succes succes1 = new Succes();
            }
        else {
                Error eroare1 = new Error();
            }
        if(e.getSource() == jcomp2)
            if(jcomp5.getText().equals("roata de rezerva"))
            {
                Succes succes1 = new Succes();
            }
            else {
                Error eroare1 = new Error();
            }
        if(e.getSource() == jcomp3)
            if(jcomp6.getText().equals("groapa"))
            {
                Succes succes1 = new Succes();
            }
            else {
                Error eroare1 = new Error();
            }
        if(e.getSource() == jcomp10)
            if(jcomp7.getText().equals("surdul"))
            {
                Succes succes1 = new Succes();
            }
            else {
                Error eroare1 = new Error();
            }
        if(e.getSource() == jcomp11)
            if(jcomp8.getText().equals("scara"))
            {
                Succes succes1 = new Succes();
            }
            else {
                Error eroare1 = new Error();
            }
    }
}