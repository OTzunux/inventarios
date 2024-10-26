/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package productos;

import inventarios.frmMenuProductos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Farasi
 */
public class frmEspecificaciones extends javax.swing.JFrame {
    String nombreArchivo = "especificaciones.txt"; 
    /**
     * Creates new form frmEspecificaciones
     */
    public frmEspecificaciones() {
        initComponents();
        
        setTitle("Gestor de Especificaiones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        configurarTabla();
        cargarDatosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescripcion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEspecificaciones = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Especificaciones:");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Tipo de Dato:");

        areaDescripcion.setColumns(20);
        areaDescripcion.setRows(5);
        jScrollPane1.setViewportView(areaDescripcion);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tableEspecificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Tipo de Dato", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(tableEspecificaciones);

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Texto", "Numero", "Fecha" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(89, 89, 89)
                                .addComponent(btnSeleccionar)
                                .addGap(108, 108, 108)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)
                                    .addComponent(comboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(228, 228, 228)
                                .addComponent(jLabel1)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSeleccionar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmMenuProductos pantalla = new frmMenuProductos();
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            // Capturar los datos del formulario
            int codigo = Integer.parseInt(txtCodigo.getText());
            String nombre = txtNombre.getText();            
            String tipo = comboTipo.getSelectedItem().toString();
            String descripcion = areaDescripcion.getText();
            // Crear objeto de la clase Registros
            Especificaciones registro = new Especificaciones();
            registro.setCodigo(codigo);
            registro.setNombre(nombre);            
            registro.setTipo(tipo);
            registro.setDescripcion(descripcion);

            // Llamar al método de guardar de la clase Registros
            registro.guardarDatos();
            txtCodigo.setText("");        
            txtNombre.setText("");
            areaDescripcion.setText("");
            DefaultTableModel model = (DefaultTableModel) tableEspecificaciones.getModel();
            model.setRowCount(0); // Elimina todas las filas del modelo
            cargarDatosTabla(); // Carga los datos en la tabla
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El código debe ser un número válido.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableEspecificaciones.getSelectedRow();
        if (selectedRow == -1) { // Si no hay ninguna fila seleccionada
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro.");
            return;
        }
        
        String codigo = tableEspecificaciones.getValueAt(selectedRow, 0).toString(); // Columna 0: Código
        String nombre = tableEspecificaciones.getValueAt(selectedRow, 1).toString(); // Columna 1: Nombre
        String tipo = tableEspecificaciones.getValueAt(selectedRow, 2).toString(); // Columna 2: Descripción
        String descripcion = tableEspecificaciones.getValueAt(selectedRow, 3).toString(); // Columna 2: Descripción

        // Colocar los valores en los campos de texto correspondientes
        txtCodigo.setText(codigo);
        txtNombre.setText(nombre);        
        comboTipo.setSelectedItem(tipo);
        areaDescripcion.setText(descripcion);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableEspecificaciones.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro para modificar.");
            return;
        }

        // Obtener los valores actualizados desde los campos de texto
        String codigo = txtCodigo.getText().trim();
        String nombre = txtNombre.getText().trim();
        String tipo = comboTipo.getSelectedItem().toString();
        String descripcion = areaDescripcion.getText().trim();

        if (codigo.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El código y el nombre no pueden estar vacíos.");
            return;
        }

        // Cargar los registros actuales del archivo a una lista
        List<String[]> registros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                registros.add(data);  // Agregar cada línea a la lista
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer los datos: " + e.getMessage());
            return;
        }

        // Actualizar el registro en la lista (según la fila seleccionada)
        registros.get(selectedRow)[0] = codigo;         // Código
        registros.get(selectedRow)[1] = nombre;         // Nombre
        registros.get(selectedRow)[2] = tipo;    // Descripción
        registros.get(selectedRow)[3] = descripcion;    // Descripción

        // Sobrescribir el archivo con los registros actualizados
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, false))) {
            for (String[] registro : registros) {
                writer.write(String.join(",", registro));  // Escribir cada registro
                writer.newLine();
            }
            JOptionPane.showMessageDialog(this, "Registro modificado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
        // Recargar la tabla con los datos actualizados
        limpiarTabla(tableEspecificaciones);
        cargarDatosTabla();        
        txtCodigo.setText("");        
        txtNombre.setText("");
        areaDescripcion.setText("");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableEspecificaciones.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro para eliminar.");
            return;
        }

        // Obtener el valor del código de la fila seleccionada (asumiendo que el código está en la primera columna)
        String codigoSeleccionado = tableEspecificaciones.getValueAt(selectedRow, 0).toString();
        String nombreSeleccionado = tableEspecificaciones.getValueAt(selectedRow, 1).toString();

        try {
            // Leer todas las líneas del archivo
            File archivo = new File(nombreArchivo);
            File tempFile = new File("temp_" + nombreArchivo); // Archivo temporal para escribir los datos nuevos
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String linea;
            boolean registroEliminado = false;

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");

                // Si el código o el nombre no coinciden, escribir la línea en el archivo temporal
                if (!datos[0].equals(codigoSeleccionado) || !datos[1].equals(nombreSeleccionado)) {
                    writer.write(linea);
                    writer.newLine();
                } else {
                    registroEliminado = true; // Marcar que se eliminó el registro
                }
            }

            reader.close();
            writer.close();

            // Reemplazar el archivo original con el archivo temporal
            if (registroEliminado) {
                archivo.delete();
                tempFile.renameTo(archivo);
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
            } else {
                tempFile.delete();
                JOptionPane.showMessageDialog(null, "No se encontró el registro para eliminar.");
            }

            // Limpiar la tabla y volver a cargar los datos actualizados
            limpiarTabla(tableEspecificaciones);
            cargarDatosTabla(); // Carga los datos en la tabla
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void configurarTabla() {
        tableEspecificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},  // Inicialmente sin datos
            new String[]{
                "Codigo", "Nombre", "Tipo de Dato", "Descripción"  // Nombre de las columnas
            }
        ));

        // Configurar el ancho de las columnas
        tableEspecificaciones.getColumnModel().getColumn(0).setPreferredWidth(50);   // Código
        tableEspecificaciones.getColumnModel().getColumn(1).setPreferredWidth(100);  // Nombre
        tableEspecificaciones.getColumnModel().getColumn(2).setPreferredWidth(100);  // Tipo de Dato
        tableEspecificaciones.getColumnModel().getColumn(3).setPreferredWidth(200);  // Descripción
    }
    
    public void limpiarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Eliminar todas las filas
    }
    
    private void cargarDatosTabla() {
        DefaultTableModel model = (DefaultTableModel) tableEspecificaciones.getModel();
        
        // Asegurarte de que el archivo existe antes de guardar
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile(); // Crea el archivo si no existe
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "No se pudo crear el archivo: " + e.getMessage());
                return;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Divide la línea por comas (asume que el formato es: codigo,nombre,descripcion)
                String[] data = line.split(",");
                if (data.length == 4) {
                    // Añade una nueva fila a la tabla con los datos del archivo
                    model.addRow(new Object[]{data[0], data[1], data[2], data[3]});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescripcion;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableEspecificaciones;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
