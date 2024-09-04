package atm.user.pkginterface.with.backend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,fastCash,pinChange, miniStatement, balance, exit;
    String cardno, pin;
    
    Transaction(String cardno, String pin){
        this.cardno = cardno;
        this.pin = pin;
        
        //background image
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);
        
        JLabel titleTxt = new JLabel("Please select your operation");
        titleTxt.setBounds(230,232,700,35);
        titleTxt.setForeground(Color.WHITE);
        titleTxt.setFont(new Font ("System",Font.BOLD,16));
        //not add(titleTxt) cause that wouldnt add it on top of image
        image.add(titleTxt);
        
        //deposit button
        deposit = new JButton("Deposit");
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.setBounds(170,312,150,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        //fastCash button
        fastCash = new JButton("Fast Cash");
        fastCash.setBackground(Color.WHITE);
        fastCash.setForeground(Color.BLACK);
        fastCash.setBounds(170,340,150,25);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
        //pinChange button
        pinChange = new JButton("Change Pin");
        pinChange.setBackground(Color.WHITE);
        pinChange.setForeground(Color.BLACK);
        pinChange.setBounds(170,368,150,25);
        pinChange.addActionListener(this);
        image.add(pinChange);
        
        //withdrawl button
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBackground(Color.WHITE);
        withdrawl.setForeground(Color.BLACK);
        withdrawl.setBounds(355,312,150,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        //miniStatement button
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBackground(Color.WHITE);
        miniStatement.setForeground(Color.BLACK);
        miniStatement.setBounds(355,340,150,25);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        //balance button
        balance = new JButton("Balance Enquiry");
        balance.setBackground(Color.WHITE);
        balance.setForeground(Color.BLACK);
        balance.setBounds(355,370,150,25);
        balance.addActionListener(this);
        image.add(balance);
        
        //exit button
        exit = new JButton("Exit");
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.setBounds(355,400,150,25);
        exit.addActionListener(this);
        image.add(exit);
        
        //frame settings
        setTitle("ATM Machine");
        setLayout(null);
        setSize(900,680);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            System.exit(0);
        }
        else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(cardno,pin).setVisible(true);
        }
        else if (ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(cardno,pin).setVisible(true);
        }
        else if (ae.getSource() == fastCash){
            setVisible(false);
            new FastCash(cardno,pin).setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Transaction("","");
    }
}
