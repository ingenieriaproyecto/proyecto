package com.proyecto.demo.modelo;

import org.hibernate.validator.constraints.*;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
@Table(name = "tg000010", schema = "${schema}")
public class Tg000010 implements java.io.Serializable {
    @Id
    @NotNull
    private Tg000010Id id;
    @NotNull
    private Tg000003 tg000003;
    private String nomSucursal;

    public Tg000010() {
    }

    public Tg000010(Tg000010Id id, String nomSucursal, Tg000003 tg000003) {
        this.id = id;
        this.tg000003 = tg000003;
        this.nomSucursal = nomSucursal;
    }

    public Tg000010Id getId() {
        return this.id;
    }

    public void setId(Tg000010Id id) {
        this.id = id;
    }

    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    public String getNomSucursal() {
        return this.nomSucursal;
    }

    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }
}
