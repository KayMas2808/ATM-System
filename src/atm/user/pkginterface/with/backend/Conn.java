package atm.user.pkginterface.with.backend;

import java.sql.*;
/*5 steps in jdbc conectivity:
    1. register driver
    2. create connection
    3. create statement
    4. execute query
    5. close connection
*/

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            //step 1
            //no need since ava does it itself - Class.forName(com.mysql.cj.jdbc.Driver);
            //s2
            c = DriverManager.getConnection("jdbc:mysql:///atmSystem","root","Special26&&$$");
            //s3
            s = c.createStatement();
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
