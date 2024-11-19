/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author LENOVO
 */

//por ultimo se crea clase main 

//AGREGAR TIPO DE MUEBLES CLASICO Y AGREGAR FAMILIA SOFAS O CAMAS
public class main {
    public static void main(String[] args){
        MuebleFactory moderno_factory = new MueblesModernoFactory();
        MuebleFactory victoriana_factory = new MueblesVictorianaFactory();
        var tienda_moderna = new TiendaMuebles(moderno_factory);
        var tienda_victoriana = new TiendaMuebles(victoriana_factory);
        
        tienda_moderna.MostrarMuebles();
        System.out.println("--------------");
        tienda_victoriana.MostrarMuebles();
    }
}
