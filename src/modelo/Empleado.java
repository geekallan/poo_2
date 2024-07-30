/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Stark GT
 */
public class Empleado extends Persona {
private String codigo_empleado;

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

private String puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    protected void agregar(){
     System.out.println("Codigo Empleado:" + this.getCodigo_empleado());
     System.out.println("Puesto:" + this.getPuesto());
     System.out.println("Nombres:" + this.getNombres());
     System.out.println("Apellidos:" + this.getApellidos());
     System.out.println("Direccion:" + this.getDireccion());
     System.out.println("Telefono:" + this.getTelefono());
     System.out.println("Fecha Nacimiento:" + this.getFecha_nacimiento());
    }
    
}
