/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesDisenoFactoryMethod;

/**
 *
 * @author LENOVO
 */
public abstract class Contrato {
    private int horas;
    public abstract double CalcularSueldo(); //clases abstractas solo se declaran
    
    
    public String MostrarHorasTrabajo(){
        return "El tiempo de trabajo de este contrato es:"+horas;
    }
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
}
