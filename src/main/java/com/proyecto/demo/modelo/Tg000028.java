package com.proyecto.demo.modelo;

import org.hibernate.validator.constraints.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
@Table(name = "tg000028", schema = "${schema}")
public class Tg000028 implements java.io.Serializable {
    @Id
    @NotNull
    private String codTipoCotizante;
    private String nombTipoCotizante;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000028() {
    }

    public Tg000028(String codTipoCotizante, String nombTipoCotizante,
        Set<Tp000001> tp000001s) {
        this.codTipoCotizante = codTipoCotizante;
        this.nombTipoCotizante = nombTipoCotizante;
        this.tp000001s = tp000001s;
    }

    public String getCodTipoCotizante() {
        return this.codTipoCotizante;
    }

    public void setCodTipoCotizante(String codTipoCotizante) {
        this.codTipoCotizante = codTipoCotizante;
    }

    public String getNombTipoCotizante() {
        return this.nombTipoCotizante;
    }

    public void setNombTipoCotizante(String nombTipoCotizante) {
        this.nombTipoCotizante = nombTipoCotizante;
    }

    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
