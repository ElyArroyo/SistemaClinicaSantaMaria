
package Procesos;
import Datos.Pacientes;
import Conexion.Conectar_Base;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class P_Pacientes {
   Connection con;
   ResultSet rst;
   PreparedStatement pst;
   Statement stm;
   public void Insertar(Pacientes pc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL INSERT_PACIENTES(?,?,?,?,?,?,?)}");
            csta.setString(1,pc.getDNI());
            csta.setString(2,pc.getNOMBRES());
            csta.setString(3,pc.getAPELLIDOS());
            csta.setString(4,pc.getDIRECCION());
            csta.setInt(5,pc.getTELEFONO());
            csta.setString(6,pc.getSEGURIDAD_SOCIAL());
            csta.setString(7,pc.getMUTUALIDAD());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void Deshabilitar(Pacientes pc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL DESHAB_PACIENTES(?)}");
            csta.setString(1,pc.getDNI());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void Actualizar(Pacientes pc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL ACT_PACIENTES(?,?,?,?,?,?,?)}");
            csta.setString(1,pc.getDNI());
            csta.setString(2,pc.getNOMBRES());
            csta.setString(3,pc.getAPELLIDOS());
            csta.setString(4,pc.getDIRECCION());
            csta.setInt(5,pc.getTELEFONO());
            csta.setString(6,pc.getSEGURIDAD_SOCIAL());
            csta.setString(7,pc.getMUTUALIDAD());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
   public void Habilitar(Pacientes pc){
       try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL HB_PACIENTES(?,?,?,?,?,?,?)}");
            csta.setString(1,pc.getDNI());
            csta.setString(2,pc.getNOMBRES());
            csta.setString(3,pc.getAPELLIDOS());
            csta.setString(4,pc.getDIRECCION());
            csta.setInt(5,pc.getTELEFONO());
            csta.setString(6,pc.getSEGURIDAD_SOCIAL());
            csta.setString(7,pc.getMUTUALIDAD());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
   
    public void Limpiar_DesHab(Pacientes pc){
        try{
            Connection cnx=Conectar_Base.getConnection();
            Statement st=cnx.createStatement();
            ResultSet rs=st.getResultSet();
            CallableStatement csta=cnx.prepareCall("{CALL INS_DES_PAC(?)}");
            csta.setString(1,pc.getDNI());
            rs=csta.executeQuery();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
   
   
}
    

