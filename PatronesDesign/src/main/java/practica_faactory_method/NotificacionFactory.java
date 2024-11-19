/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_faactory_method;

/**
 *
 * @author LENOVO
 */
public class NotificacionFactory {

    public static notificacion createNotification(String tipo) {
        if (tipo == null) {
            return null;
        }
        switch (tipo.toUpperCase()) {
            case "SMS":
                return new NotificacionSMS();
            case "PUSH":
                return new NotificacionPush();
            case "EMAIL":
                return new NotificacionEmail();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }
}
