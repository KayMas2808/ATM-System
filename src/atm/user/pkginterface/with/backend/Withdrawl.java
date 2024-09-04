package atm.user.pkginterface.with.backend;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField amt;
    JButton deposit, back;
    String cardno,pin;
    
    Withdrawl(String cardno,String pin){
        
        this.cardno = cardno;
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);
        
        JLabel text = new JLabel("Enter amount you want to withdraw:");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170,200,400,20);
        image.add(text);
        
        amt = new JTextField();
        amt.setFont(new Font("Raleway",Font.BOLD, 20));
        amt.setBounds(170,250,320,25);
        amt.addActionListener(this);
        image.add(amt);
        
        deposit = new JButton("Withdraw");
        //deposit.setBackground(Color.GREEN);
        deposit.setBounds(355,355,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        //back.setBackground(Color.GREEN);
        back.setBounds(355,390,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setTitle("Withdarw Money");
        setLayout(null);
        setSize(900,680);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if(ae.getSource()==deposit){
            String amtStr = amt.getText();
            int amtInt = Integer.parseInt(amtStr);
            String getBalQuery = "SELECT balance FROM bank_mgmt WHERE cardno = "+ cardno +";";
            String depQuery = "UPDATE bank_mgmt SET balance = balance - "+ amtInt + " WHERE cardno = "+ cardno +";";
            try {
            int rs = c.s.executeUpdate(depQuery);  // Execute update query
            ResultSet rs1 = c.s.executeQuery(getBalQuery);  // Execute select query

            // Move the cursor to the first row
            if (rs1.next()) {
                int bal = rs1.getInt(1);  // Now get the balance value
                JOptionPane.showMessageDialog(null, "Successfully Withdrawn. New Balance: Rs." + bal);
            } 
            else {
                JOptionPane.showMessageDialog(null, "Unable to fetch balance. Please try again.");
            }
        } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transaction(cardno,pin).setVisible(true);
        }

    }
    public static void main(String[] args) {
        new Withdrawl("","");
    }
}
