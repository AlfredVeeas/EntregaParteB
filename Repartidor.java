/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author evert
 */
public class Repartidor extends Persona{
    private String MatriculaVehiculo;

    public Repartidor(String MatriculaVehiculo, String Nombre, String Rut, String Direccion) {
        super(Nombre, Rut, Direccion);
        this.MatriculaVehiculo = MatriculaVehiculo;
    }

    public String getMatriculaVehiculo() {
        return MatriculaVehiculo;
    }

    public void setMatriculaVehiculo(String MatriculaVehiculo) {
        this.MatriculaVehiculo = MatriculaVehiculo;
    }

    
    
    @Override
    public String identificarse() {
        return getNombre() + getDireccion() + getMatriculaVehiculo();
    }
    
    public void Repartir(String Direccion){
        System.out.println("Repartiendo a :"+Direccion);
    }
}
