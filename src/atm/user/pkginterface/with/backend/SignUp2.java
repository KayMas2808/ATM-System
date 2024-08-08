package atm.user.pkginterface.with.backend;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignUp2 extends JFrame {//implements ActionListener{
    SignUp2(){
        //heading
        JLabel persDet = new JLabel("Page 2: Additional Details");
        persDet.setFont(new Font("Osward", Font.BOLD,22));
        persDet.setBounds(290,80,400,30);
        add(persDet);
        
        //Religion
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        //Category
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD,20));
        category.setBounds(100,190,100,30);
        add(category);
        
        //Income
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD,20));
        income.setBounds(100,240,100,30);
        add(income);
        
        //Educational Qualification
        JLabel education = new JLabel("Educational Qualification:");
        education.setFont(new Font("Raleway", Font.BOLD,20));
        education.setBounds(100,290,300,30);
        add(education);
        
        //frame settings
        setTitle("Sign Up Page 2");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(200,10);
        setVisible(true);
    }

    
    public static void main(String args[]) {
        new SignUp2();
    }
}
