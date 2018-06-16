package uam.admision.pruebaimprimir.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Table01", schema = "public")
public class Table01Entity {

    private long id;
    private String paterno;
    private String materno;
    private String nombre;
    private java.sql.Date nacimiento;
    private double peso;
    private String comentarios;


    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }


    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public java.sql.Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(java.sql.Date nacimiento) {
        this.nacimiento = nacimiento;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

}
