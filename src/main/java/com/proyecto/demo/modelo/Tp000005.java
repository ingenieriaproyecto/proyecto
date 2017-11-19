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
@Table(name = "tp000005", schema = "${schema}")
public class Tp000005 implements java.io.Serializable {
    @Id
    @NotNull
    private String codAfp;
    private String codigoAfp;
    private String direccionAfp;
    private String dvafp;
    private String emailAfp;
    private String faxAfp;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitAfp;
    private String nomContactoAfp;
    private String nombreAfp;
    private String numPerPlaniAfp;
    private String telefonoAfp;
    private String tipoDocumentoAfp;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);
    private Set<Tr000004> tr000004s = new HashSet<Tr000004>(0);

    public Tp000005() {
    }

    public Tp000005(String codAfp, String codigoAfp, String direccionAfp,
        String dvafp, String emailAfp, String faxAfp, String nitAfp,
        String nomContactoAfp, String nombreAfp, String numPerPlaniAfp,
        String telefonoAfp, String tipoDocumentoAfp, Set<Tp000001> tp000001s,
        Set<Tr000004> tr000004s) {
        this.codAfp = codAfp;
        this.codigoAfp = codigoAfp;
        this.direccionAfp = direccionAfp;
        this.dvafp = dvafp;
        this.emailAfp = emailAfp;
        this.faxAfp = faxAfp;
        this.nitAfp = nitAfp;
        this.nomContactoAfp = nomContactoAfp;
        this.nombreAfp = nombreAfp;
        this.numPerPlaniAfp = numPerPlaniAfp;
        this.telefonoAfp = telefonoAfp;
        this.tipoDocumentoAfp = tipoDocumentoAfp;
        this.tp000001s = tp000001s;
        this.tr000004s = tr000004s;
    }

    public String getCodAfp() {
        return this.codAfp;
    }

    public void setCodAfp(String codAfp) {
        this.codAfp = codAfp;
    }

    public String getCodigoAfp() {
        return this.codigoAfp;
    }

    public void setCodigoAfp(String codigoAfp) {
        this.codigoAfp = codigoAfp;
    }

    public String getDireccionAfp() {
        return this.direccionAfp;
    }

    public void setDireccionAfp(String direccionAfp) {
        this.direccionAfp = direccionAfp;
    }

    public String getDvafp() {
        return this.dvafp;
    }

    public void setDvafp(String dvafp) {
        this.dvafp = dvafp;
    }

    public String getEmailAfp() {
        return this.emailAfp;
    }

    public void setEmailAfp(String emailAfp) {
        this.emailAfp = emailAfp;
    }

    public String getFaxAfp() {
        return this.faxAfp;
    }

    public void setFaxAfp(String faxAfp) {
        this.faxAfp = faxAfp;
    }

    public String getNitAfp() {
        return this.nitAfp;
    }

    public void setNitAfp(String nitAfp) {
        this.nitAfp = nitAfp;
    }

    public String getNomContactoAfp() {
        return this.nomContactoAfp;
    }

    public void setNomContactoAfp(String nomContactoAfp) {
        this.nomContactoAfp = nomContactoAfp;
    }

    public String getNombreAfp() {
        return this.nombreAfp;
    }

    public void setNombreAfp(String nombreAfp) {
        this.nombreAfp = nombreAfp;
    }

    public String getNumPerPlaniAfp() {
        return this.numPerPlaniAfp;
    }

    public void setNumPerPlaniAfp(String numPerPlaniAfp) {
        this.numPerPlaniAfp = numPerPlaniAfp;
    }

    public String getTelefonoAfp() {
        return this.telefonoAfp;
    }

    public void setTelefonoAfp(String telefonoAfp) {
        this.telefonoAfp = telefonoAfp;
    }

    public String getTipoDocumentoAfp() {
        return this.tipoDocumentoAfp;
    }

    public void setTipoDocumentoAfp(String tipoDocumentoAfp) {
        this.tipoDocumentoAfp = tipoDocumentoAfp;
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
