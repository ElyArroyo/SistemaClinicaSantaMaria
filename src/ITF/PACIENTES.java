/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITF;

import java.util.ArrayList;
import Conexion.*;
import Datos.*;
import Procesos.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import javax.swing.*;
import jxl.write.*;
import jxl.*;

/**
 *
 * @author okami
 */
public final class PACIENTES extends javax.swing.JFrame {
    
    DefaultTableModel dtm;
    Conectar_Base con;
    CallableStatement cst;
    ResultSet rst;
    Statement stm;
    Pacientes pc=new Pacientes();
    P_Pacientes ppac=new P_Pacientes();
    public void ocul_mensaje(){
        msj_error_1.setVisible(false);
        msj_error_2.setVisible(false);
    }
    public PACIENTES() {
        initComponents();
        this.setLocationRelativeTo(null);
        ocul_mensaje();
        TXT_INHABILITADO();
        Llenar();
        //cargarpacientes();
        //LlenarTabla();
    }
    
    public void Llenar_Deshabilitado(){
        Vector columnas=new Vector();
        columnas.addElement("DNI");
        columnas.addElement("NOMBRES");
        columnas.addElement("APELLIDOS");
        columnas.addElement("DIRECCION");
        columnas.addElement("TELEFONO");
        columnas.addElement("SEGURIDAD_SOCIAL");
        columnas.addElement("MUTUALIDAD");
        Vector registros=new Vector();
        registros=ConsultaData_Deshabilitada();
        DefaultTableModel dtm=new DefaultTableModel(registros,columnas);
        this.tbl_pacientes.setModel(dtm);
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
        registros=ConsultaData();
        DefaultTableModel dtm=new DefaultTableModel(registros,columnas);
        this.tbl_pacientes.setModel(dtm);
    }
    public void Limpiar(){
        txt_dni.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_seg_social.setText("");
        txt_mutualidad.setText("");
    }
    
    public void TXT_INHABILITADO(){
        txt_dni.setEnabled(false);
        txt_nombres.setEnabled(false);
        txt_apellidos.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_telefono.setEnabled(false);
        txt_seg_social.setEnabled(false);
        txt_mutualidad.setEnabled(false);
    }
    
    
    
    public void TXT_HABILITADO(){
        txt_dni.setEnabled(true);
        txt_nombres.setEnabled(true);
        txt_apellidos.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_telefono.setEnabled(true);
        txt_seg_social.setEnabled(true);
        txt_mutualidad.setEnabled(true);
    }
    public Vector ConsultaData(){
        Vector registros=null;
        try{
            con= new Conectar_Base();
            stm=con.getConnection().createStatement();
            String sql="SELECT * FROM PACIENTES";
            //rst=con.Listar(sql);
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
    
    public Vector ConsultaData_Deshabilitada(){
        Vector registros=null;
        try{
            con= new Conectar_Base();
            stm=con.getConnection().createStatement();
            String sql="SELECT * FROM DESHAB_PAC";
            //rst=con.Listar(sql);
        ResultSet rs=stm.executeQuery(sql);
        registros=new Vector();
        while(rs.next()){
            Vector item=new Vector();
            item.add(rs.getString("DS_DNI"));
            item.add(rs.getString("DS_NOMBRES"));
            item.add(rs.getString("DS_APELLIDOS"));
            item.add(rs.getString("DS_DIRECCION"));
            item.add(rs.getInt("DS_TELEFONO"));
            item.add(rs.getString("DS_SEGURIDAD_SOCIAL"));
            item.add(rs.getString("DS_MUTUALIDAD"));
            registros.add(item);
        }
        }catch(SQLException e){
        }
        return registros;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_deshabilitar = new javax.swing.JButton();
        btn_habilitar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_seg_social = new javax.swing.JTextField();
        txt_mutualidad = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_actualizartabla = new javax.swing.JButton();
        msj_error_1 = new javax.swing.JLabel();
        msj_error_2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_pacientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PACIENTES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/guardar.png"))); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/modificiar.png"))); // NOI18N
        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        btn_deshabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/deshabilitar.png"))); // NOI18N
        btn_deshabilitar.setText("DESHABILITAR");
        btn_deshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deshabilitarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deshabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        btn_habilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/habilitar.png"))); // NOI18N
        btn_habilitar.setText("HABILITAR");
        btn_habilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_habilitarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_habilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PACIENTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "INGRESAR DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRES:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("APELLIDOS:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DIRECCION:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TELEFONO:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SEGURIDAD SOCIAL:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("MUTUALIDAD:");

        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });

        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });

        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_direccionKeyTyped(evt);
            }
        });

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        txt_seg_social.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_seg_socialKeyTyped(evt);
            }
        });

        txt_mutualidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mutualidadKeyTyped(evt);
            }
        });

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/new.png"))); // NOI18N
        btn_nuevo.setText("NUEVO");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_actualizartabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/UPDATE.png"))); // NOI18N
        btn_actualizartabla.setText("ACTUALIZAR");
        btn_actualizartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizartablaActionPerformed(evt);
            }
        });

        msj_error_1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        msj_error_1.setForeground(new java.awt.Color(204, 0, 0));
        msj_error_1.setText("SON 8 NUMEROS");

        msj_error_2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        msj_error_2.setForeground(new java.awt.Color(204, 0, 0));
        msj_error_2.setText("SON 9 o 7 NUMEROS ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/mostrar.png"))); // NOI18N
        jButton1.setText("MOSTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(txt_mutualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(msj_error_2))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(msj_error_1))
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_seg_social, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_actualizartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msj_error_1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_seg_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msj_error_2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_mutualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 860, 270));

        tbl_pacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_pacientesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_pacientes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 860, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(this.txt_dni.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR EL DNI ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_dni.requestFocus();
        }else if(this.txt_nombres.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LOS NOMBRES ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_nombres.requestFocus();
        }else if(this.txt_apellidos.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LOS APELLIDOS ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_apellidos.requestFocus();
        }else if(this.txt_direccion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LA DIRECCION","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_direccion.requestFocus();
        }else if(this.txt_telefono.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR EL TELEFONO ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_telefono.requestFocus();
        }else if(this.txt_seg_social.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LA SEGURIDAD SOCIAL ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_seg_social.requestFocus();
        }else if(this.txt_mutualidad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LA MUTUALIDAD ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_mutualidad.requestFocus();
        }
        try{
            pc.setDNI(txt_dni.getText());
            pc.setNOMBRES(txt_nombres.getText());
            pc.setAPELLIDOS(txt_apellidos.getText());
            pc.setDIRECCION(txt_direccion.getText());
            pc.setTELEFONO(Integer.parseInt(txt_telefono.getText())); 
            pc.setSEGURIDAD_SOCIAL(txt_seg_social.getText());
            pc.setMUTUALIDAD(txt_mutualidad.getText());
            ppac.Insertar(pc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO INGRESADOS");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dniActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void btn_deshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deshabilitarActionPerformed
        
        try{
            pc.setDNI(txt_dni.getText());
            ppac.Deshabilitar(pc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS DESHABILITADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO DESHABILITADOS");
        }
    }//GEN-LAST:event_btn_deshabilitarActionPerformed

    private void txt_dniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyReleased
        if(!txt_dni.getText().matches("[0-9--]*")){
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros","ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
            txt_dni.setText("");
            txt_dni.requestFocus();
        }
    }//GEN-LAST:event_txt_dniKeyReleased

    private void txt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyTyped
        if(txt_dni.getText().length()==8){
            msj_error_1.setVisible(true);
            txt_dni.setText("");
            txt_dni.requestFocus();
            evt.consume();
        }else
            if(txt_dni.getText().length()==7){
                msj_error_1.setVisible(false);
            }
    }//GEN-LAST:event_txt_dniKeyTyped

    private void txt_telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyReleased
        if(!txt_telefono.getText().matches("[0-9--]*")){
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros","ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
            txt_telefono.setText("");
            txt_telefono.requestFocus();
        }
    }//GEN-LAST:event_txt_telefonoKeyReleased

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        if(txt_telefono.getText().length()==9){
            msj_error_2.setVisible(true);
            txt_telefono.setText("");
            txt_telefono.requestFocus();
            evt.consume();
        }else
            if(txt_telefono.getText().length()==8){
                msj_error_1.setVisible(false);
            }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"INGRESA SOLO LETRAS");
        }
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"INGRESA SOLO LETRAS");
        }
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyTyped
        
    }//GEN-LAST:event_txt_direccionKeyTyped

    private void txt_seg_socialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_seg_socialKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"INGRESA SOLO LETRAS");
        }
    }//GEN-LAST:event_txt_seg_socialKeyTyped

    private void txt_mutualidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mutualidadKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"INGRESA SOLO LETRAS");
        }
    }//GEN-LAST:event_txt_mutualidadKeyTyped

    private void btn_actualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizartablaActionPerformed
        Llenar();
    }//GEN-LAST:event_btn_actualizartablaActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        TXT_HABILITADO();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void tbl_pacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pacientesMousePressed
        int fila = tbl_pacientes.getSelectedRow();
        Limpiar();
        TXT_HABILITADO();
        txt_dni.setEnabled(false);
        btn_guardar.setEnabled(false);
        btn_habilitar.setEnabled(true);
        btn_deshabilitar.setEnabled(true);
        btn_modificar.setEnabled(true);
        try{
        this.txt_dni.setText(tbl_pacientes.getValueAt(fila, 0).toString());
        this.txt_nombres.setText(tbl_pacientes.getValueAt(fila, 1).toString());
        this.txt_apellidos.setText(tbl_pacientes.getValueAt(fila, 2).toString());
        this.txt_direccion.setText(tbl_pacientes.getValueAt(fila, 3).toString());
        this.txt_telefono.setText(tbl_pacientes.getValueAt(fila, 4).toString());
        this.txt_seg_social.setText(tbl_pacientes.getValueAt(fila, 5).toString());
        this.txt_mutualidad.setText(tbl_pacientes.getValueAt(fila, 6).toString());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tbl_pacientesMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Llenar_Deshabilitado();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try{
            pc.setDNI(txt_dni.getText());
            pc.setNOMBRES(txt_nombres.getText());
            pc.setAPELLIDOS(txt_apellidos.getText());
            pc.setDIRECCION(txt_direccion.getText());
            pc.setTELEFONO(Integer.parseInt(txt_telefono.getText())); 
            pc.setSEGURIDAD_SOCIAL(txt_seg_social.getText());
            pc.setMUTUALIDAD(txt_mutualidad.getText());
            ppac.Actualizar(pc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO ACTUALIZADOS");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_habilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_habilitarActionPerformed
        try{
            pc.setDNI(txt_dni.getText());
            pc.setNOMBRES(txt_nombres.getText());
            pc.setAPELLIDOS(txt_apellidos.getText());
            pc.setDIRECCION(txt_direccion.getText());
            pc.setTELEFONO(Integer.parseInt(txt_telefono.getText())); 
            pc.setSEGURIDAD_SOCIAL(txt_seg_social.getText());
            pc.setMUTUALIDAD(txt_mutualidad.getText());
            ppac.Insertar(pc);
            ppac.Limpiar_DesHab(pc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS HABILITADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO HABILITADOS");
        }
    }//GEN-LAST:event_btn_habilitarActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PACIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PACIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PACIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PACIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PACIENTES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizartabla;
    private javax.swing.JButton btn_deshabilitar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_habilitar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel msj_error_1;
    private javax.swing.JLabel msj_error_2;
    private javax.swing.JTable tbl_pacientes;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_mutualidad;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_seg_social;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
