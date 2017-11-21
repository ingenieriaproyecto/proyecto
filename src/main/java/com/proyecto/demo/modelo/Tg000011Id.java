package com.proyecto.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.Id;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
public class Tg000011Id implements java.io.Serializable {
    @Id
    @NotNull
    private String codEmpresaEmp;
    @Id
    @NotNull
    private String codEmpresa;

    public Tg000011Id() {
    }

    public String getCodEmpresaEmp() {
        return this.codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
    }

    public String getCodEmpresa() {
        return this.codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }

        if ((other == null)) {
            return false;
        }

        if (!(other instanceof Tg000011Id)) {
            return false;
        }

        Tg000011Id castOther = (Tg000011Id) other;

        return ((this.getCodEmpresaEmp() == castOther.getCodEmpresaEmp()) ||
        ((this.getCodEmpresaEmp() != null) &&
        (castOther.getCodEmpresaEmp() != null) &&
        this.getCodEmpresaEmp().equals(castOther.getCodEmpresaEmp()))) &&
        ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getCodEmpresaEmp() == null) ? 0 : this.getCodEmpresaEmp()
                                                    .hashCode());
        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());

        return result;
    }
}
