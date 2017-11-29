
package Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conectar_Base {
    
    static String login="CLINICA";
    static String password1="12345";
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
    Connection conn=null;
    String driver ="oracle.jdbc.driver.OracleDriver";
    /*public  Conectar_Base(){
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,login,password);
            if(conn!=null){
                JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
            }
        }catch(SQLException  | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public Connection getConnection(){
            return conn;
        }
    */
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String myDB="jdbc:oracle:thin:@localhost:1521:XE";
            String usuario="CLINICA";
            String password="12345";
            Connection cnx=DriverManager.getConnection(myDB,usuario,password);
            return cnx;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Conectar_Base.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
        
    public ResultSet Listar(String Cad){
        try{
            Class.forName(driver).newInstance();
            Connection cn=DriverManager.getConnection(url,login,password1);
            
            PreparedStatement da= cn.prepareStatement(Cad);
            ResultSet tbl=da.executeQuery();
            return tbl;
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
        JOptionPane.showMessageDialog(null, "ERROR TOTAL");
        return null;
        }
    }
    
    public String Ejecutar(String Cad){
        try{
            Class.forName(driver).newInstance();
            Connection cn=DriverManager.getConnection(url,login,password1);
            
            PreparedStatement da= cn.prepareStatement(Cad);
            int r=da.executeUpdate();
            return "REGISTROS GRABADOS CON EXITO";
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "ERROR" + e.getMessage();
        }
    }
    
    
    public static Statement getStatement() throws ClassNotFoundException, SQLException{
        Statement st=null;
        st = getConnection().createStatement();
        return st;
    }
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps=getConnection().prepareStatement(sql);
        return ps;
    }
    
    public static ResultSet getResultSet(String sql) throws ClassNotFoundException, SQLException{
        ResultSet rs=null;
        rs = getStatement().executeQuery(sql);
        return rs;
    }
    
    public static void Cerrar(Connection cn) throws SQLException{
        cn.close();
    }
    public static void Cerrar(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
}
