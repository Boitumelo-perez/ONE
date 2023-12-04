import java.sql.*;

public class Login  {
    public static boolean validate(String name, String email, String pass) {
        boolean status= false;
        try{ 
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriveManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe","system","sys" );
        
        PreparedStatement ps=con.prepareStatement (
        "select * from student where name=? and email=? and pass=? ");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,pass);
        
        ResultSet re=ps.executeQuery();
        status=re.next();
        }catch(Exception e){System.out.println(e);}
    }
} 