package atm.user.pkginterface.with.backend;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login(){
        setTitle("Automated Teller Machine");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//for icon
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);//only image icon can go into jlabel
        label.setBounds(70,10,100,100);
        add(label);//place object on frame using add
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,30);
        add(text);
        
        JLabel cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120,150,250,30);
        add(cardno);
        
        JTextField cardNoTxtField = new JTextField();//for taking text input
        cardNoTxtField.setBounds(310,150,250,30);
        add(cardNoTxtField);
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120,220,150,30);
        add(pin);
        
        JTextField pinTxtField = new JTextField();//for taking text input
        pinTxtField.setBounds(310,220,250,30);
        add(pinTxtField);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);//frame dimensions
        setVisible(true);//make it visible
        setLocation(200,100);//set its location on the screen(x,y)
    }

    public static void main(String args[]) {
        new Login();
        
    }
}
