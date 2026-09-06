package practica.clase04;

import java.time.LocalDate;

/**
 * Clase para Clientes Morosos.
 */

public class ClienteMoroso extends Cliente {

    private LocalDate fechaUltimoPago;
    private LocalDate fechaMora;

    public ClienteMoroso(int id, String nombre, String apellidoORazonSocial,
                         String documentoOCuit, String direccion, String telefono,
                         String correoElectronico, LocalDate fechaAlta, LocalDate fechaUltimoPago, LocalDate fechaMora){
        super(id, nombre, apellidoORazonSocial, documentoOCuit, direccion,
                telefono, correoElectronico, fechaAlta);
        this.fechaUltimoPago = fechaUltimoPago;
        this.fechaMora = fechaMora;
    }
public LocalDate getfechaUltimoPago() {
    return fechaUltimoPago;
}

public void setfechaUltimoPago(LocalDate fechaUltimoPago) {
    this.fechaUltimoPago = this.fechaUltimoPago;
}

public LocalDate getfechaMora() {
    return fechaMora;
}

public void setfechaMora(LocalDate fechaMora) {
    this.fechaMora = fechaMora;
}

    @Override
    public String toString() {
        return "ClienteMoroso{" +
                     "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellidoORazonSocial='" + getApellidoORazonSocial() + '\'' +
                ", documentoOCuit='" + getDocumentoOCuit() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", correoElectronico='" + getCorreoElectronico() + '\'' +
                ", fechaAlta=" + getFechaAlta() + '\'' +
                ", fechaUltimoPago=" + fechaUltimoPago + '\'' +
                ", fechaMora='" + fechaMora +
                '}';
    }
}
