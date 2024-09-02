package atm.user.pkginterface.with.backend;
import java.awt.Image;
import javax.swing.*;

public class Deposit extends JFrame{
    
    Deposit(){
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,680);
        add(image);
        
        JLabel text = new JLabel("Enter amount you want too deposit:");
        setTitle("Deposit Money");
        setLayout(null);
        setSize(900,680);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String args[]) {
        new Deposit();
    }
}
