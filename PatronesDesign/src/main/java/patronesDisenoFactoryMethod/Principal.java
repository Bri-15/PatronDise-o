/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesDisenoFactoryMethod;

/**
 *
 * @author LENOVO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var contratoFactory = new ContratoFactory();
        var contratoFijo = contratoFactory.crearContrato(TipoContrato.FIJO);
        var contratoTemporal = contratoFactory.crearContrato(TipoContrato.TEMPORAL);
        var contratoFactura = contratoFactory.crearContrato(TipoContrato.FACTURA);
        var contratoEnLinea = contratoFactory.crearContrato(TipoContrato.ENLINEA);
        
        System.out.println("EL SALARIO DEL CONTRATO FIJO ES:"+contratoFijo.CalcularSueldo());
        System.out.println("EL SALARIO DEL CONTRATO TEMPORAL ES:"+contratoTemporal.CalcularSueldo());
        System.out.println("EL SALARIO DEL CONTRATO POR FACTURAEN LINEA ES:"+contratoFactura.CalcularSueldo());
        System.out.println("EL SALARIO DEL CONTRATO FIJO ES:"+contratoEnLinea.CalcularSueldo());
    }
    
} 
