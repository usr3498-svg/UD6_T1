package net.salesianos.EmpresaReparacion;

public class Reparacion {

    private int codigo;
    private String cliente;
    private String descripcion;
    private boolean urgente;

    public Reparacion(int codigo, String cliente, String descripcion) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.urgente = false;
    }

    public String getCliente() {
        return cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean getUrgente() {
        return urgente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "codigo=" + codigo +
                ", cliente='" + cliente + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", urgente=" + urgente +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Reparacion) {
            return this.codigo == ((Reparacion) obj).codigo;
        }
        return false;
    }

}
