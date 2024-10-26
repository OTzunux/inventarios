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
public class productos {
    private int codigo;
    private String nombre;    
    private String categoria;    
    private String caracteristica;    
    private int precio;
    private int cantidad;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
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
        nombreArchivo = "productos.txt";
        
        // Verificar si ya existe un registro con el mismo código o nombre
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 6) {
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
            writer.write(codigo + "," + nombre + "," + categoria + "," + caracteristica + "," + precio+ "," + cantidad + "," + descripcion);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos: " + e.getMessage());
        }
    }
}
