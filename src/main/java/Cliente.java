/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerard Amortegui
 * @author Diego Hernandez
 */
public class Cliente {
    
    /**
     * variable donde se guarda el nombre del cliente
     */
    private String nombre;
    /**
     * variable donde se guarda el apellido del cliente
     */
    private String apellido;
    /**
     * variable donde se guarda la cedula del cliente
     */
    private int cedula;
    /**
     * variable donde se guarda el celular del cliente
     */
    private int celular;

    /**
     * Constructor de la clase cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param celular
     */
    public Cliente(String nombre, String apellido, int cedula, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
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
     * Get de la variable apellido
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set de la variable nombre
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Get de la variable cedula
     * @return 
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Set de la variable nombre
     * @param cedula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Get de la variable celular
     * @return 
     */
    public int getCelular() {
        return celular;
    }

    /**
     * Set de la variable nombre
     * @param celular
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    /**
     * creacion del metodo para que el cliente compre un libro
     */
    public void comprarLibro(){
        
    }
    
    
    
}
