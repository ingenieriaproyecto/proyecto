package com.proyecto.demo.modelo;


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
@Table(name = "tg000029", schema = "${schema}")
public class Tg000029 implements java.io.Serializable {
    @Id
    @NotNull
    private String codSubTipoCotizante;
    private String nombSubTipoCotizante;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000029() {
    }

    public Tg000029(String codSubTipoCotizante, String nombSubTipoCotizante,
        Set<Tp000001> tp000001s) {
        this.codSubTipoCotizante = codSubTipoCotizante;
        this.nombSubTipoCotizante = nombSubTipoCotizante;
        this.tp000001s = tp000001s;
    }

    public String getCodSubTipoCotizante() {
        return this.codSubTipoCotizante;
    }

    public void setCodSubTipoCotizante(String codSubTipoCotizante) {
        this.codSubTipoCotizante = codSubTipoCotizante;
    }

    public String getNombSubTipoCotizante() {
        return this.nombSubTipoCotizante;
    }

    public void setNombSubTipoCotizante(String nombSubTipoCotizante) {
        this.nombSubTipoCotizante = nombSubTipoCotizante;
    }

    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
