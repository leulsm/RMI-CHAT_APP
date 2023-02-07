
package user_GUI;

 
import java.sql.Connection;
import java.sql.DriverManager;

public class Myconnection {


 
 public static Connection getConnection(){

 Connection con = null;
            try {
              Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3325/ds_chat","root", "");
                        } 
            
            catch (Exception ex) {
                            System.out.println(ex.getMessage());
                }
                
            return con;
            }
 
            }
 
