/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author LENOVO
 */
//paso 3 se crea la clase Silla moderna
public class SillaModerna implements Silla {
 @Override
 public void describir(){
 System.out.println("Este es una silla moderna");
 }
 @Override
 public void crear(){
  System.out.println("Creando es una silla moderna");
 }
}
