
package Procesos;
import Datos.*;
import Conexion.Conectar_Base;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class P_Especialidad {
   Connection con;
   ResultSet rst;
   PreparedStatement pst;
   Statement stm;
   public void Insertar(Especialidad esc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL INSERT_ESPECIALIDAD(?,?)}");
            csta.setInt(1,esc.getIDESPECIALIDAD());
            csta.setString(2,esc.getNOMBRE_ESP());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void Deshabilitar(Especialidad esc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL DELETE_ESPECIALIDAD(?)}");
            csta.setInt(1,esc.getIDESPECIALIDAD());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   public void Habilitar(Especialidad esc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL HB_ESPECIALIDADES(?,?)}");
            csta.setInt(1,esc.getIDESPECIALIDAD());
            csta.setString(2,esc.getNOMBRE_ESP());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void Limpiar_Deshab(Especialidad esc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL INS_DES_ESP(?)}");
            csta.setInt(1,esc.getIDESPECIALIDAD());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
}
