package atm.user.pkginterface.with.backend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener{
    
    JButton fiveH,tenK,oneK,fiveK, fifteenK, twentyK, back;
    String cardno, pin;
    
    FastCash(String cardno, String pin){
        this.cardno = cardno;
        this.pin = pin;
        
        //background image
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);
        
        JLabel titleTxt = new JLabel("Please select withdrawl amount");
        titleTxt.setBounds(230,232,700,35);
        titleTxt.setForeground(Color.WHITE);
        titleTxt.setFont(new Font ("System",Font.BOLD,16));
        //not add(titleTxt) cause that wouldnt add it on top of image
        image.add(titleTxt);
        
        //deposit button
        fiveH = new JButton("Rs. 500");
        fiveH.setBackground(Color.WHITE);
        fiveH.setForeground(Color.BLACK);
        fiveH.setBounds(170,312,150,25);
        fiveH.addActionListener(this);
        image.add(fiveH);
        
        //fastCash button
        oneK = new JButton("Rs. 1,000");
        oneK.setBackground(Color.WHITE);
        oneK.setForeground(Color.BLACK);
        oneK.setBounds(170,340,150,25);
        oneK.addActionListener(this);
        image.add(oneK);
        
        //pinChange button
        fiveK = new JButton("Rs. 5,000");
        fiveK.setBackground(Color.WHITE);
        fiveK.setForeground(Color.BLACK);
        fiveK.setBounds(170,368,150,25);
        fiveK.addActionListener(this);
        image.add(fiveK);
        
        //withdrawl button
        tenK = new JButton("Rs. 10,000");
        tenK.setBackground(Color.WHITE);
        tenK.setForeground(Color.BLACK);
        tenK.setBounds(355,312,150,25);
        tenK.addActionListener(this);
        image.add(tenK);
        
        //miniStatement button
        fifteenK = new JButton("Rs. 15,000");
        fifteenK.setBackground(Color.WHITE);
        fifteenK.setForeground(Color.BLACK);
        fifteenK.setBounds(355,340,150,25);
        fifteenK.addActionListener(this);
        image.add(fifteenK);
        
        //balance button
        twentyK = new JButton("Rs. 20,000");
        twentyK.setBackground(Color.WHITE);
        twentyK.setForeground(Color.BLACK);
        twentyK.setBounds(355,370,150,25);
        twentyK.addActionListener(this);
        image.add(twentyK);
        
        //exit button
        back = new JButton("BACK");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(355,400,150,25);
        back.addActionListener(this);
        image.add(back);
        
        //frame settings
        setTitle("Fast Cash");
        setLayout(null);
        setSize(900,680);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if (ae.getSource() == back){
            setVisible(false);
            new Transaction(cardno,pin).setVisible(true);
        }
        else if(ae.getSource() == fiveH){
            int amtInt = 500;
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
        else if (ae.getSource() == tenK){
            int amtInt = 10000;
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
        else if (ae.getSource() == oneK){
            int amtInt = 1000;
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
        else if (ae.getSource() == fiveK){
            int amtInt = 5000;
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
        else if (ae.getSource() == fifteenK){
            int amtInt = 15000;
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
        else if (ae.getSource() == twentyK){
            int amtInt = 20000;
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
    }
    public static void main(String args[]) {
        new FastCash("","");
    }
}
