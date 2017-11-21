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
@Table(name = "tg000002", schema = "${schema}")
public class Tg000002 implements java.io.Serializable {
    @Id
    @NotNull
    private String codCiudad;
    @NotNull
    private Tg000004 tg000004;
    private String desCiudad;
    private Set<Tg000003> tg000003s = new HashSet<Tg000003>(0);
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000002() {
    }

    public Tg000002(String codCiudad, String desCiudad,
        Set<Tg000003> tg000003s, Tg000004 tg000004, Set<Tp000001> tp000001s) {
        this.codCiudad = codCiudad;
        this.tg000004 = tg000004;
        this.desCiudad = desCiudad;
        this.tg000003s = tg000003s;
        this.tp000001s = tp000001s;
    }

    public String getCodCiudad() {
        return this.codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public Tg000004 getTg000004() {
        return this.tg000004;
    }

    public void setTg000004(Tg000004 tg000004) {
        this.tg000004 = tg000004;
    }

    public String getDesCiudad() {
        return this.desCiudad;
    }

    public void setDesCiudad(String desCiudad) {
        this.desCiudad = desCiudad;
    }

    public Set<Tg000003> getTg000003s() {
        return this.tg000003s;
    }

    public void setTg000003s(Set<Tg000003> tg000003s) {
        this.tg000003s = tg000003s;
    }

    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
