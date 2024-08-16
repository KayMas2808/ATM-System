package atm.user.pkginterface.with.backend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;


public class SignUp3 extends JFrame implements ActionListener{
    
    JRadioButton savingAcc, recurringAcc, currentAcc, FDAcc;
    JCheckBox atm,internet,mobile,email,chequeBook,eStatement,declare;
    JButton submit, cancel;
    String pin, cardno;
    SignUp3(String formno){
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
        cardLabel.setBounds(100,150,200,20);
        add(cardLabel);
        
        JLabel infoLabel = new JLabel("Your 16 digit card number");
        infoLabel.setFont(new Font("Raleway",Font.ITALIC,12));
        infoLabel.setBounds(100,180,250,20);
        add(infoLabel);
        
        int min = 1000;
        int max = 9999;
        int card1st = (int) (Math.random() * (max - min + 1)) + min;
        int card2nd = (int) (Math.random() * (max - min + 1)) + min;
        int card3rd = (int) (Math.random() * (max - min + 1)) + min;
        int card4th = (int) (Math.random() * (max - min + 1)) + min;
        
        cardno = ""+card1st + card2nd + card3rd + card4th;
        
        JLabel cardNoLabel = new JLabel("XXXX-XXXX-XXXX-"+card4th);
        cardNoLabel.setFont(new Font("Raleway",Font.BOLD,20));
        cardNoLabel.setBounds(320,150,250,30);
        add(cardNoLabel);
        
        int pint = (int) (Math.random() * (max - min + 1)) + min;
        pin = ""+pint;
        
        JLabel pinLabel = new JLabel("Pin:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD,20));
        pinLabel.setBounds(100,220,200,20);
        add(pinLabel);
        
        JLabel pinX = new JLabel("XXXX");
        pinX.setFont(new Font("Raleway", Font.BOLD,20));
        pinX.setBounds(320,220,200,30);
        add(pinX);
        
        JLabel pinfoLabel = new JLabel("Your 4 digit pin");
        pinfoLabel.setFont(new Font("Raleway",Font.ITALIC,12));
        pinfoLabel.setBounds(100,250,250,20);
        add(pinfoLabel);
        
        JLabel servicesLabel = new JLabel("Services Required:");
        servicesLabel.setFont(new Font("Raleway", Font.BOLD,20));
        servicesLabel.setBounds(100,290,200,30);
        add(servicesLabel);
        
        //atm,internet,mobile,email,checkBook,eStatement,declare
        atm = new JCheckBox("ATM Card");
        atm.setBackground(Color.WHITE);
        atm.setFont(new Font("Raleway",Font.PLAIN,20));
        atm.setBounds(100, 340,250,30);
        add(atm);
        
        internet = new JCheckBox("Internet Services");
        internet.setBackground(Color.WHITE);
        internet.setFont(new Font("Raleway",Font.PLAIN,20));
        internet.setBounds(360, 340,250,30);
        add(internet);
        
        mobile = new JCheckBox("Mobile Services");
        mobile.setBackground(Color.WHITE);
        mobile.setFont(new Font("Raleway",Font.PLAIN,20));
        mobile.setBounds(610, 340,250,30);
        add(mobile);
        
        email = new JCheckBox("Email Services");
        email.setBackground(Color.WHITE);
        email.setFont(new Font("Raleway",Font.PLAIN,20));
        email.setBounds(100, 380,250,30);
        add(email);
        
        chequeBook = new JCheckBox("Cheque Book");
        chequeBook.setBackground(Color.WHITE);
        chequeBook.setFont(new Font("Raleway",Font.PLAIN,20));
        chequeBook.setBounds(360, 380,250,30);
        add(chequeBook);
        
        eStatement = new JCheckBox("E-Statement");
        eStatement.setBackground(Color.WHITE);
        eStatement.setFont(new Font("Raleway",Font.PLAIN,20));
        eStatement.setBounds(610, 380,250,30);
        add(eStatement);
        
        declare = new JCheckBox("I hereby declare that all provided information is correct.");
        declare.setBackground(Color.WHITE);
        declare.setFont(new Font("Raleway",Font.ITALIC,15));
        declare.setBounds(100, 440,410,30);
        add(declare);
        
        submit = new JButton("Submit");
        submit.setFont(new Font ("Raleway",Font.BOLD,14));
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.GREEN);
        submit.setBorder(new RoundedBorder(30));
        submit.setBounds(280,500,130,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font ("Raleway",Font.BOLD,14));
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.RED);
        cancel.setBorder(new RoundedBorder(30));
        cancel.setBounds(450,500,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        //frame settings
        setTitle("Sign Up 3");
        setSize(850,680);
        setLocation(250,0);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            
        }
    }

    public static void main(String args[]) {
        new SignUp3("");
    }
}
