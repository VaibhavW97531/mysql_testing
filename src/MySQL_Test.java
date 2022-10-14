import java.sql.*;
public class MySQL_Test {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/vaibhavw";
        String username = "root";
        String password = "root";
        String query = "Select * from Student";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next())
        {
            String userData = rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getString(4) + " | " + rs.getString(5) + " | " + rs.getString(6);
            System.out.println(userData);
        }
        st.close();
        con.close();
    }
}
