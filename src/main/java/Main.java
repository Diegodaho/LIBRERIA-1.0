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
public class Main {
    
   
    public static void main(String[] args) {
      
        /**
         * creacion de un nuevo libro
         */
        Libro libro = new Libro("La chica del tren","Paula Hawkins",1,"fran",2,25000);
        /**
         * metodo para eliminar un libro existente 
         */
        libro.eliminarLibro();
        /**
         * metodo para modificar un libro existente 
         */
        libro.modificarLibro();
        
        /**
         * Creacion del inventario 
         */
        Inventario inventario = new Inventario();
        /**
         * metodo para contar un nuevo libro 
         */
        inventario.contarLibro();
        /**
         * metodo para descontar un nuevo libro 
         */
        inventario.descontarLibro();
        /**
         * metodo para elegir el libro mas costoso 
         */
        inventario.libroMascostoso();
        /**
         * metodo para elegir el libro mas vendido 
         */
        inventario.libroMasvendido();
        /**
         * metodo para elegir el libro menos costoso 
         */
        inventario.libroMenoscostoso();
        /**
         * metodo para elegir el libro menos vendido 
         */
        inventario.menosVendido();
        
        /**
         * Creacion de un  nuevo cliente 
         */
        Cliente cliente = new Cliente("Diego","Henandez",1070345642,3204455);
        /**
         * metodo para comprar un libro dentro del inventario 
         */
        cliente.comprarLibro();
        
        /**
         * Creacion de una nueva caja 
         */
        Caja caja = new Caja(100000);
        /**
         * metodo para descontar el valor de la caja 
         */
        caja.descontarValor();
        /**
         * metodo para agregar el valor a la caja 
         */
        caja.sumarValor();
        
        
        
        
        
        
        
        
        
        
       
       
    }
    
     
    
    
    
  
}
