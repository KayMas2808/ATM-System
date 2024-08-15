package atm.user.pkginterface.with.backend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SignUp3 extends JFrame{
    
    JRadioButton savingAcc, recurringAcc, currentAcc, FDAcc;
    SignUp3(){
        JLabel headingLabel = new JLabel("Page 3: Account Details");
        headingLabel.setFont(new Font("Raleway", Font.BOLD,22));
        headingLabel.setBounds(300,5,400,40);
        add(headingLabel);
        
        //account type
        JLabel accType = new JLabel("Account Type:");
        accType.setFont(new Font("Raleway", Font.BOLD,20));
        accType.setBounds(100,70,200,40);
        add(accType);
        
        savingAcc = new JRadioButton("Savings Account");
        savingAcc.setBounds(320,70,200,30);
        savingAcc.setBackground(Color.WHITE);
        add(savingAcc);
        
        recurringAcc = new JRadioButton("Recurring Account");
        recurringAcc.setBounds(520,70,200,30);
        recurringAcc.setBackground(Color.WHITE);
        add(recurringAcc);
        
        currentAcc = new JRadioButton("Current Account");
        currentAcc.setBounds(320,100,200,30);
        currentAcc.setBackground(Color.WHITE);
        add(currentAcc);
                
        FDAcc = new JRadioButton("FD Account");
        FDAcc.setBounds(520,100,200,30);
        FDAcc.setBackground(Color.WHITE);
        add(FDAcc);
        
        ButtonGroup accTypeGrp = new ButtonGroup();
        accTypeGrp.add(savingAcc);
        accTypeGrp.add(recurringAcc);
        accTypeGrp.add(currentAcc);
        accTypeGrp.add(FDAcc);
        
        JLabel cardLabel = new JLabel("Card Number:");
        cardLabel.setFont(new Font("Raleway", Font.BOLD,20));
        cardLabel.setBounds(100,150,200,40);
        add(cardLabel);
        
        int min = 1000;
        int max = 9999;
        int card1st = (int) (Math.random() * (max - min + 1)) + min;
        int card2nd = (int) (Math.random() * (max - min + 1)) + min;
        int card3rd = (int) (Math.random() * (max - min + 1)) + min;
        int card4th = (int) (Math.random() * (max - min + 1)) + min;
        
        String cardno = ""+card1st + card2nd + card3rd + card4th;
        
        JLabel cardNoLabel = new JLabel("XXXX-XXXX-XXXX-"+card4th);
        cardNoLabel.setFont(new Font("Raleway",Font.BOLD,20));
        cardNoLabel.setBounds(320,150,250,40);
        add(cardNoLabel);
        
        int pin = (int) (Math.random() * (max - min + 1)) + min;
        
        JLabel pinLabel = new JLabel("Pin:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD,20));
        pinLabel.setBounds(100,220,200,40);
        add(pinLabel);
        
        JLabel pinX = new JLabel("XXXX");
        pinX.setFont(new Font("Raleway", Font.BOLD,20));
        pinX.setBounds(320,220,200,40);
        add(pinX);
        
        //frame settings
        setTitle("Sign Up 3");
        setSize(850,680);
        setLocation(250,0);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SignUp3();
    }
}
