package practica.clase04;

import java.time.LocalDate;

/**
 * Cliente Persona Física.
 */
public class ClientePersonaFisica extends Cliente {

    private String dni;
    private LocalDate fechaNacimiento;
    private String profesion;
    private double ingresosDeclarados;

    public ClientePersonaFisica(int id, String nombre, String apellido,
                                String documentoOCuit, String direccion, String telefono,
                                String correoElectronico, LocalDate fechaAlta,
                                String dni, LocalDate fechaNacimiento,
                                String profesion, double ingresosDeclarados) {
        super(id, nombre, apellido, documentoOCuit, direccion, telefono,
                correoElectronico, fechaAlta);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.ingresosDeclarados = ingresosDeclarados;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getIngresosDeclarados() {
        return ingresosDeclarados;
    }

    public void setIngresosDeclarados(double ingresosDeclarados) {
        this.ingresosDeclarados = ingresosDeclarados;
    }

    @Override
    public String toString() {
        return "ClientePersonaFisica{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellidoORazonSocial() + '\'' +
                ", documentoOCuit='" + getDocumentoOCuit() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", correoElectronico='" + getCorreoElectronico() + '\'' +
                ", fechaAlta=" + getFechaAlta() +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", profesion='" + profesion + '\'' +
                ", ingresosDeclarados=" + ingresosDeclarados +
                '}';
    }
}
