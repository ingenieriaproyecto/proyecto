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
@Table(name = "tg000012", schema = "${schema}")
public class Tg000012 implements java.io.Serializable {
    @Id
    @NotNull
    private String codProfesion;
    private String desProfesion;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000012() {
    }

    public Tg000012(String codProfesion, String desProfesion,
        Set<Tp000001> tp000001s) {
        this.codProfesion = codProfesion;
        this.desProfesion = desProfesion;
        this.tp000001s = tp000001s;
    }

    public String getCodProfesion() {
        return this.codProfesion;
    }

    public void setCodProfesion(String codProfesion) {
        this.codProfesion = codProfesion;
    }

    public String getDesProfesion() {
        return this.desProfesion;
    }

    public void setDesProfesion(String desProfesion) {
        this.desProfesion = desProfesion;
    }

    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
