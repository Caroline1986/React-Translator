import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class Demo {
    public static void main(String[] args) {
        long idToUpdate = 0;

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM albums");

            while (rs.next()) {
                System.out.println("rs.getLong(\"id\") = " + rs.getLong("id"));
                System.out.println("(\"rs.getString(3)\") = " + rs.getString(3));
            }


//            INSERT  \\\\
            String sql = "INSERT INTO albums (artist, name, release_date, sales, genre) VALUES('Nelly Furtado', 'Folklore', 2003, 50, 'pop')";
            statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            rs = statement.getGeneratedKeys();
            if (rs.next()) {
                idToUpdate = rs.getLong(1);
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            }

            while (rs.next()) {
                System.out.println("rs.getLong(\"id\") = " + rs.getLong("id"));
                System.out.println("(\"rs.getString(3)\") = " + rs.getString(3));
                System.out.println("rs.getDouble(\"sales\") = " + rs.getDouble("sales"));
            }


//            DELETE  \\\\\
//            long idToDelete = 34;
//            sql = "DELETE FROM albums where id = " + idToDelete;
//            statement.execute(sql);
//            System.out.println(idToDelete + " is gone");


//            UPDATE  \\\\\
            double sales = 60.5;
            statement.execute("UPDATE albums SET sales = " + sales + "WHERE id = " + idToUpdate);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
