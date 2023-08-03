package estancias.entidades;

import java.util.Date;

public class Casas {

    private int id, altura, tiempoMin, tiempoMax;
    private String calle, ciudad, pais, codigoPostal, tipoVivienda;
    private Date fechaDesde, fechaHasta;
    private double precioHabitacion;

    public Casas() {
    }

    public Casas(int id, int altura, int tiempoMin, int tiempoMax, String calle, String ciudad, String pais, String codigoPostal, String tipoVivienda, Date fechaDesde, Date fechaHasta, double precioHabitacion) {
        this.id = id;
        this.altura = altura;
        this.tiempoMin = tiempoMin;
        this.tiempoMax = tiempoMax;
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.tipoVivienda = tipoVivienda;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.precioHabitacion = precioHabitacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getTiempoMin() {
        return tiempoMin;
    }

    public void setTiempoMin(int tiempoMin) {
        this.tiempoMin = tiempoMin;
    }

    public int getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "DAOMesaCasas{" + "id=" + id + ", altura=" + altura + ", tiempoMin=" + tiempoMin + ", tiempoMax=" + tiempoMax + ", calle=" + calle + ", ciudad=" + ciudad + ", pais=" + pais + ", codigoPostal=" + codigoPostal + ", tipoVivienda=" + tipoVivienda + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", precioHabitacion=" + precioHabitacion + '}';
    }
    
}
