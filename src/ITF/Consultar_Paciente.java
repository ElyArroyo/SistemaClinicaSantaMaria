/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITF;

import java.util.ArrayList;
import Conexion.Conectar_Base;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author okami
 */
public class Consultar_Paciente extends javax.swing.JFrame {
    
    Conectar_Base con;
    Statement stm;
    ResultSet rst;
    String Atributo="DNI";
    /**
     * Creates new form Consultar_Paciente
     */
    public Consultar_Paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrartabla("");
        //Llenar();
    }
    void mostrartabla(String valor){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("APELLIDOS");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("SEGURIDAD_SOCIAL");
        modelo.addColumn("MUTUALIDAD");
        tbl_buscar_paciente.setModel(modelo);
        String sql="";
            if(valor.equals("")){
                sql="SELECT * FROM PACIENTES";
            }else{
                sql="SELECT * FROM PACIENTES WHERE "+Atributo+"='"+valor+"'";
            }
        String datos[] =new String[7];
        try{
            con= new Conectar_Base();
            stm=con.getConnection().createStatement();
            rst=stm.executeQuery(sql);
            while(rst.next()){
                datos[0]=rst.getString(1);
                datos[1]=rst.getString(2);
                datos[2]=rst.getString(3);
                datos[3]=rst.getString(4);
                datos[4]=String.valueOf(rst.getInt(5));
                datos[5]=rst.getString(6);
                datos[6]=rst.getString(7);
                modelo.addRow(datos);
            }
            tbl_buscar_paciente.setModel(modelo);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    /*public Vector ConsultaData(String valor){
        Vector registros=null;
        try{
            Connection cn;
            con= new Conectar_Base();
            stm=con.getConnection().createStatement();
            String sql="";
            if(valor.equals("")){
                sql="SELECT * FROM PACIENTES";
            }else{
                sql="SELECT * FROM PACIENTES WHERE "+Atributo+"='"+valor+"'";
            }
            rst=con.Listar(sql);
            ResultSet rs=stm.executeQuery(sql);
            registros=new Vector();
            while(rs.next()){
            Vector item=new Vector();
            item.add(rs.getString("DNI"));
            item.add(rs.getString("NOMBRES"));
            item.add(rs.getString("APELLIDOS"));
            item.add(rs.getString("DIRECCION"));
            item.add(rs.getInt("TELEFONO"));
            item.add(rs.getString("SEGURIDAD_SOCIAL"));
            item.add(rs.getString("MUTUALIDAD"));
            registros.add(item);
        }
            
        }catch(SQLException e){
        }
        return registros;
    }
    
    public void Llenar(){
        Vector columnas=new Vector();
        columnas.addElement("DNI");
        columnas.addElement("NOMBRES");
        columnas.addElement("APELLIDOS");
        columnas.addElement("DIRECCION");
        columnas.addElement("TELEFONO");
        columnas.addElement("SEGURIDAD_SOCIAL");
        columnas.addElement("MUTUALIDAD");
        Vector registros=new Vector();
        registros=ConsultaData("");
        DefaultTableModel dtm=new DefaultTableModel(registros,columnas);
        this.tbl_buscar_paciente.setModel(dtm);
    }/*
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_nombre = new javax.swing.JRadioButton();
        btn_dni = new javax.swing.JRadioButton();
        btn_apellido = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_buscar_paciente = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BUSCAR PACIENTE:");

        btn_nombre.setBackground(new java.awt.Color(0, 204, 204));
        botones.add(btn_nombre);
        btn_nombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_nombre.setForeground(new java.awt.Color(0, 0, 0));
        btn_nombre.setText("NOMBRE");

        btn_dni.setBackground(new java.awt.Color(0, 204, 204));
        botones.add(btn_dni);
        btn_dni.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_dni.setForeground(new java.awt.Color(0, 0, 0));
        btn_dni.setText("DNI");

        btn_apellido.setBackground(new java.awt.Color(0, 204, 204));
        botones.add(btn_apellido);
        btn_apellido.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_apellido.setForeground(new java.awt.Color(0, 0, 0));
        btn_apellido.setText("APELLIDO");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PREGUNTA.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbl_buscar_paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_buscar_paciente);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/UPDATE.png"))); // NOI18N
        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_dni)
                            .addComponent(btn_apellido)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(42, 42, 42))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(144, 144, 144)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton2))
                                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_buscar))
                .addGap(18, 18, 18)
                .addComponent(btn_dni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nombre)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_apellido)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        botones.add(btn_dni);
        botones.add(btn_nombre);
        botones.add(btn_apellido);
        if(btn_dni.isSelected()){
          Atributo="DNI";
          mostrartabla(txt_buscar.getText());
        }
        else if(btn_nombre.isSelected()){
            Atributo="NOMBRES";
            mostrartabla(txt_buscar.getText());
        }
        else if(btn_apellido.isSelected()){
            Atributo="APELLIDOS";
           mostrartabla(txt_buscar.getText());
        }else{
            JOptionPane.showMessageDialog(null,"ELIGE UNA OPCION PORFAVOR");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrartabla("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            //jabtn_dning.Logger.getLogger(Consultar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JRadioButton btn_apellido;
    private javax.swing.JRadioButton btn_dni;
    private javax.swing.JRadioButton btn_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbl_buscar_paciente;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}