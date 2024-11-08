import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String userId = args[0];
        String sql = "SELECT * FROM users WHERE id = '" + userId + "'";
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
