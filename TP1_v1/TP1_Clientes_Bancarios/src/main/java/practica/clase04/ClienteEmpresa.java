package practica.clase04;

import java.time.LocalDate;

/**
 * Cliente Empresa / Persona Jurídica.
 */
public class ClienteEmpresa extends Cliente {

    private String razonSocial;
    private String cuit;
    private String rubroOActividad;
    private String representanteLegal;

    public ClienteEmpresa(int id, String nombre, String apellidoORazonSocial,
                           String documentoOCuit, String direccion, String telefono,
                           String correoElectronico, LocalDate fechaAlta,
                           String razonSocial, String cuit,
                           String rubroOActividad, String representanteLegal) {
        super(id, nombre, apellidoORazonSocial, documentoOCuit, direccion,
                telefono, correoElectronico, fechaAlta);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.rubroOActividad = rubroOActividad;
        this.representanteLegal = representanteLegal;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRubroOActividad() {
        return rubroOActividad;
    }

    public void setRubroOActividad(String rubroOActividad) {
        this.rubroOActividad = rubroOActividad;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" +
                "id=" + getId() +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit='" + cuit + '\'' +
                ", rubroOActividad='" + rubroOActividad + '\'' +
                ", representanteLegal='" + representanteLegal + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", correoElectronico='" + getCorreoElectronico() + '\'' +
                ", fechaAlta=" + getFechaAlta() +
                '}';
    }
}
