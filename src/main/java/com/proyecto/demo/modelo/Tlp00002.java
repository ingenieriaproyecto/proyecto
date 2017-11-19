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
@Table(name = "tlp00002", schema = "${schema}")
public class Tlp00002 implements java.io.Serializable {
    @Id
    @NotNull
    private Tlp00002Id id;
    @NotNull
    private Tp000003 tp000003;

    public Tlp00002() {
    }

    public Tlp00002(Tlp00002Id id, Tp000003 tp000003) {
        this.id = id;
        this.tp000003 = tp000003;
    }

    public Tlp00002Id getId() {
        return this.id;
    }

    public void setId(Tlp00002Id id) {
        this.id = id;
    }

    public Tp000003 getTp000003() {
        return this.tp000003;
    }

    public void setTp000003(Tp000003 tp000003) {
        this.tp000003 = tp000003;
    }
}
