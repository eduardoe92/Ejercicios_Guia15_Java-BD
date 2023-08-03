package estancias.entidades;

public class Familias {

    private int id, edad_minima, edad_maxima, num_hijos, id_casa_familia;
    private String nombre, email;

    public Familias() {
    }

    public Familias(int id, int edad_minima, int edad_maxima, int num_hijos, int id_casa_familia, String nombre, String email) {
        this.id = id;
        this.edad_minima = edad_minima;
        this.edad_maxima = edad_maxima;
        this.num_hijos = num_hijos;
        this.id_casa_familia = id_casa_familia;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public int getEdad_maxima() {
        return edad_maxima;
    }

    public void setEdad_maxima(int edad_maxima) {
        this.edad_maxima = edad_maxima;
    }

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public int getId_casa_familia() {
        return id_casa_familia;
    }

    public void setId_casa_familia(int id_casa_familia) {
        this.id_casa_familia = id_casa_familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DAOMesaFamilias{" + "id=" + id + ", edad_minima=" + edad_minima + ", edad_maxima=" + edad_maxima + ", num_hijos=" + num_hijos + ", id_casa_familia=" + id_casa_familia + ", nombre=" + nombre + ", email=" + email + '}';
    }

}
