/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Carlos Emanuel Hernandez Garcia
//9959-21-363
//Mantenimiento Tiendas
package Ventas.Vista;


import Seguridad.Controlador.clsBitacora;
import Ventas.Controlador.clsTienda;
import Seguridad.Controlador.clsUsuarioConectado;
import Seguridad.Modelo.Conexion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author visitante
 */
public class frmMantenimientotiendas extends javax.swing.JInternalFrame {

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }

    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("nombre");
        modelo.addColumn("direccion");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estatus");
        clsTienda tienda = new clsTienda();
        //VendedorDAO vendedorDAO = new VendedorDAO();
        List<clsTienda> listaTiendas = tienda.getListadoTiendas();
        tablaTiendas.setModel(modelo);
        String[] dato = new String[5];
        for (int i = 0; i < listaTiendas.size(); i++) {
            dato[0] = Integer.toString(listaTiendas.get(i).getIdTienda());
            dato[1] = listaTiendas.get(i).getNombreTienda();
            dato[2] = listaTiendas.get(i).getDireccionTienda();
            dato[3] = listaTiendas.get(i).getTipoTienda();
            dato[4] = listaTiendas.get(i).getEstatusTienda();
            modelo.addRow(dato);
        }       

//a
    }


int codigoAplicacion = 3002;

    public frmMantenimientotiendas() {
        initComponents();
        llenadoDeTablas();
        llenadoDeCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2Tienda = new javax.swing.JLabel();
        lbusuTienda = new javax.swing.JLabel();
        btnEliminarTienda = new javax.swing.JButton();
        btnRegistrarTienda = new javax.swing.JButton();
        btnBuscarTienda = new javax.swing.JButton();
        lbTiendaT = new javax.swing.JLabel();
        btnModificarTienda = new javax.swing.JButton();
        lbNombreTienda = new javax.swing.JLabel();
        txtTiendabuscado = new javax.swing.JTextField();
        txtNombreTienda = new javax.swing.JTextField();
        btnLimpiarTienda = new javax.swing.JButton();
        jScrollPane1Tienda = new javax.swing.JScrollPane();
        tablaTiendas = new javax.swing.JTable();
        txtDireccionTienda = new javax.swing.JTextField();
        lbDireccionTienda = new javax.swing.JLabel();
        btnAyudaTienda = new javax.swing.JButton();
        lbBuscarTienda = new javax.swing.JLabel();
        btnActualizarTienda = new javax.swing.JButton();
        lbTipoTienda = new javax.swing.JLabel();
        txtTipoTienda = new javax.swing.JTextField();
        btnReporteTiendas = new javax.swing.JButton();
        lbEstTienda = new javax.swing.JLabel();
        cbxEstTienda = new javax.swing.JComboBox<>();

        lb2Tienda.setForeground(new java.awt.Color(204, 204, 204));
        lb2Tienda.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Tiendas");
        setVisible(true);

        btnEliminarTienda.setText("Eliminar");
        btnEliminarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTiendaActionPerformed(evt);
            }
        });

        btnRegistrarTienda.setText("Registrar");
        btnRegistrarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTiendaActionPerformed(evt);
            }
        });

        btnBuscarTienda.setText("Buscar");
        btnBuscarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTiendaActionPerformed(evt);
            }
        });

        lbTiendaT.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbTiendaT.setText("Tienda");

        btnModificarTienda.setText("Modificar");
        btnModificarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTiendaActionPerformed(evt);
            }
        });

        lbNombreTienda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbNombreTienda.setText("Nombre");

        txtTiendabuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiendabuscadoActionPerformed(evt);
            }
        });

        txtNombreTienda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombreTienda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        btnLimpiarTienda.setText("Limpiar");
        btnLimpiarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTiendaActionPerformed(evt);
            }
        });

        tablaTiendas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaTiendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1Tienda.setViewportView(tablaTiendas);

        txtDireccionTienda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccionTienda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        lbDireccionTienda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbDireccionTienda.setText("Direccion");

        btnAyudaTienda.setText("Ayuda");
        btnAyudaTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaTiendaActionPerformed(evt);
            }
        });

        lbBuscarTienda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbBuscarTienda.setText("ID a buscar");

        btnActualizarTienda.setText("Actualizar");
        btnActualizarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTiendaActionPerformed(evt);
            }
        });

        lbTipoTienda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbTipoTienda.setText("Tipo");

        txtTipoTienda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTipoTienda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtTipoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoTiendaActionPerformed(evt);
            }
        });

        btnReporteTiendas.setText("Reporte");
        btnReporteTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteTiendasActionPerformed(evt);
            }
        });

        lbEstTienda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbEstTienda.setText("Estatus");

        cbxEstTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "F" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNombreTienda)
                                    .addComponent(lbDireccionTienda))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccionTienda, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(txtNombreTienda)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTipoTienda)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxEstTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtTipoTienda, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnRegistrarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnModificarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnLimpiarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAyudaTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnEliminarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnReporteTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbBuscarTienda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTiendabuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbEstTienda)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizarTienda)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTiendaT)
                        .addGap(294, 591, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1Tienda, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTiendaT)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombreTienda))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDireccionTienda))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTipoTienda)
                            .addComponent(txtTipoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEstTienda)
                            .addComponent(cbxEstTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarTienda)
                            .addComponent(btnEliminarTienda)
                            .addComponent(btnModificarTienda))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiarTienda)
                            .addComponent(btnAyudaTienda)
                            .addComponent(btnReporteTiendas))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarTienda)
                            .addComponent(txtTiendabuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBuscarTienda))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarTienda)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTiendaActionPerformed
        // TODO add your handling code here:
        int registrosBorrados=0;
        clsTienda tienda = new clsTienda();
        tienda.setIdTienda(Integer.parseInt(txtTiendabuscado.getText()));
        registrosBorrados=tienda.setBorrarTienda(tienda);
        JOptionPane.showMessageDialog(null, "Registro Borrado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"DEL"); 
        llenadoDeTablas();
        limpiarTextos();
        
        
    }//GEN-LAST:event_btnEliminarTiendaActionPerformed

    private void btnRegistrarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTiendaActionPerformed
        clsTienda tienda = new clsTienda();
        tienda.setNombreTienda(txtNombreTienda.getText());
        tienda.setDireccionTienda(txtDireccionTienda.getText());
        tienda.setTipoTienda(txtTipoTienda.getText());
        String estatus = (String) cbxEstTienda.getSelectedItem();
        tienda.setEstatusTienda(estatus);
        tienda.setIngresarTienda(tienda);
        JOptionPane.showMessageDialog(null, "Registro Ingresado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INS");
        llenadoDeTablas();
        limpiarTextos();
        
    }//GEN-LAST:event_btnRegistrarTiendaActionPerformed

    private void btnBuscarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTiendaActionPerformed
        // TODO add your handling code here:
        clsTienda tienda = new clsTienda();
        //aplicacion.setNombreAplicacion(txtbuscado.getText());        
       tienda.setIdTienda(Integer.parseInt(txtTiendabuscado.getText()));        
        tienda = tienda.getBuscarInformacionTiendaPorId(tienda);
        System.out.println("Usuario retornado:" + tienda);        
        txtNombreTienda.setText(tienda.getNombreTienda());
        txtDireccionTienda.setText(tienda.getDireccionTienda());
        txtTipoTienda.setText(tienda.getTipoTienda());
         int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "QRY");
                 
        
        
    }//GEN-LAST:event_btnBuscarTiendaActionPerformed

   
    private void btnModificarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTiendaActionPerformed
//        // TODO add your handling code here:
        clsTienda tienda = new clsTienda();
        tienda.setIdTienda(Integer.parseInt(txtTiendabuscado.getText()));
        tienda.setNombreTienda(txtNombreTienda.getText());
        tienda.setDireccionTienda(txtDireccionTienda.getText());
        tienda.setTipoTienda(txtTipoTienda.getText());
        String estatus = (String) cbxEstTienda.getSelectedItem();
        tienda.setEstatusTienda(estatus);
        tienda.setModificarTienda(tienda);
        JOptionPane.showMessageDialog(null, "Registro Modificado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);      
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "UPD");
        llenadoDeTablas();
        limpiarTextos();
    }//GEN-LAST:event_btnModificarTiendaActionPerformed

    private void btnLimpiarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTiendaActionPerformed
        limpiarTextos();
        habilitarBotones();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarTiendaActionPerformed
    public void limpiarTextos()
    {
        txtNombreTienda.setText("");
        txtDireccionTienda.setText("");
        txtTipoTienda.setText("");
        txtTiendabuscado.setText("");
    }
    public void habilitarBotones()
    {
        btnRegistrarTienda.setEnabled(true);
        btnModificarTienda.setEnabled(true);
        btnEliminarTienda.setEnabled(true);
    }
    public void desHabilitarBotones()
    {
        btnRegistrarTienda.setEnabled(false);
        btnModificarTienda.setEnabled(false);
        btnEliminarTienda.setEnabled(false);
    }    
    
    private void btnAyudaTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaTiendaActionPerformed
        // TODO add your handling code here:
        //Carlos Javier Sandoval Catalán
        //9959-21-1324
        try {
            if ((new File("src\\main\\java\\ventas\\ayuda\\ayudatie.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ventas\\ayuda\\ayudatie.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAyudaTiendaActionPerformed

    private void btnActualizarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTiendaActionPerformed
        // TODO add your handling code here:
        llenadoDeTablas();
    }//GEN-LAST:event_btnActualizarTiendaActionPerformed

    private void txtTipoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoTiendaActionPerformed

    private void txtTiendabuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiendabuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiendabuscadoActionPerformed

    private void btnReporteTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteTiendasActionPerformed
        // TODO add your handling code here:
         //María José Véliz Ochoa 
        //9959-21-5909
        Connection conn = null;        
        Map p = new HashMap();
        net.sf.jasperreports.engine.JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()

                    + "/src/main/java/Ventas/Reportes/rptTiendas.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
                  int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"RPT");                                     
    }//GEN-LAST:event_btnReporteTiendasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTienda;
    private javax.swing.JButton btnAyudaTienda;
    private javax.swing.JButton btnBuscarTienda;
    private javax.swing.JButton btnEliminarTienda;
    private javax.swing.JButton btnLimpiarTienda;
    private javax.swing.JButton btnModificarTienda;
    private javax.swing.JButton btnRegistrarTienda;
    private javax.swing.JButton btnReporteTiendas;
    private javax.swing.JComboBox<String> cbxEstTienda;
    private javax.swing.JScrollPane jScrollPane1Tienda;
    private javax.swing.JLabel lb2Tienda;
    private javax.swing.JLabel lbBuscarTienda;
    private javax.swing.JLabel lbDireccionTienda;
    private javax.swing.JLabel lbEstTienda;
    private javax.swing.JLabel lbNombreTienda;
    private javax.swing.JLabel lbTiendaT;
    private javax.swing.JLabel lbTipoTienda;
    private javax.swing.JLabel lbusuTienda;
    private javax.swing.JTable tablaTiendas;
    private javax.swing.JTextField txtDireccionTienda;
    private javax.swing.JTextField txtNombreTienda;
    private javax.swing.JTextField txtTiendabuscado;
    private javax.swing.JTextField txtTipoTienda;
    // End of variables declaration//GEN-END:variables
}
