package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/oop";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connected sucessfully");
            }
            // 3. create the statement object
            Statement st = con.createStatement();
            // 4. execute the query
            String query = "insert into student values(2,'sangam','22')";
            int nor=st.executeUpdate(query);


            st.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}