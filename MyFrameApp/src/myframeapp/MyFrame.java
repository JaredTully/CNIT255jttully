/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframeapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener
{
    JPanel pnlContain;
    JTextField txtSSN;
    JLabel lblSSN, lblResult;
    JButton btnOK, btnCancel;
    public MyFrame()
    {
        Container cp = getContentPane();
        lblSSN = new JLabel("SSN:");
        lblResult = new JLabel("");
        txtSSN = new JTextField(20);
        btnOK = new JButton("OK");
        btnOK.addActionListener(this);
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(this);
        pnlContain = new JPanel();
        pnlContain.add(lblSSN);
        pnlContain.add(txtSSN);
        pnlContain.add(btnOK);
        pnlContain.add(btnCancel);
        pnlContain.add(lblResult);
        cp.add(pnlContain);
    }
    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource() == btnOK)
        { txtSSN.setText("Pressed the OK button!");
    }
    if (evt.getSource() == btnCancel)
        { lblResult.setText("Pressed the Cancel button!");
        txtSSN.requestFocus();
    }
    }
   
}