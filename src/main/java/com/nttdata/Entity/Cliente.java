package com.nttdata.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Lorena Acedo
 *
 * Atributos de la entidad Cliente
 * Extendemos desde la clase Abstracta
 */


@Entity
@Table(name="Client")
public class Cliente extends AbstractEntity implements Serializable {

    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Nos genera los id automáticos
    @Column(name = "Id_Cliente")
    private int id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "Primer_Apellido")
    private String primerApellido;

    @Column(name = "Segundo_Apellido")
    private String segundoApellido;

    @Column(name = "DNI", unique = true, nullable = false, length = 9)
    private String documentoEntidad;


    //Establecemos relación entre clases

    @OneToMany (mappedBy = "cliente", cascade = CascadeType.ALL)
    private List <Contrato> contratoList;

    public String toString() {
        return "Cliente [IdCliente= " + id + ", nombre= " + nombre + ", primerApellido=" + primerApellido + ", segundoApellido= " + segundoApellido + "dni= " + documentoEntidad + "]";
    }

    /**
     * Generación de Getter & Setter
     *
     * @return
     */

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

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDocumentoEntidad() {
        return documentoEntidad;
    }

    public void setDocumentoEntidad(String documentoEntidad) {
        this.documentoEntidad = documentoEntidad;
    }
}
