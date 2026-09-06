package practica.clase04;

import java.time.LocalDate;

/**
 * Clase base que representa un cliente del banco.
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellidoORazonSocial;
    private String documentoOCuit;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private LocalDate fechaAlta;

    public Cliente(int id, String nombre, String apellidoORazonSocial,
                   String documentoOCuit, String direccion, String telefono,
                   String correoElectronico, LocalDate fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoORazonSocial = apellidoORazonSocial;
        this.documentoOCuit = documentoOCuit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaAlta = fechaAlta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoORazonSocial() {
        return apellidoORazonSocial;
    }

    public void setApellidoORazonSocial(String apellidoORazonSocial) {
        this.apellidoORazonSocial = apellidoORazonSocial;
    }

    public String getDocumentoOCuit() {
        return documentoOCuit;
    }

    public void setDocumentoOCuit(String documentoOCuit) {
        this.documentoOCuit = documentoOCuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidoORazonSocial='" + apellidoORazonSocial + '\'' +
                ", documentoOCuit='" + documentoOCuit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
