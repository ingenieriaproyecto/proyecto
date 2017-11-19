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
@Table(name = "tp000003", schema = "${schema}")
public class Tp000003 implements java.io.Serializable {
    @Id
    @NotNull
    private String codEps;
    private String codigoEps;
    private String direccionEps;
    private String dveps;
    private String emailEps;
    private String faxEps;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitEps;
    private String nomContactoEps;
    private String nombreEps;
    private String numPerPlaniEps;
    private String telefonoEps;
    private String tipoDocumentoEps;
    private Set<Tlp00002> tlp00002s = new HashSet<Tlp00002>(0);
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);
    private Set<Tr000004> tr000004s = new HashSet<Tr000004>(0);

    public Tp000003() {
    }

    public Tp000003(String codEps, String codigoEps, String direccionEps,
        String dveps, String emailEps, String faxEps, String nitEps,
        String nomContactoEps, String nombreEps, String numPerPlaniEps,
        String telefonoEps, String tipoDocumentoEps, Set<Tlp00002> tlp00002s,
        Set<Tp000001> tp000001s, Set<Tr000004> tr000004s) {
        this.codEps = codEps;
        this.codigoEps = codigoEps;
        this.direccionEps = direccionEps;
        this.dveps = dveps;
        this.emailEps = emailEps;
        this.faxEps = faxEps;
        this.nitEps = nitEps;
        this.nomContactoEps = nomContactoEps;
        this.nombreEps = nombreEps;
        this.numPerPlaniEps = numPerPlaniEps;
        this.telefonoEps = telefonoEps;
        this.tipoDocumentoEps = tipoDocumentoEps;
        this.tlp00002s = tlp00002s;
        this.tp000001s = tp000001s;
        this.tr000004s = tr000004s;
    }

    public String getCodEps() {
        return this.codEps;
    }

    public void setCodEps(String codEps) {
        this.codEps = codEps;
    }

    public String getCodigoEps() {
        return this.codigoEps;
    }

    public void setCodigoEps(String codigoEps) {
        this.codigoEps = codigoEps;
    }

    public String getDireccionEps() {
        return this.direccionEps;
    }

    public void setDireccionEps(String direccionEps) {
        this.direccionEps = direccionEps;
    }

    public String getDveps() {
        return this.dveps;
    }

    public void setDveps(String dveps) {
        this.dveps = dveps;
    }

    public String getEmailEps() {
        return this.emailEps;
    }

    public void setEmailEps(String emailEps) {
        this.emailEps = emailEps;
    }

    public String getFaxEps() {
        return this.faxEps;
    }

    public void setFaxEps(String faxEps) {
        this.faxEps = faxEps;
    }

    public String getNitEps() {
        return this.nitEps;
    }

    public void setNitEps(String nitEps) {
        this.nitEps = nitEps;
    }

    public String getNomContactoEps() {
        return this.nomContactoEps;
    }

    public void setNomContactoEps(String nomContactoEps) {
        this.nomContactoEps = nomContactoEps;
    }

    public String getNombreEps() {
        return this.nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    public String getNumPerPlaniEps() {
        return this.numPerPlaniEps;
    }

    public void setNumPerPlaniEps(String numPerPlaniEps) {
        this.numPerPlaniEps = numPerPlaniEps;
    }

    public String getTelefonoEps() {
        return this.telefonoEps;
    }

    public void setTelefonoEps(String telefonoEps) {
        this.telefonoEps = telefonoEps;
    }

    public String getTipoDocumentoEps() {
        return this.tipoDocumentoEps;
    }

    public void setTipoDocumentoEps(String tipoDocumentoEps) {
        this.tipoDocumentoEps = tipoDocumentoEps;
    }

    public Set<Tlp00002> getTlp00002s() {
        return this.tlp00002s;
    }

    public void setTlp00002s(Set<Tlp00002> tlp00002s) {
        this.tlp00002s = tlp00002s;
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
