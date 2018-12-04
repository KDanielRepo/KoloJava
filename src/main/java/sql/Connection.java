package sql;

import java.sql.*;
public class Connection {
    public void startConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost/javas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName(driver);
            java.sql.Connection connection = DriverManager.getConnection(url,"root","");
            String query = "SELECT * FROM cars";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()) {
                Object model = resultSet.getObject("Model");
                Object marka = resultSet.getObject("Marka");
                System.out.println(model + " " + marka);
            }
            connection.close();
        }catch(Exception E){
            E.printStackTrace();
        }
    }
}
