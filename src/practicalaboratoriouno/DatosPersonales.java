/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalaboratoriouno;

/**
 *
 * @author Lucho
 */
public class DatosPersonales {
    String nombre,apodo, dob,apellido;
    int edad;
    

    public DatosPersonales(String nombre, String apellido, int edad, String apodo,String dob) {
        this.nombre = nombre;
        this.edad = edad;
        this.apodo = apodo;
        this.dob=dob;
        this.apellido=apellido;
    }
    
    public void mostrar(){
        System.out.println(nombre + " " + apellido + " " + apodo + " " + dob + " " + edad);
      
        
        
    }
            

    
    
}
