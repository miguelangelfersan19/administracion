
package form;

import com.mysql.jdbc.Connection;
import connectionSQL.connectionSQL;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class System extends javax.swing.JFrame {
//instancia del objeto de conexion sql
    
    connectionSQL cc=new connectionSQL();
    Connection con = cc.conexion();
    
    
    /**
     * Creates new form System
     */
    public System() {
        initComponents();
        
        this.setLocationRelativeTo(null); //ubicar el formulario de manera centrada
        this.getContentPane().setBackground(getBackground()); // obtener el color del formulario
        mostrarDatos();// Cargar los datos 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_FechaLimite = new javax.swing.JTextField();
        cb_TipoPeticion = new javax.swing.JComboBox<>();
        cb_Estado = new javax.swing.JComboBox<>();
        txt_Asunto = new javax.swing.JTextField();
        txt_FechaCreacion = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_CodUsuario = new javax.swing.JTextField();
        btn_Nuevo = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Reporte = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_Buscar_estado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REPORTE");

        jLabel2.setText("ASUNTO PQR:");

        jLabel3.setText("TIPO DE PQR:");

        jLabel6.setText("ESTADO:");

        jLabel7.setText("FECHA LIMITE:");

        jLabel8.setText("FECHA CREACION:");

        cb_TipoPeticion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peticiòn", "Queja", "Reclamo" }));

        cb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "En Ejecuciòn", "Cerrado" }));

        txt_Asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AsuntoActionPerformed(evt);
            }
        });

        txt_FechaCreacion.setText("El sistema lo generara");
        txt_FechaCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FechaCreacionActionPerformed(evt);
            }
        });

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("CODIGO USUARIO");

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_Guardar)
                                        .addGap(21, 21, 21)
                                        .addComponent(btn_Nuevo))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_CodUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_TipoPeticion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_Estado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_FechaLimite, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txt_FechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Actualizar)
                                .addGap(14, 14, 14)
                                .addComponent(btn_Eliminar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_CodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_TipoPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_FechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_FechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Nuevo)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Eliminar))
                .addGap(129, 129, 129))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tabla_Reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_Reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ReporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Reporte);

        jLabel5.setText("Buscar estado");

        txt_Buscar_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_estadoActionPerformed(evt);
            }
        });
        txt_Buscar_estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_estadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Buscar_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Buscar_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_FechaCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FechaCreacionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_FechaCreacionActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        // TODO add your handling code here:
        insertarDatos();
        limparCajas();
        mostrarDatos();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void txt_AsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AsuntoActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
limparCajas();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void tabla_ReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ReporteMouseClicked
        // Selecionar los datos de la tabla con un click
        
        int filaseleccionada= tabla_Reporte.rowAtPoint(evt.getPoint());
        
        txt_CodUsuario.setText(tabla_Reporte.getValueAt(filaseleccionada,0).toString());
        cb_TipoPeticion.setSelectedItem(tabla_Reporte.getValueAt(filaseleccionada,1));
        txt_Asunto.setText(tabla_Reporte.getValueAt(filaseleccionada,2).toString());
        cb_Estado.setSelectedItem(tabla_Reporte.getValueAt(filaseleccionada,3));
        txt_FechaCreacion.setText(tabla_Reporte.getValueAt(filaseleccionada,4).toString());
        txt_FechaLimite.setText(tabla_Reporte.getValueAt(filaseleccionada,5).toString());
        // txt_CodigoRegistro.setText(tabla_Reporte.getValueAt(filaseleccionada,6).toString());
        
        
    }//GEN-LAST:event_tabla_ReporteMouseClicked

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
ActualizarDatos();
limparCajas();
mostrarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

eliminarRegistro();
 limparCajas();
mostrarDatos();
       

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void txt_Buscar_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_estadoActionPerformed

    private void txt_Buscar_estadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_estadoKeyReleased
        // buscar por caja de texto bustar estado
        BuscarDatosasunto(txt_Buscar_estado.getText());
        
        
    }//GEN-LAST:event_txt_Buscar_estadoKeyReleased

    // Metodos
    
    public void BuscarDatosasunto(String valor){
    String [] titulos ={"COD USUARIO","TIPO PQR","ASUNTO-PQR","ESTADO","F CREACION","F LIMITE"};
    String [] registros = new String[7];

    DefaultTableModel modelo = new DefaultTableModel(null,titulos);

     String SQL ="select * from solicitud where  estado like '%"+valor+"%'";

        try {
            java.sql.Statement st=con.createStatement();
            java.sql.ResultSet rs=st.executeQuery(SQL);
     
            while (rs.next()){
            
               registros[0]=rs.getString("cod_usuario");
               registros[1]=rs.getString("tipo_peticion");
               registros[2]=rs.getString("asunto");
               registros[3]=rs.getString("estado");
               registros[4]=rs.getString("fecha_creacion");
               registros[5]=rs.getString("fecha_limite");
             //  registros[6]=rs.getString("cod_registro");
               
               modelo.addRow(registros);
           } 
            tabla_Reporte.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar datos "+ e.getMessage());
        }  
    }
    
    
    
    
    
    
    
    public void eliminarRegistro(){
        
        int filaseleccionada=tabla_Reporte.getSelectedRow();
        try {
            String SQL= "delete from solicitud where cod_usuario="+tabla_Reporte.getValueAt(filaseleccionada, 0);
            java.sql.Statement st=con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"error "+e.getMessage());
        }
    
    }
    
    
    
    
     
   public void ActualizarDatos(){
       try {
String SQL="update solicitud set cod_usuario=?, tipo_peticion=?, asunto=?, estado=?, fecha_limite=?  where cod_usuario=? ";
           //conversion de texto a la seleccion
            int filaSeleccionado= tabla_Reporte.getSelectedRow();
            String dao=(String)tabla_Reporte.getValueAt(filaSeleccionado, 0);
            

           java.sql.PreparedStatement pst=con.prepareStatement(SQL); 
           //campos
            pst.setString(1,txt_CodUsuario.getText());
            
            int seleccionado = cb_TipoPeticion.getSelectedIndex();
            pst.setString(2,cb_TipoPeticion.getItemAt(seleccionado));
            
            pst.setString(3,txt_Asunto.getText());
            
            int seleccionado1 = cb_Estado.getSelectedIndex();
            pst.setString(4,cb_Estado.getItemAt(seleccionado1));
            
           // pst.setString(5,txt_FechaCreacion.getText());
            
            pst.setString(5,txt_FechaLimite.getText());
            
            pst.setString(6,dao);
            pst.execute();// Ejecucion 
            
//mensaje de Confirmacion 
            JOptionPane.showMessageDialog(null,"Peticion Actualizada");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"error de actualizacion - verifica Usuario" + e.getMessage());
       }
   
   }
    
    
    public void mostrarDatos(){
    String [] titulos ={"COD USUARIO","TIPO PQR","ASUNTO-PQR","ESTADO","F CREACION","F LIMITE"};
    String [] registros = new String[7];

    DefaultTableModel modelo = new DefaultTableModel(null,titulos);

     String SQL ="select * from solicitud ";

        try {
            java.sql.Statement st=con.createStatement();
            java.sql.ResultSet rs=st.executeQuery(SQL);
     
            while (rs.next()){
            
               registros[0]=rs.getString("cod_usuario");
               registros[1]=rs.getString("tipo_peticion");
               registros[2]=rs.getString("asunto");
               registros[3]=rs.getString("estado");
               registros[4]=rs.getString("fecha_creacion");
               registros[5]=rs.getString("fecha_limite");
             //  registros[6]=rs.getString("cod_registro");
               
               modelo.addRow(registros);
           } 
            tabla_Reporte.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar datos "+ e.getMessage());
        }  
    }
    
    
    
    
     public void limparCajas (){
       txt_CodUsuario.setText("");
       txt_Asunto.setText("");
       txt_FechaLimite.setText("");
    //   txt_FechaCreacion.setText("");
       cb_Estado.setSelectedItem(null);
       cb_TipoPeticion.setSelectedItem(null);
      // txt_CodigoRegistro.setText("");
   }
    
    
    
   public void insertarDatos(){
       try {
String SQL="insert into solicitud (cod_usuario, tipo_peticion, asunto, estado, fecha_limite)values (?,?,?,?,?)";
           
           java.sql.PreparedStatement pst=con.prepareStatement(SQL); 
           //campos
            pst.setString(1,txt_CodUsuario.getText());
            
            int seleccionado = cb_TipoPeticion.getSelectedIndex();
            pst.setString(2,cb_TipoPeticion.getItemAt(seleccionado));
            
            pst.setString(3,txt_Asunto.getText());
            
            int seleccionado1 = cb_Estado.getSelectedIndex();
            pst.setString(4,cb_Estado.getItemAt(seleccionado1));
            
           // pst.setString(5,txt_FechaCreacion.getText());
            
            pst.setString(5,txt_FechaLimite.getText());
            //pst.setString(6,txt_CodigoRegistro.getText());
            
            pst.execute();// Ejecucion 
            //mensaje de Confirmacion 
            JOptionPane.showMessageDialog(null,"Peticion Registrada");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"error al registrar " + e.getMessage());
       }
   
   }
    
    
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
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cb_Estado;
    private javax.swing.JComboBox<String> cb_TipoPeticion;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_Reporte;
    private javax.swing.JTextField txt_Asunto;
    private javax.swing.JTextField txt_Buscar_estado;
    private javax.swing.JTextField txt_CodUsuario;
    private javax.swing.JTextField txt_FechaCreacion;
    private javax.swing.JTextField txt_FechaLimite;
    // End of variables declaration//GEN-END:variables
}