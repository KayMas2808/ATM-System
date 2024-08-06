package atm.user.pkginterface.with.backend;
import javax.swing.*;

public class Login extends JFrame{
    Login(){
        setTitle("Automated Teller Machine");
        setSize(800,480);//frame dimensions
        setVisible(true);//make it visible
        setLocation(350,200);//set its location on the screen(x,y)
    }

    public static void main(String args[]) {
        new Login();
        
    }
}
