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
@Table(name = "tlp00003", schema = "${schema}")
public class Tlp00003 implements java.io.Serializable {
    @Id
    @NotNull
    private Tlp00003Id id;
    @NotNull
    private Tlp00001 tlp00001;
    @NotNull
    @NotEmpty
    @Size(max = 3)
    private String codEmpresaEmp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String ing;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planillaAfp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planillaArp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planillaEps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String ret;

    public Tlp00003() {
    }

    public Tlp00003(Tlp00003Id id, String codEmpresaEmp, String ing,
        String planillaAfp, String planillaArp, String planillaEps, String ret,
        Tlp00001 tlp00001) {
        this.id = id;
        this.codEmpresaEmp = codEmpresaEmp;
        this.ing = ing;
        this.planillaAfp = planillaAfp;
        this.planillaArp = planillaArp;
        this.planillaEps = planillaEps;
        this.ret = ret;
    }

    public Tlp00003Id getId() {
        return this.id;
    }

    public void setId(Tlp00003Id id) {
        this.id = id;
    }

    public Tlp00001 getTlp00001() {
        return this.tlp00001;
    }

    public void setTlp00001(Tlp00001 tlp00001) {
        this.tlp00001 = tlp00001;
    }

    public String getCodEmpresaEmp() {
        return this.codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
    }

    public String getIng() {
        return this.ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getPlanillaAfp() {
        return this.planillaAfp;
    }

    public void setPlanillaAfp(String planillaAfp) {
        this.planillaAfp = planillaAfp;
    }

    public String getPlanillaArp() {
        return this.planillaArp;
    }

    public void setPlanillaArp(String planillaArp) {
        this.planillaArp = planillaArp;
    }

    public String getPlanillaEps() {
        return this.planillaEps;
    }

    public void setPlanillaEps(String planillaEps) {
        this.planillaEps = planillaEps;
    }

    public String getRet() {
        return this.ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }
}
