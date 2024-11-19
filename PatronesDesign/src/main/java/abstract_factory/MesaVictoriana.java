/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author LENOVO
 */
public class MesaVictoriana implements Mesa {
    @Override
 public void describir(){
 System.out.println("Este es una mesa victoriana");
 }
 @Override
 public void crear(){
  System.out.println("Creando es una mesa victoriana");
 }
}
