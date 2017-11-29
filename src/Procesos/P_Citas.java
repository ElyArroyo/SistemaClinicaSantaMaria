
package Procesos;

import Datos.*;
import Conexion.Conectar_Base;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class P_Citas {
     Connection con;
   ResultSet rst;
   PreparedStatement pst;
   Statement stm;
   
   
   public void Insertar(CITA cs){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL INSERT_CITAS(?,?,?,?,?,?,?)}");
            csta.setInt(1,cs.getID_CITAS());
            csta.setString(2,cs.getDNI_PACIENTES());
            csta.setInt(3,cs.getDOCTOR_ID());
            csta.setString(4,cs.getURGENCIA());
            csta.setDate(5,cs.getFECHA_PROG());
            csta.setDate(6,cs.getFECHA_REG());
            csta.setString(7,cs.getNUM_ORDEN());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
}
