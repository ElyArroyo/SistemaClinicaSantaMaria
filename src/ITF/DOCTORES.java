/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITF;

import java.util.ArrayList;
import Conexion.Conectar_Base;
import Datos.*;
import Procesos.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author okami
 */
public final class DOCTORES extends javax.swing.JFrame {
    
    DefaultTableModel dtm;
    Conectar_Base con;
    CallableStatement cst;
    ResultSet rst;
    Statement stm;
    Doctor doc=new Doctor();
    P_Doctor pdc=new P_Doctor();
    Buscar_esp bs_esp=new Buscar_esp();
    int contador;
    int des_contador;
    
    
    public void ocul_mensaje(){
        msj_error_1.setVisible(false);
    }
    public DOCTORES() {
        initComponents();
        this.setLocationRelativeTo(null);
        ocul_mensaje();
        TXT_INHABILITADO();
        Llenar();
    }
    
    public void Llenar_Deshabilitado(){
        Vector columnas=new Vector();
        columnas.addElement("ID_DOCTOR");
        columnas.addElement("DNI");
        columnas.addElement("NOMBRES");
        columnas.addElement("APELLIDOS");
        columnas.addElement("ID_ESPECIALIDAD");
        columnas.addElement("LIMITES DE PACIENTES");
        Vector registros=new Vector();
        registros=ConsultaData_Deshabilitada();
        DefaultTableModel dtm=new DefaultTableModel(registros,columnas);
        this.tbl_doctores.setModel(dtm);
    }
    
    public void Llenar(){
        Vector columnas=new Vector();
        columnas.addElement("ID_DOCTOR");
        columnas.addElement("DNI");
        columnas.addElement("NOMBRES");
        columnas.addElement("APELLIDOS");
        columnas.addElement("ID_ESPECIALIDAD");
        columnas.addElement("LIMITES DE PACIENTES");
        Vector registros=new Vector();
        registros=ConsultaData();
        DefaultTableModel dtm=new DefaultTableModel(registros,columnas);
        this.tbl_doctores.setModel(dtm);
    }
    
    
    public void Limpiar(){
        txt_coddoctor.setText("");
        txt_dni.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        //txt_id_especialidad.setText("");
        txt_limite_paciente.setText("");
    }
    
    public void TXT_INHABILITADO(){
        txt_coddoctor.setEnabled(false);
        txt_dni.setEnabled(false);
        txt_nombres.setEnabled(false);
        txt_apellidos.setEnabled(false);
        //txt_id_especialidad.setEnabled(false);
        txt_limite_paciente.setEnabled(false);
    }
    
    public void TXT_HABILITADO(){
        txt_coddoctor.setEnabled(true);
        txt_dni.setEnabled(true);
        txt_nombres.setEnabled(true);
        txt_apellidos.setEnabled(true);
        //txt_id_especialidad.setEnabled(true);
        txt_limite_paciente.setEnabled(true);
    }
    public Vector ConsultaData(){
        Vector registros=null;
        try{
            int conta=0;
            con= new Conectar_Base();
            stm=con.getConnection().createStatement();
            String sql="SELECT * FROM DOCTORES";
            rst=con.Listar(sql);
        ResultSet rs=stm.executeQuery(sql);
        registros=new Vector();
        while(rs.next()){
            Vector item=new Vector();
            item.add(rs.getInt("ID_DOCTORES"));
            item.add(rs.getString("DNI"));
            item.add(rs.getString("NOMBRES"));
            item.add(rs.getString("APELLIDOS"));
            item.add(rs.getInt("ID_ESPEC"));
            item.add(rs.getInt("LIM_PACIENTE"));
            conta++;
            contador=conta;
            registros.add(item);
        }
        }catch(SQLException e){
        }
        return registros;
    }
    
    
    
    
    public Vector ConsultaData_Deshabilitada(){
        Vector registros=null;
        try{
            int conta=0;
            con= new Conectar_Base();
            stm=con.getConnection().createStatement();
            String sql="SELECT * FROM DESHAB_DOC";
            rst=con.Listar(sql);
        ResultSet rs=stm.executeQuery(sql);
        registros=new Vector();
        while(rs.next()){
            Vector item=new Vector();
            item.add(rs.getInt("DS_ID_DOCTORES"));
            item.add(rs.getString("DS_DNI"));
            item.add(rs.getString("DS_NOMBRES"));
            item.add(rs.getString("DS_APELLIDOS"));
            item.add(rs.getInt("DS_ID_ESPEC"));
            item.add(rs.getInt("DS_LIM_PACIENTE"));
            registros.add(item);
            conta++;
            des_contador=conta;
        }
        }catch(SQLException e){
        }
        return registros;
    }
    
   
    
    public void Genera_cod(){
        int resul=contador+des_contador;
        txt_coddoctor.setText(String.valueOf(resul));
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
        txt_coddoctor = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_limite_paciente = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_actualizartabla = new javax.swing.JButton();
        msj_error_1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_especialidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_doctores = new javax.swing.JTable();

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

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE DOCTORES");

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
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOMBRES:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APELLIDOS:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID ESPECIALIDAD:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("LIMITE DE PACIENTE:");

        txt_coddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_coddoctorActionPerformed(evt);
            }
        });
        txt_coddoctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_coddoctorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_coddoctorKeyTyped(evt);
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

        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });

        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });

        txt_limite_paciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_limite_pacienteKeyTyped(evt);
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/mostrar.png"))); // NOI18N
        jButton1.setText("MOSTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_coddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txt_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(62, 62, 62)
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_limite_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msj_error_1)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_actualizartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_coddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msj_error_1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_limite_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 860, 270));

        tbl_doctores.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_doctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_doctoresMousePressed(evt);
            }
        });
        tbl_doctores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl_doctoresKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_doctores);

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
        if(this.txt_coddoctor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR EL DNI ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_coddoctor.requestFocus();
        }else if(this.txt_dni.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LOS NOMBRES ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_dni.requestFocus();
        }else if(this.txt_nombres.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LOS APELLIDOS ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_nombres.requestFocus();
        }else if(this.txt_apellidos.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LA DIRECCION","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_apellidos.requestFocus();
        }else if(this.txt_limite_paciente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"FALTA ESCRIBIR LA SEGURIDAD SOCIAL ","VERIFICAR",JOptionPane.WARNING_MESSAGE);
            this.txt_limite_paciente.requestFocus();
        }
        try{
            doc.setCODDOCTOR(Integer.parseInt(txt_coddoctor.getText()));
            doc.setDNI(txt_dni.getText());
            doc.setNOMBRE(txt_nombres.getText());
            doc.setAPELLIDOS(txt_apellidos.getText());
            doc.setIDESPECIALIDAD(Integer.parseInt(txt_especialidad.getText())); 
            doc.setLIM_PACIENTE(Integer.parseInt(txt_limite_paciente.getText()));
            pdc.Insertar(doc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO INGRESADOS");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_coddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_coddoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_coddoctorActionPerformed

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void btn_deshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deshabilitarActionPerformed
        
        try{
            doc.setCODDOCTOR(Integer.parseInt(txt_coddoctor.getText()));
            doc.setDNI(txt_dni.getText());
            doc.setNOMBRE(txt_nombres.getText());
            doc.setAPELLIDOS(txt_apellidos.getText());
            doc.setIDESPECIALIDAD(Integer.parseInt(txt_especialidad.getText()));
            doc.setLIM_PACIENTE(Integer.parseInt(txt_limite_paciente.getText()));
            pdc.inser_Deshab_doc(doc);
            pdc.Deshabilitar(doc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS DESHABILITADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO DESHABILITADOS");
        }
    }//GEN-LAST:event_btn_deshabilitarActionPerformed

    private void txt_coddoctorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_coddoctorKeyReleased
        if(!txt_coddoctor.getText().matches("[0-9--]*")){
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros","ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
            txt_coddoctor.setText("");
            txt_coddoctor.requestFocus();
        }
    }//GEN-LAST:event_txt_coddoctorKeyReleased

    private void txt_coddoctorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_coddoctorKeyTyped
        
    }//GEN-LAST:event_txt_coddoctorKeyTyped

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

    private void txt_limite_pacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_limite_pacienteKeyTyped
        
    }//GEN-LAST:event_txt_limite_pacienteKeyTyped

    private void btn_actualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizartablaActionPerformed
        Llenar();
    }//GEN-LAST:event_btn_actualizartablaActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        TXT_HABILITADO();
        Genera_cod();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void tbl_doctoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_doctoresMousePressed
        int fila = tbl_doctores.getSelectedRow();
        Limpiar();
        TXT_HABILITADO();
        txt_coddoctor.setEnabled(false);
        btn_guardar.setEnabled(false);
        btn_habilitar.setEnabled(true);
        btn_deshabilitar.setEnabled(true);
        btn_modificar.setEnabled(true);
        try{
        this.txt_coddoctor.setText(tbl_doctores.getValueAt(fila, 0).toString());
        this.txt_dni.setText(tbl_doctores.getValueAt(fila, 1).toString());
        this.txt_nombres.setText(tbl_doctores.getValueAt(fila, 2).toString());
        this.txt_apellidos.setText(tbl_doctores.getValueAt(fila, 3).toString());
        this.txt_especialidad.setText(tbl_doctores.getValueAt(fila, 4).toString());
        this.txt_limite_paciente.setText(tbl_doctores.getValueAt(fila, 5).toString());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tbl_doctoresMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Llenar_Deshabilitado();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try{
            doc.setCODDOCTOR(Integer.parseInt(txt_coddoctor.getText()));
            doc.setDNI(txt_dni.getText());
            doc.setNOMBRE(txt_nombres.getText());
            doc.setAPELLIDOS(txt_apellidos.getText());
            doc.setIDESPECIALIDAD(Integer.parseInt(txt_especialidad.getText())); 
            doc.setLIM_PACIENTE(Integer.parseInt(txt_limite_paciente.getText()));
            pdc.Actualizar(doc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO ACTUALIZADOS");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_habilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_habilitarActionPerformed
        try{
            doc.setCODDOCTOR(Integer.parseInt(txt_coddoctor.getText()));
            doc.setDNI(txt_dni.getText());
            doc.setNOMBRE(txt_nombres.getText());
            doc.setAPELLIDOS(txt_apellidos.getText());
            doc.setIDESPECIALIDAD(Integer.parseInt(txt_especialidad.getText())); 
            doc.setLIM_PACIENTE(Integer.parseInt(txt_limite_paciente.getText()));
            pdc.Insertar(doc);
            pdc.delete_deshab_doc(doc);
            Limpiar();
            JOptionPane.showMessageDialog(null, "DATOS HABILITADOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO HABILITADOS");
        }
    }//GEN-LAST:event_btn_habilitarActionPerformed

    private void txt_dniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyReleased
        if(!txt_coddoctor.getText().matches("[0-9--]*")){
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros","ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
            txt_coddoctor.setText("");
            txt_coddoctor.requestFocus();
        }
    }//GEN-LAST:event_txt_dniKeyReleased

    private void tbl_doctoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_doctoresKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_doctoresKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    bs_esp.setVisible(true);
    txt_especialidad.setText(bs_esp.txt_buscar_esp.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DOCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DOCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DOCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DOCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DOCTORES().setVisible(true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel msj_error_1;
    private javax.swing.JTable tbl_doctores;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_coddoctor;
    private javax.swing.JTextField txt_dni;
    public static javax.swing.JTextField txt_especialidad;
    private javax.swing.JTextField txt_limite_paciente;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
