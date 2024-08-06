package atm.user.pkginterface.with.backend;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignUp1 extends JFrame{
    SignUp1(){
        setLayout(null);
        
        //window heading
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);
        JLabel formNo = new JLabel("Application Form Number " + random);
        formNo.setFont(new Font("Osward", Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
        
        JLabel persDet = new JLabel("Personal Details: Page 1");
        persDet.setFont(new Font("Osward", Font.BOLD,22));
        persDet.setBounds(290,80,400,30);
        add(persDet);
        
        //name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        JTextField nameTxtField = new JTextField();
        nameTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        nameTxtField.setBounds(320,140,300,30);
        add(nameTxtField);
        
        //fathers name
        JLabel fatName = new JLabel("Father's Name:");
        fatName.setFont(new Font("Raleway", Font.BOLD,20));
        fatName.setBounds(100,190,200,30);
        add(fatName);
        
        JTextField fatNameTxtField = new JTextField();
        fatNameTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        fatNameTxtField.setBounds(320,190,300,30);
        add(fatNameTxtField);
        
        //dob
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        //gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        //email
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        //marital
        JLabel marritalStat = new JLabel("Marital Status:");
        marritalStat.setFont(new Font("Raleway", Font.BOLD,20));
        marritalStat.setBounds(100,390,200,30);
        add(marritalStat);
        
        //address
        JLabel addr = new JLabel("Address:");
        addr.setFont(new Font("Raleway", Font.BOLD,20));
        addr.setBounds(100,440,200,30);
        add(addr);
        
        //city
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        //state
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        //pincode
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        
        //frame settings
        setTitle("Sign Up Page 1");
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(200,10);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SignUp1();
    }
}
