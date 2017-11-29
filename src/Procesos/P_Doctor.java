
package Procesos;
import Datos.Doctor;
import Conexion.Conectar_Base;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class P_Doctor {
   Connection con;
   ResultSet rst;
   PreparedStatement pst;
   Statement stm;
   public void Insertar(Doctor doc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL INSERT_DOCTORES(?,?,?,?,?,?)}");
            csta.setInt(1,doc.getCODDOCTOR());
            csta.setString(2,doc.getDNI());
            csta.setString(3,doc.getNOMBRE());
            csta.setString(4,doc.getAPELLIDOS());
            csta.setInt(5,doc.getIDESPECIALIDAD());
            csta.setInt(6,doc.getLIM_PACIENTE());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void Deshabilitar(Doctor doc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL DESHAB_DOCTORES(?)}");
            csta.setInt(1,doc.getCODDOCTOR());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void Actualizar(Doctor doc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL ACT_DOCTORES(?,?,?,?,?,?)}");
            csta.setInt(1,doc.getCODDOCTOR());
            csta.setString(2,doc.getDNI());
            csta.setString(3,doc.getNOMBRE());
            csta.setString(4,doc.getAPELLIDOS());
            csta.setInt(5,doc.getIDESPECIALIDAD());
            csta.setInt(6,doc.getLIM_PACIENTE());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   public void Habilitar(Doctor doc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL HB_DOCTORES(?,?,?,?,?,?)}");
            csta.setInt(1,doc.getCODDOCTOR());
            csta.setString(2,doc.getDNI());
            csta.setString(3,doc.getNOMBRE());
            csta.setString(4,doc.getAPELLIDOS());
            csta.setInt(5,doc.getIDESPECIALIDAD());
            csta.setInt(6,doc.getLIM_PACIENTE());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
   public void inser_Deshab_doc(Doctor doc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL INSERT_DESHAB_DOC(?,?,?,?,?,?)}");
            csta.setInt(1,doc.getCODDOCTOR());
            csta.setString(2,doc.getDNI());
            csta.setString(3,doc.getNOMBRE());
            csta.setString(4,doc.getAPELLIDOS());
            csta.setInt(5,doc.getIDESPECIALIDAD());
            csta.setInt(6,doc.getLIM_PACIENTE());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void delete_deshab_doc(Doctor doc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL DELETE_DOCTORES(?)}");
            csta.setInt(1,doc.getCODDOCTOR());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }

}
