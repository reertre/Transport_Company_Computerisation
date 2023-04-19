package Transport_company;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "IAMREEt@123");
            s = c.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        if (c == null) {
            throw new SQLException("Connection is null");
        }
        return c.prepareStatement(sql);
    }
}
