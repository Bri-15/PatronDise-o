/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author LENOVO
 */
//esto se impementa de mueble factory paso 4
public class MueblesModernoFactory implements MuebleFactory {

   @Override
    public Silla crearSilla() {
        return new SillaModerna();
       
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    
    }
    
}
