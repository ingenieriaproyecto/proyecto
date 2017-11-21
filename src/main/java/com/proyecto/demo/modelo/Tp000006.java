package com.proyecto.demo.modelo;

import org.hibernate.validator.constraints.*;


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
@Table(name = "tp000006", schema = "${schema}")
public class Tp000006 implements java.io.Serializable {
    @Id
    @NotNull
    private String codCaja;
    private String cajaPrincipal;
    private String codDepto;
    @NotNull
    @NotEmpty
    @Size(max = 2)
    private String codEmpresa;
    private String codigoCaja;
    private String direccionCaja;
    private String dvcaja;
    private String emailCaja;
    private String faxCaja;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitCaja;
    private String noPagoCaja;
    private String nomContactoCaja;
    private String nombreCaja;
    private String numPerPlaniCaja;
    private String telefonoCaja;
    private String tipoDocumentoCaja;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);
    private Set<Tr000004> tr000004s = new HashSet<Tr000004>(0);

    public Tp000006() {
    }

    public Tp000006(String codCaja, String cajaPrincipal, String codDepto,
        String codEmpresa, String codigoCaja, String direccionCaja,
        String dvcaja, String emailCaja, String faxCaja, String nitCaja,
        String noPagoCaja, String nomContactoCaja, String nombreCaja,
        String numPerPlaniCaja, String telefonoCaja, String tipoDocumentoCaja,
        Set<Tp000001> tp000001s, Set<Tr000004> tr000004s) {
        this.codCaja = codCaja;
        this.cajaPrincipal = cajaPrincipal;
        this.codDepto = codDepto;
        this.codEmpresa = codEmpresa;
        this.codigoCaja = codigoCaja;
        this.direccionCaja = direccionCaja;
        this.dvcaja = dvcaja;
        this.emailCaja = emailCaja;
        this.faxCaja = faxCaja;
        this.nitCaja = nitCaja;
        this.noPagoCaja = noPagoCaja;
        this.nomContactoCaja = nomContactoCaja;
        this.nombreCaja = nombreCaja;
        this.numPerPlaniCaja = numPerPlaniCaja;
        this.telefonoCaja = telefonoCaja;
        this.tipoDocumentoCaja = tipoDocumentoCaja;
        this.tp000001s = tp000001s;
        this.tr000004s = tr000004s;
    }

    public String getCodCaja() {
        return this.codCaja;
    }

    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }

    public String getCajaPrincipal() {
        return this.cajaPrincipal;
    }

    public void setCajaPrincipal(String cajaPrincipal) {
        this.cajaPrincipal = cajaPrincipal;
    }

    public String getCodDepto() {
        return this.codDepto;
    }

    public void setCodDepto(String codDepto) {
        this.codDepto = codDepto;
    }

    public String getCodEmpresa() {
        return this.codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCodigoCaja() {
        return this.codigoCaja;
    }

    public void setCodigoCaja(String codigoCaja) {
        this.codigoCaja = codigoCaja;
    }

    public String getDireccionCaja() {
        return this.direccionCaja;
    }

    public void setDireccionCaja(String direccionCaja) {
        this.direccionCaja = direccionCaja;
    }

    public String getDvcaja() {
        return this.dvcaja;
    }

    public void setDvcaja(String dvcaja) {
        this.dvcaja = dvcaja;
    }

    public String getEmailCaja() {
        return this.emailCaja;
    }

    public void setEmailCaja(String emailCaja) {
        this.emailCaja = emailCaja;
    }

    public String getFaxCaja() {
        return this.faxCaja;
    }

    public void setFaxCaja(String faxCaja) {
        this.faxCaja = faxCaja;
    }

    public String getNitCaja() {
        return this.nitCaja;
    }

    public void setNitCaja(String nitCaja) {
        this.nitCaja = nitCaja;
    }

    public String getNoPagoCaja() {
        return this.noPagoCaja;
    }

    public void setNoPagoCaja(String noPagoCaja) {
        this.noPagoCaja = noPagoCaja;
    }

    public String getNomContactoCaja() {
        return this.nomContactoCaja;
    }

    public void setNomContactoCaja(String nomContactoCaja) {
        this.nomContactoCaja = nomContactoCaja;
    }

    public String getNombreCaja() {
        return this.nombreCaja;
    }

    public void setNombreCaja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }

    public String getNumPerPlaniCaja() {
        return this.numPerPlaniCaja;
    }

    public void setNumPerPlaniCaja(String numPerPlaniCaja) {
        this.numPerPlaniCaja = numPerPlaniCaja;
    }

    public String getTelefonoCaja() {
        return this.telefonoCaja;
    }

    public void setTelefonoCaja(String telefonoCaja) {
        this.telefonoCaja = telefonoCaja;
    }

    public String getTipoDocumentoCaja() {
        return this.tipoDocumentoCaja;
    }

    public void setTipoDocumentoCaja(String tipoDocumentoCaja) {
        this.tipoDocumentoCaja = tipoDocumentoCaja;
    }

    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }

    public Set<Tr000004> getTr000004s() {
        return this.tr000004s;
    }

    public void setTr000004s(Set<Tr000004> tr000004s) {
        this.tr000004s = tr000004s;
    }
}
