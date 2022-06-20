/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author evert
 */
public abstract class Persona implements Compra{
    private String Nombre;
    private String Rut;
    private String Direccion;

    public Persona(String Nombre, String Rut, String Direccion) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.Direccion = Direccion;
    }
    
                                                           
    public abstract String identificarse();

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
    public  String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public  String getRut(){
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    } 
    
    
}
