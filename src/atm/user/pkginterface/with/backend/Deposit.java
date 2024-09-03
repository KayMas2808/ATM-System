package atm.user.pkginterface.with.backend;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{
    
    JTextField amt;
    JButton deposit, back;
    String cardno,pin;
    
    Deposit(String cardno,String pin){
        
        this.cardno = cardno;
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);
        
        JLabel text = new JLabel("Enter amount you want too deposit:");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170,200,400,20);
        image.add(text);
        
        amt = new JTextField();
        amt.setFont(new Font("Raleway",Font.BOLD, 20));
        amt.setBounds(170,250,320,25);
        image.add(amt);
        
        deposit = new JButton("Deposit");
        //deposit.setBackground(Color.GREEN);
        deposit.setBounds(355,355,150,30);
        image.add(deposit);
        
        back = new JButton("Back");
        //back.setBackground(Color.GREEN);
        back.setBounds(355,390,150,30);
        image.add(back);
        
        setTitle("Deposit Money");
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
            String depQuery = "UPDATE bank_mgmt SET balance = balance + "+ amtInt + " WHERE cardno = "+ cardno +";";
            try{
                int rs = c.s.executeUpdate(depQuery);
                ResultSet rs1 = c.s.executeQuery(getBalQuery);
                int bal = rs1.getInt(0);
                if (rs == 1){
                    JOptionPane.showConfirmDialog(null, "Successfully Deposited. New Balance: Rs."+bal);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Unable to deposit. Please Try again.");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==back){
            String query = "SELECT cardno,pin FROM bank_mgmt WHERE cardno = '" + cardno + "' AND pin = '" + pin + "';";
            try{
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Transaction(cardno,pin).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number/Pin");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
    public static void main(String args[]) {
        new Deposit("","");
    }
}
