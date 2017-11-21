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
public class Tp000001Id implements java.io.Serializable {
    @Id
    @NotNull
    private String codEmpresa;
    @Id
    @NotNull
    private String codEmpresaEmp;

    public Tp000001Id() {
    }

    public String getCodEmpresa() {
        return this.codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCodEmpresaEmp() {
        return this.codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }

        if ((other == null)) {
            return false;
        }

        if (!(other instanceof Tp000001Id)) {
            return false;
        }

        Tp000001Id castOther = (Tp000001Id) other;

        return ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa()))) &&
        ((this.getCodEmpresaEmp() == castOther.getCodEmpresaEmp()) ||
        ((this.getCodEmpresaEmp() != null) &&
        (castOther.getCodEmpresaEmp() != null) &&
        this.getCodEmpresaEmp().equals(castOther.getCodEmpresaEmp())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());
        result = (37 * result) +
            ((getCodEmpresaEmp() == null) ? 0 : this.getCodEmpresaEmp()
                                                    .hashCode());

        return result;
    }
}
