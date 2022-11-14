package com.nttdata.Entity;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.Date;

/**
 * Entidad Contrato
 * Se extiende de la entidad genérica AbstractEntity
 *
 */
@Entity
@Table(name = "Contrato")
public class Contrato extends AbstractEntity{

    @Id
    @GeneratedValue
    private int id;

    @Column
    @Temporal(TemporalType.DATE)
    private Date fechaVigencia;

    @Column
    @Temporal(TemporalType.DATE)
    private Date fechaCaducidad;

    @Column
    @Digits(fraction = 2, integer = 5)
    private Double precioMensual;

    //Relación con Clientes
    @ManyToOne
    @JoinColumn(name = "Id_Cliente")
    private Cliente cliente;

    /**
     * Getter && Setter
     * @return id
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(Double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
