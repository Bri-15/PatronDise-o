/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author LENOVO
 *
 */
//se crea despues este paso 5
public class MueblesVictorianaFactory implements MuebleFactory{
   
    @Override
    public Silla crearSilla() {
        return (Silla) new SillaVictoriana();
       
    }

    @Override
    public Mesa crearMesa() {
        return (Mesa) new MesaVictoriana();
    }
    
    
}
