/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_faactory_method;

/**
 *
 * @author LENOVO
 */
public class NotificacionEmail extends notificacion {
    
    public void send(String mensaje, String receptor) {
        System.out.println("Enviando Email a " + receptor + ": " + mensaje);
    }
}