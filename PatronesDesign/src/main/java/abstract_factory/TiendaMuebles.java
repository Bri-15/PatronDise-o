/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author LENOVO
 */
//paso 6 
public class TiendaMuebles {
    private MuebleFactory mueblesFactory;
    
    public TiendaMuebles (MuebleFactory mueblesFactory){
        this.mueblesFactory = mueblesFactory;
    }
    public void MostrarMuebles(){
        var silla = mueblesFactory.crearSilla();
        var mesa = mueblesFactory.crearMesa(); 
        
        silla.crear();
        silla.describir();
        
        mesa.crear();
        mesa.describir();
    }
    
}
