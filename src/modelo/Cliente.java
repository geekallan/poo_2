/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Stark GT
 */
public class Cliente extends Persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
     public void agregar(){
     System.out.println("Nit:" + getNit());
     System.out.println("Nombres:" + this.getNombres());
     System.out.println("Apellidos:" + this.getApellidos());
     System.out.println("Direccion:" + this.getDireccion());
     System.out.println("Telefono:" + this.getTelefono());
     System.out.println("Fecha Nacimiento:" + this.getFecha_nacimiento());
     }
    
}
