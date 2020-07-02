
package connectionSQL;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author MIGUELANGEL
 */
public class connectionSQL {

Connection conectar = null;
public Connection conexion (){

    try {
    Class.forName("com.mysql.jdbc.Driver");
    conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_administracion","root", "");
        JOptionPane.showMessageDialog(null, "Conexion :) ");
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Conexion :) "+ e.getMessage());
    }
    return conectar;
    }
}

    
