/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author LENOVO
 */
public class SillaVictoriana implements Silla {
 @Override
 public void describir(){
 System.out.println("Este es una silla victoriana");
 }
 @Override
 public void crear(){
  System.out.println("Creando es una silla victoriana");
 }
}
