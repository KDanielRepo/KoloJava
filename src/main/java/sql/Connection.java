package sql;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.Table;

import java.sql.*;
public class Connection {
    public void startConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost/javas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName(driver);
            Object test = "mazda";
            Object test2 = "6";
            Object test3 = 12032017;
            java.sql.Connection connection = DriverManager.getConnection(url,"root","");
            String query = "SELECT * FROM cars";
            //String query1 = "INSERT INTO cars(model, marka, Rok_produkcji) VALUES ('"+test2+"','"+test+"','"+test3+"')";
            Statement statement = connection.createStatement();
            //PreparedStatement preparedStatement = connection.prepareStatement(query1);
            //System.out.println(preparedStatement.execute());
            ResultSet resultSet = statement.executeQuery(query);
                while(resultSet.next()) {
                    Object model = resultSet.getObject("Model");
                    Object marka = resultSet.getObject("Marka");
                    Object rok = resultSet.getObject("Rok_produkcji");
                    System.out.println(model + " " + marka+" "+rok);
                }

            connection.close();
        }catch(Exception E){
            E.printStackTrace();
        }
    }
}
