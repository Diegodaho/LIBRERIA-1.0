/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Hernandez
 * @author Gerard Amortegui
 */
public class Libro {
    
    /**
     * variable donde se guarda el nombre del libro
     */
    private String nombre;
    /**
     * variable donde se guarda el nombre del autor del libro
     */
    private String autor;
    /**
     * variable donde se guarda la version del libro
     */
    private float version;
    /**
     * variable donde se guarda la editorial del libro
     */
    private String editorial;
    /**
     * variable donde se guarda la cantidad del libro que se registra actualmente
     */
    private int cantidad;
    /**
     * variable donde se guarda el costo del libro
     */
    private int costo;

    /**
     * Construtor para la clase Libro
     * @param nombre
     * @param autor
     * @param version
     * @param editorial
     * @param cantidad
     * @param costo
     */
    public Libro(String nombre, String autor, float version, String editorial, int cantidad, int costo) {
        this.nombre = nombre;
        this.autor = autor;
        this.version = version;
        this.editorial = editorial;
        this.cantidad = cantidad;
        this.costo = costo;
    }

 
    /**
     * Get de la variable nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Set de la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Get de la variable autor
     * @return 
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Set de la variable nombre
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    /**
     * Get de la variable version
     * @return 
     */
    public float getVersion() {
        return version;
    }
    
    /**
     * Set de la variable nombre
     * @param version
     */
    public void setVersion(float version) {
        this.version = version;
    }

    /**
     * Get de la variable editorial
     * @return 
     */
    public String getEditorial() {
        return editorial;
    }
    
    /**
     * Set de la variable nombre
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Get de la variable cantidad
     * @return 
     */
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * Set de la variable nombre
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Get de la variable costo
     * @return 
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Set de la variable nombre
     * @param costo
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    /**
     * Creacion de metodo para modificar libro existente
     */
    public void modificarLibro(){
        
    /**
     * Creacion de metodo para eliminar libro existente
     */    
    }
    public void eliminarLibro(){
        
    }
}
