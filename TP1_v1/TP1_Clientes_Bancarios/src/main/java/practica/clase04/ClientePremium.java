package practica.clase04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Cliente Premium o Preferencial.
 */
public class ClientePremium extends Cliente {

    private double limiteCreditoEspecial;
    private String ejecutivoDeCuentaAsignado;
    private List<String> beneficiosAdicionales;

    public ClientePremium(int id, String nombre, String apellidoORazonSocial,
                          String documentoOCuit, String direccion, String telefono,
                          String correoElectronico, LocalDate fechaAlta,
                          double limiteCreditoEspecial,
                          String ejecutivoDeCuentaAsignado,
                          List<String> beneficiosAdicionales) {
        super(id, nombre, apellidoORazonSocial, documentoOCuit, direccion,
                telefono, correoElectronico, fechaAlta);
        this.limiteCreditoEspecial = limiteCreditoEspecial;
        this.ejecutivoDeCuentaAsignado = ejecutivoDeCuentaAsignado;
        this.beneficiosAdicionales = new ArrayList<>(beneficiosAdicionales);
    }

    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    public String getEjecutivoDeCuentaAsignado() {
        return ejecutivoDeCuentaAsignado;
    }

    public void setEjecutivoDeCuentaAsignado(String ejecutivoDeCuentaAsignado) {
        this.ejecutivoDeCuentaAsignado = ejecutivoDeCuentaAsignado;
    }

    public List<String> getBeneficiosAdicionales() {
        return new ArrayList<>(beneficiosAdicionales);
    }

    public void setBeneficiosAdicionales(List<String> beneficiosAdicionales) {
        this.beneficiosAdicionales = new ArrayList<>(beneficiosAdicionales);
    }

    @Override
    public String toString() {
        return "ClientePremium{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellidoORazonSocial='" + getApellidoORazonSocial() + '\'' +
                ", documentoOCuit='" + getDocumentoOCuit() + '\'' +
                ", limiteCreditoEspecial=" + limiteCreditoEspecial +
                ", ejecutivoDeCuentaAsignado='" + ejecutivoDeCuentaAsignado + '\'' +
                ", beneficiosAdicionales=" + beneficiosAdicionales +
                ", fechaAlta=" + getFechaAlta() +
                '}';
    }
}
