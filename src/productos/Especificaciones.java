/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

import java.io.*;
import javax.swing.*;
/**
 *
 * @author Farasi
 */
public class Especificaciones {
    private int codigo;
    private String nombre;    
    private String tipo;
    private String descripcion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Método para guardar datos en un archivo
    public void guardarDatos() {
        if (codigo == 0 || nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El código y el nombre son obligatorios y no pueden estar vacíos.");
            return; // No proceder con el guardado
        }else if (codigo <= 0) {
            JOptionPane.showMessageDialog(null, "El código debe ser mayor a 0.");
            return; // No proceder con el guardado
        }

        String nombreArchivo;

        // Determinar el archivo en el que se guardarán los datos
        nombreArchivo = "especificaciones.txt";
        
        // Verificar si ya existe un registro con el mismo código o nombre
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 3) {
                    int codigoExistente = Integer.parseInt(datos[0].trim());
                    String nombreExistente = datos[1].trim();

                    if (codigoExistente == codigo || nombreExistente.equalsIgnoreCase(nombre)) {
                        JOptionPane.showMessageDialog(null, "Ya existe un registro con el mismo código o nombre.");
                        return; // No proceder con el guardado
                    }
                }
            }
        } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
            return;
        }

        // Guardar el nuevo registro
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write(codigo + "," + nombre + "," + tipo + "," + descripcion);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos: " + e.getMessage());
        }
    }
    
}
