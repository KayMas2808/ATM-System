package atm.user.pkginterface.with.backend;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class MiniStatement extends JFrame{
    String cardno, pin;
    
    MiniStatement(String cardno, String pin){
        this.cardno = cardno;
        this.pin = pin;
        
        setTitle("Mini Statement");
        setLayout(null);
        setSize(400,600);
        setLocation(20,20);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String args[]) {
        new MiniStatement("","").setVisible(true);
    }
}
