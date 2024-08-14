package atm.user.pkginterface.with.backend;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignUp1 extends JFrame implements ActionListener{
    JTextField nameTxtField,fatNameTxtField, emailTxtField, addrTxtField, cityTxtField, stateTxtField, pincodeTextField;
    JDateChooser dateOfB;
    JRadioButton maleRadio,femaleRadio,nonBinRadio,married,unmarried,otherMarital;
    JButton next;
    long random;
    SignUp1(){
        setLayout(null);
        
        //window heading
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L)+1000L);
        JLabel formNo = new JLabel("Application Form Number " + random);
        formNo.setFont(new Font("Osward", Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
        
        JLabel persDet = new JLabel("Personal Details: Page 1");
        persDet.setFont(new Font("Osward", Font.BOLD,22));
        persDet.setBounds(290,80,400,30);
        add(persDet);
        
        //name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTxtField = new JTextField();
        nameTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        nameTxtField.setBounds(320,140,300,30);
        add(nameTxtField);
        
        //fathers name
        JLabel fatName = new JLabel("Father's Name:");
        fatName.setFont(new Font("Raleway", Font.BOLD,20));
        fatName.setBounds(100,190,200,30);
        add(fatName);
        
        fatNameTxtField = new JTextField();
        fatNameTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        fatNameTxtField.setBounds(320,190,300,30);
        add(fatNameTxtField);
        
        //dob
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateOfB = new JDateChooser();
        dateOfB.setBounds(320,240,300,30);
        add(dateOfB);
        
        //gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(320,290,60,30);
        maleRadio.setBackground(Color.WHITE);
        add(maleRadio);
        
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(400,290,70,30);
        femaleRadio.setBackground(Color.WHITE);
        add(femaleRadio);
        
        nonBinRadio = new JRadioButton("Non-Binary");
        nonBinRadio.setBounds(500,290,90,30);
        nonBinRadio.setBackground(Color.WHITE);
        add(nonBinRadio);
        
        ButtonGroup genderGrp = new ButtonGroup();
        genderGrp.add(maleRadio);
        genderGrp.add(femaleRadio);
        genderGrp.add(nonBinRadio);
        
        //email
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTxtField = new JTextField();
        emailTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        emailTxtField.setBounds(320,340,300,30);
        add(emailTxtField);
        
        //marital
        JLabel marritalStat = new JLabel("Marital Status:");
        marritalStat.setFont(new Font("Raleway", Font.BOLD,20));
        marritalStat.setBounds(100,390,200,30);
        add(marritalStat);
        
        married = new JRadioButton("Married");
        married.setBounds(320,390,70,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Un-Married");
        unmarried.setBounds(400,390,90,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        otherMarital = new JRadioButton("Other");
        otherMarital.setBounds(500,390,90,30);
        otherMarital.setBackground(Color.WHITE);
        add(otherMarital);
        
        ButtonGroup maritalGrp = new ButtonGroup();
        maritalGrp.add(married);
        maritalGrp.add(unmarried);
        maritalGrp.add(otherMarital);
        
        //address
        JLabel addr = new JLabel("Address:");
        addr.setFont(new Font("Raleway", Font.BOLD,20));
        addr.setBounds(100,440,200,30);
        add(addr);
        
        addrTxtField = new JTextField();
        addrTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        addrTxtField.setBounds(320,440,300,30);
        add(addrTxtField);
        
        //city
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTxtField = new JTextField();
        cityTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        cityTxtField.setBounds(320,490,300,30);
        add(cityTxtField);
        
        //state
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTxtField = new JTextField();
        stateTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        stateTxtField.setBounds(320,540,300,30);
        add(stateTxtField);
        
        //pincode
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.PLAIN,14));
        pincodeTextField.setBounds(320,590,300,30);
        add(pincodeTextField);
        
        //next page button
        next = new JButton("Next Page >");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(670,80,140,30);
        next.addActionListener(this);
        add(next);
        
        //frame settings
        setTitle("Sign Up Page 1");
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(200,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = ""+random;
        String name = nameTxtField.getText();
        String fatName = fatNameTxtField.getText();
        String addr = addrTxtField.getText();
        String email = emailTxtField.getText();
        String city = cityTxtField.getText();
        String state = stateTxtField.getText();
        String pincode = pincodeTextField.getText();
        
        String dob = ((JTextField)dateOfB.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (maleRadio.isSelected()){
            gender = "Male";
        }
        else if (femaleRadio.isSelected()){
            gender = "Female";
        }
        else if (nonBinRadio.isSelected()){
            gender = "Non-Binary";
        }
        String maritalStatus = null;
        if (married.isSelected()){
            maritalStatus = "Married";
        }
        else if (unmarried.isSelected()){
            maritalStatus = "Un-Married";
        }
        else if (otherMarital.isSelected()){
            maritalStatus = "Other";
        }
        
        try{
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else{
                Conn c = new Conn();
                //step 3 of connection:
                String query = "INSERT INTO signup(formno, name, fatName, dob, gender, email, maritalStatus, addr, city, state, pincode) " +
               "VALUES('"+formno+"','"+name+"','"+fatName+"','"+dob+"','"+gender+"','"+email+"','"+maritalStatus+"','"+addr+"','"+city+"','"+state+"','"+pincode+"')";

                c.s.executeUpdate(query);
                setVisible(false);
                new SignUp2(formno).setVisible(true);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignUp1();
    }
}
