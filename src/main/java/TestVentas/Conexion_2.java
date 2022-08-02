
package TestVentas;

/*
 * @author eduar
 */

import java.sql.*;

public class Conexion_2 {
    
 public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/concesionario";
            Connection conexion = DriverManager.getConnection(url, "root", "audiA12022$");
            //String sentencia_p = "USE concesionario";
            //String sentencia = "INSERT INTO vendedores(documento_vendedor, nombres, apellidos, ciudad) values ('1379' ,'Pepito' ,'Perez' ,'Barranquilla');";
            String sentencia = "INSERT INTO vendedores(documento_vendedor, nombres, apellidos, ciudad) values ('2356' ,'Martha' ,'Perez' ,'Bucaramanga');";
            Statement consulta = conexion.createStatement();
            //consulta.executeQuery(sentencia_p);
            //consulta.executeQuery(sentencia);
            consulta.executeUpdate(sentencia);
            conexion.close();
            System.out.println(consulta);
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        } catch (SQLException e) {
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }

    } 
       
}
