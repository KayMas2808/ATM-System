package atm.user.pkginterface.with.backend;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pinAgain,newPin;
    JButton submit, cancel;
    String cardno, pin;
    
    PinChange(String cardno, String pin){
        this.cardno = cardno;
        this.pin = pin;
        
        //background image
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);
        
        JLabel changeTxt = new JLabel("Change your pin:");
        changeTxt.setForeground(Color.white);
        changeTxt.setFont(new Font("System", Font.BOLD,16));
        changeTxt.setBounds(270,200,180,25);
        image.add(changeTxt);
        
        JLabel newP = new JLabel("Enter new pin:");
        newP.setForeground(Color.white);
        newP.setFont(new Font("System", Font.BOLD,16));
        newP.setBounds(170,270,180,25);
        image.add(newP);
        
        newPin = new JPasswordField();
        newPin.setFont(new Font("Raleway",Font.BOLD, 20));
        newPin.setBounds(320,270,150,25);
        newPin.addActionListener(this);
        image.add(newPin);
        
        JLabel confirmP = new JLabel("Re-enter new pin:");
        confirmP.setForeground(Color.white);
        confirmP.setFont(new Font("System", Font.BOLD,16));
        confirmP.setBounds(170,320,180,25);
        image.add(confirmP);
        
        pinAgain = new JPasswordField();
        pinAgain.setFont(new Font("Raleway",Font.BOLD, 20));
        pinAgain.setBounds(320,320,150,25);
        pinAgain.addActionListener(this);
        image.add(pinAgain);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setBounds(170,390,150,25);
        submit.addActionListener(this);
        image.add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setBounds(350,390,150,25);
        cancel.addActionListener(this);
        image.add(cancel);
        
        setTitle("Change Pin");
        setLayout(null);
        setSize(900,680);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        char[] newPc = newPin.getPassword();
        String newP = new String(newPc);
        char[] confc = pinAgain.getPassword();
        String conf = new String(confc);
        if(ae.getSource() == cancel){
            setVisible(false);
            new Transaction(cardno,pin).setVisible(true);
        }
        else if (ae.getSource() == submit){
            if (newP.equals(conf)){
                Conn c = new Conn();
                String query = "UPDATE bank_mgmt SET pin = "+ newP + " WHERE cardno = "+cardno+";";
                try{
                    int rs = c.s.executeUpdate(query);
                    if (rs == 1){
                        pin = newP;
                        JOptionPane.showMessageDialog(null, "Pin changed successfully!");
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
            else{
                JOptionPane.showMessageDialog(null, "The pin does not match the confirmation. Please try again.");
                newPin.setText("");
                pinAgain.setText("");
            }
        }
    }
    public static void main(String args[]) {
        new PinChange("","").setVisible(true);
    }
}
