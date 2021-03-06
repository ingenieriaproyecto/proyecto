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
public class Tlp00001Id implements java.io.Serializable {
    @Id
    @NotNull
    private String numPlanilla;
    @Id
    @NotNull
    private String codEmpresa;

    public Tlp00001Id() {
    }

    public String getNumPlanilla() {
        return this.numPlanilla;
    }

    public void setNumPlanilla(String numPlanilla) {
        this.numPlanilla = numPlanilla;
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

        if (!(other instanceof Tlp00001Id)) {
            return false;
        }

        Tlp00001Id castOther = (Tlp00001Id) other;

        return ((this.getNumPlanilla() == castOther.getNumPlanilla()) ||
        ((this.getNumPlanilla() != null) &&
        (castOther.getNumPlanilla() != null) &&
        this.getNumPlanilla().equals(castOther.getNumPlanilla()))) &&
        ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getNumPlanilla() == null) ? 0 : this.getNumPlanilla().hashCode());
        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());

        return result;
    }
}
