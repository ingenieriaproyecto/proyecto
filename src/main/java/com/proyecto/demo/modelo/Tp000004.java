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
@Table(name = "tp000004", schema = "${schema}")
public class Tp000004 implements java.io.Serializable {
    @Id
    @NotNull
    private String codArp;
    @NotNull
    private Tg000003 tg000003;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String arpactiva;
    private String codigoArp;
    private String direccionArp;
    private String dvarp;
    private String emailArp;
    private String faxArp;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitArp;
    private String nomContactoArp;
    private String nombreArp;
    private String numPerPlaniArp;
    private String telefonoArp;
    private String tipoDocumentoArp;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);
    private Set<Tr000004> tr000004s = new HashSet<Tr000004>(0);

    public Tp000004() {
    }

    public Tp000004(String codArp, String arpactiva, String codigoArp,
        String direccionArp, String dvarp, String emailArp, String faxArp,
        String nitArp, String nomContactoArp, String nombreArp,
        String numPerPlaniArp, String telefonoArp, Tg000003 tg000003,
        String tipoDocumentoArp, Set<Tp000001> tp000001s,
        Set<Tr000004> tr000004s) {
        this.codArp = codArp;
        this.tg000003 = tg000003;
        this.arpactiva = arpactiva;
        this.codigoArp = codigoArp;
        this.direccionArp = direccionArp;
        this.dvarp = dvarp;
        this.emailArp = emailArp;
        this.faxArp = faxArp;
        this.nitArp = nitArp;
        this.nomContactoArp = nomContactoArp;
        this.nombreArp = nombreArp;
        this.numPerPlaniArp = numPerPlaniArp;
        this.telefonoArp = telefonoArp;
        this.tipoDocumentoArp = tipoDocumentoArp;
        this.tp000001s = tp000001s;
        this.tr000004s = tr000004s;
    }

    public String getCodArp() {
        return this.codArp;
    }

    public void setCodArp(String codArp) {
        this.codArp = codArp;
    }

    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    public String getArpactiva() {
        return this.arpactiva;
    }

    public void setArpactiva(String arpactiva) {
        this.arpactiva = arpactiva;
    }

    public String getCodigoArp() {
        return this.codigoArp;
    }

    public void setCodigoArp(String codigoArp) {
        this.codigoArp = codigoArp;
    }

    public String getDireccionArp() {
        return this.direccionArp;
    }

    public void setDireccionArp(String direccionArp) {
        this.direccionArp = direccionArp;
    }

    public String getDvarp() {
        return this.dvarp;
    }

    public void setDvarp(String dvarp) {
        this.dvarp = dvarp;
    }

    public String getEmailArp() {
        return this.emailArp;
    }

    public void setEmailArp(String emailArp) {
        this.emailArp = emailArp;
    }

    public String getFaxArp() {
        return this.faxArp;
    }

    public void setFaxArp(String faxArp) {
        this.faxArp = faxArp;
    }

    public String getNitArp() {
        return this.nitArp;
    }

    public void setNitArp(String nitArp) {
        this.nitArp = nitArp;
    }

    public String getNomContactoArp() {
        return this.nomContactoArp;
    }

    public void setNomContactoArp(String nomContactoArp) {
        this.nomContactoArp = nomContactoArp;
    }

    public String getNombreArp() {
        return this.nombreArp;
    }

    public void setNombreArp(String nombreArp) {
        this.nombreArp = nombreArp;
    }

    public String getNumPerPlaniArp() {
        return this.numPerPlaniArp;
    }

    public void setNumPerPlaniArp(String numPerPlaniArp) {
        this.numPerPlaniArp = numPerPlaniArp;
    }

    public String getTelefonoArp() {
        return this.telefonoArp;
    }

    public void setTelefonoArp(String telefonoArp) {
        this.telefonoArp = telefonoArp;
    }

    public String getTipoDocumentoArp() {
        return this.tipoDocumentoArp;
    }

    public void setTipoDocumentoArp(String tipoDocumentoArp) {
        this.tipoDocumentoArp = tipoDocumentoArp;
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
