package atm.user.pkginterface.with.backend;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp2 extends JFrame implements ActionListener{
    JTextField panTxtField, aadharTxtField;
    JComboBox religion,category,income,education,occupation;
    JRadioButton seniorYes,seniorNo,existingYes,existingNo;
    JButton next;
    String formno;
    SignUp2(String formno){
        this.formno = formno;
        setLayout(null);
       
        
        JLabel addDet = new JLabel("Additional Details: Page 2");
        addDet.setFont(new Font("Osward", Font.BOLD,22));
        addDet.setBounds(290,80,400,30);
        add(addDet);
        
        //Religions
        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD,20));
        religionLabel.setBounds(100,140,100,30);
        add(religionLabel);
        
        String religions [] = {"Hindu", "Jain", "Muslim", "Sikh"};  
        religion = new JComboBox(religions);
        religion.setBounds(320,140,300,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        //Category
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD,20));
        categoryLabel.setBounds(100,190,200,30);
        add(categoryLabel);
        
        String categories[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(categories);
        category.setBounds(320,190,300,30);
        category.setBackground(Color.WHITE);
        add(category);
                
        //Income
        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD,20));
        incomeLabel.setBounds(100,240,200,30);
        add(incomeLabel);
        
        String incomes[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomes);
        income.setBounds(320,240,300,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        //educational
        JLabel educationaLabel = new JLabel("Educational");
        educationaLabel.setFont(new Font("Raleway", Font.BOLD,20));
        educationaLabel.setBounds(100,290,200,30);
        add(educationaLabel);
        
        //qualification
        JLabel qualiLabel = new JLabel("Qualification:");
        qualiLabel.setFont(new Font("Raleway", Font.BOLD,20));
        qualiLabel.setBounds(100,315,200,30);
        add(qualiLabel);
        
        String educations [] = {"Non-Graduate","Graduate","Post-Graduate","Other"};
        education = new JComboBox(educations);
        education.setBounds(320,290,300,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        //Occupation
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD,20));
        occupationLabel.setBounds(100,390,200,30);
        add(occupationLabel);
        
        String occupations[] = {"Salaried","Self Employeed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupations);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(320,390,200,30);
        add(occupation);
        
        //address
        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD,20));
        panLabel.setBounds(100,440,200,30);
        add(panLabel);
        
        panTxtField = new JTextField();
        panTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        panTxtField.setBounds(320,440,300,30);
        add(panTxtField);
        
        //city
        JLabel aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD,20));
        aadharLabel.setBounds(100,490,200,30);
        add(aadharLabel);
        
        aadharTxtField = new JTextField();
        aadharTxtField.setFont(new Font("Raleway", Font.PLAIN,14));
        aadharTxtField.setBounds(320,490,300,30);
        add(aadharTxtField);
        
        //senior or no
        JLabel seniorLabel = new JLabel("Senior Citizen:");
        seniorLabel.setFont(new Font("Raleway", Font.BOLD,20));
        seniorLabel.setBounds(100,540,200,30);
        add(seniorLabel);
        
        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(320,540,70,30);
        seniorYes.setBackground(Color.WHITE);
        add(seniorYes);
        
        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(400,540,70,30);
        seniorNo.setBackground(Color.WHITE);
        add(seniorNo);
        
        ButtonGroup seniorGrp = new ButtonGroup();
        seniorGrp.add(seniorYes);
        seniorGrp.add(seniorNo);
        
        //existing account
        JLabel existingAcc = new JLabel("Existing Account:");
        existingAcc.setFont(new Font("Raleway", Font.BOLD,20));
        existingAcc.setBounds(100,590,200,30);
        add(existingAcc);
        
        existingYes = new JRadioButton("Yes");
        existingYes.setBounds(320,590,70,30);
        existingYes.setBackground(Color.WHITE);
        add(existingYes);
        
        existingNo = new JRadioButton("No");
        existingNo.setBounds(400,590,70,30);
        existingNo.setBackground(Color.WHITE);
        add(existingNo);
        
        ButtonGroup existingGrp = new ButtonGroup();
        existingGrp.add(existingYes);
        existingGrp.add(existingNo);
        
        //next page button
        next = new JButton("Next Page >");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(670,80,140,30);
        next.addActionListener(this);
        add(next);
        
        //frame settings
        setTitle("Sign Up Page 2");
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(200,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String panNo = panTxtField.getText();
        String aadharNo = aadharTxtField.getText();
        //religion,category,income,education,occupation
        String religionVal = (String)religion.getSelectedItem();
        String categoryVal = (String)category.getSelectedItem();
        String incomeVal = (String)income.getSelectedItem();
        String educationVal = (String)education.getSelectedItem();
        String occupationVal = (String)occupation.getSelectedItem();
        String senior = null;
        if (seniorYes.isSelected()){
            senior = "Yes";
        }
        else if (seniorNo.isSelected()){
            senior = "No";
        }
        String existingAcc = null;
        if (existingYes.isSelected()){
            existingAcc = "Yes";
        }
        else if (existingNo.isSelected()){
            existingAcc = "No";
        }
        
        try{
            if (aadharNo.equals("")||panNo.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar/PAN is required");
            }
            else{
                Conn c = new Conn();
                //step 3 of connection:
                //we're using formno as primary key and adding remaining details to db
                String query = "UPDATE signup SET religionVal='"+religionVal+"', categoryVal='"+categoryVal+"', incomeVal='"+incomeVal+"', educationVal='"+educationVal+"', occupationVal='"+occupationVal+"', senior='"+senior+"', existingAcc='"+existingAcc+"', panNo='"+panNo+"', aadharNo='"+aadharNo+"' " +
                         "WHERE formno='"+formno+"'";

                c.s.executeUpdate(query);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignUp2("");
    }
}
