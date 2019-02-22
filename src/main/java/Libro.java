/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naruk
 */
public class Libro {
    
    private String nombre;
    private String autor;
    private float version;
    private String editorial;
    private int cantidad;
    private int costo;

    public Libro(String nombre, String autor, float version, String editorial, int cantidad, int costo) {
        this.nombre = nombre;
        this.autor = autor;
        this.version = version;
        this.editorial = editorial;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    public void agregarLibro(){
        
    }
    
    public void modificarLibro(){
        
        
    }
    public void eliminarLibro(){
        
    }
}
