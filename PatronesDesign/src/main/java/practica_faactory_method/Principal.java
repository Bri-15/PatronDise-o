/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_faactory_method;

import patronesDisenoFactoryMethod.ContratoFactory;
import patronesDisenoFactoryMethod.TipoContrato;

/**
 *
 * @author LENOVO
 */
public class Principal {

    
    public class Main {
    public static void main(String[] args) {
        // Creando una notificación SMS
        notificacion NotificacionSMS = NotificacionFactory.createNotification("SMS");
        NotificacionSMS.send("¡Hola! Tienes un nuevo mensaje.", "123456789");

        // Creando una notificación Push
        notificacion NotificacionPush = NotificacionFactory.createNotification("PUSH");
        NotificacionPush.send("¡Recordatorio! Tienes una nueva notificación.", "user123");

        // Creando una notificación por Email
        notificacion NotificacionEmail = NotificacionFactory.createNotification("EMAIL");
        NotificacionEmail.send("¡Nuevo correo! Revisa tu bandeja de entrada.", "correo@example.com");
    }
}

    }
    

