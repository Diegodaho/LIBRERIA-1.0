/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naruk
 */
public class Main {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Libro libro = new Libro("La chica del tren","Paula Hawkins",1,"fran",2,25000);
        libro.agregarLibro();
        libro.eliminarLibro();
        libro.modificarLibro();
        
        Inventario inventario = new Inventario();
        inventario.contarLibro();
        inventario.descontarLibro();
        inventario.libroMascostoso();
        inventario.libroMasvendido();
        inventario.libroMenoscostoso();
        inventario.menosVendido();
        
        
        Cliente cliente = new Cliente("Diego","Henandez",1070345642,3204455);
        cliente.comprarLibro();
        
        
        Caja caja = new Caja(100000);
        caja.descontarValor();
        caja.sumarValor();
        
        
        
        
        
        
        
        
        
        
       
       
    }
    
     
    
    
    
  
}
