package atm.user.pkginterface.with.backend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, clear, signUp, lightMode, darkMode;
    char mode = 'd';
    JTextField cardNoTxtField;
    JPasswordField pinTxtField;
    JLabel text,cardno, pin;
    Login(){
        setTitle("Automated Teller Machine");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//for icon
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);//only image icon can go into jlabel
        label.setBounds(90,10,100,100);
        add(label);//place object on frame using add
        
        text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(250,40,400,30);
        text.setForeground(Color.WHITE);
        add(text);
        
        cardno = new JLabel("Card Num.:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120,150,210,30);
        cardno.setForeground(Color.WHITE);
        add(cardno);
        
        cardNoTxtField = new JTextField();//for taking text input
        cardNoTxtField.setBounds(300,150,230,30);
        cardNoTxtField.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(cardNoTxtField);
        
        pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120,220,150,30);
        pin.setForeground(Color.WHITE);
        add(pin);
        
        pinTxtField = new JPasswordField();//for taking text input
        pinTxtField.setBounds(300,220,230,30);
        pinTxtField.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(pinTxtField);
        
        login = new JButton("Sign In");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        signUp = new JButton("Sign Up");
        signUp.setBounds(300,350,230,30);
        signUp.setBackground(Color.WHITE);
        signUp.setForeground(Color.BLACK);
        signUp.addActionListener(this);
        add(signUp);
        
        ImageIcon ldMode = new ImageIcon(ClassLoader.getSystemResource("icons/brightness.png"));//for icon
        Image ldMode2 = ldMode.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon ldMode3 = new ImageIcon(ldMode2);
        lightMode = new JButton(ldMode3);
        lightMode.setBounds(740,10,30,30);
        lightMode.setBackground(Color.darkGray);
        lightMode.setForeground(Color.WHITE);
        lightMode.addActionListener(this);
        add(lightMode);
        
        getContentPane().setBackground(Color.darkGray);//window bg color
        setSize(800,480);//frame dimensions
        setVisible(true);//make it visible
        setLocation(200,100);//set its location on the screen(x,y)
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardNoTxtField.setText("");
            pinTxtField.setText("");
        }
        else if (ae.getSource() == login){
            
        }
        else if (ae.getSource() == signUp){
            
        }
        else if (ae.getSource() == lightMode){
            if (mode == 'd'){
                getContentPane().setBackground(Color.WHITE);
                text.setForeground(Color.BLACK);
                cardno.setForeground(Color.BLACK);
                pin.setForeground(Color.BLACK);
                login.setBackground(Color.BLACK);
                login.setForeground(Color.WHITE);
                clear.setBackground(Color.BLACK);
                clear.setForeground(Color.WHITE);
                signUp.setBackground(Color.BLACK);
                signUp.setForeground(Color.WHITE);
                lightMode.setBackground(Color.WHITE);
                mode = 'l';
            }
            else if (mode == 'l'){
                getContentPane().setBackground(Color.darkGray);
                text.setForeground(Color.WHITE);
                cardno.setForeground(Color.WHITE);
                pin.setForeground(Color.WHITE);
                login.setBackground(Color.WHITE);
                login.setForeground(Color.BLACK);
                clear.setBackground(Color.WHITE);
                clear.setForeground(Color.BLACK);
                signUp.setBackground(Color.WHITE);
                signUp.setForeground(Color.BLACK);
                lightMode.setBackground(Color.darkGray);
                mode = 'd';
            }
        }
    }

    public static void main(String args[]) {
        new Login(); 
    }
}
