package com.nttdata.Entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Entidad abstracta, introducimos los métodos de identificación
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    /**SERIAL VERSION*/
    private static final long serialVersionUID=1L;

    private int id;

    /**
     *
     * @return el ID
     */
    @Column(name = "Id_Cliente")
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     *
     */
    public void setId(int id) {
        this.id = id;
    }
}
