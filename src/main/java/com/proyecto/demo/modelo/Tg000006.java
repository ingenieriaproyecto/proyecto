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
@Table(name = "tg000006", schema = "${schema}")
public class Tg000006 implements java.io.Serializable {
    @Id
    @NotNull
    private String codCargo;
    private String desCargo;
    private Set<Tg000003> tg000003s = new HashSet<Tg000003>(0);

    public Tg000006() {
    }

    public Tg000006(String codCargo, String desCargo, Set<Tg000003> tg000003s) {
        this.codCargo = codCargo;
        this.desCargo = desCargo;
        this.tg000003s = tg000003s;
    }

    public String getCodCargo() {
        return this.codCargo;
    }

    public void setCodCargo(String codCargo) {
        this.codCargo = codCargo;
    }

    public String getDesCargo() {
        return this.desCargo;
    }

    public void setDesCargo(String desCargo) {
        this.desCargo = desCargo;
    }

    public Set<Tg000003> getTg000003s() {
        return this.tg000003s;
    }

    public void setTg000003s(Set<Tg000003> tg000003s) {
        this.tg000003s = tg000003s;
    }
}
