import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class SQLInjection {
  public static ResultSet doQuery(HttpServletRequest request, Connection connection) throws SQLException {
    String customerName = request.getParameter("customerName");
    String query = "SELECT account_balance FROM user_data WHERE user_name = " + customerName;
    Statement statement = connection.createStatement();
    ResultSet results = statement.executeQuery(query);
