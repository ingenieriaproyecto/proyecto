package com.proyecto.demo.modelo;

import org.hibernate.validator.constraints.*;



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
@Table(name = "tg000011", schema = "${schema}")
public class Tg000011 implements java.io.Serializable {
    @Id
    @NotNull
    private Tg000011Id id;
    @NotNull
    private Tp000001 tp000001;
    @NotNull
    private Tg000003 tg000003;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String ativa;
    private String ciudad;
    private String depto;
    private String dirEmpresa;
    private String dvempaf;
    private String emailEmpresa;
    private String faxEmpresa;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitEmpresa;
    private String nomContacto;
    private String nomEmpresa;
    private String telEmpresa;
    private String tipoDocumentoEmpaf;

    public Tg000011() {
    }

    public Tg000011(Tg000011Id id, String ativa, String ciudad, String depto,
        String dirEmpresa, String dvempaf, String emailEmpresa,
        String faxEmpresa, String nitEmpresa, String nomContacto,
        String nomEmpresa, String telEmpresa, Tg000003 tg000003,
        String tipoDocumentoEmpaf, Tp000001 tp000001) {
        this.id = id;
        this.tg000003 = tg000003;
        this.ativa = ativa;
        this.ciudad = ciudad;
        this.depto = depto;
        this.dirEmpresa = dirEmpresa;
        this.dvempaf = dvempaf;
        this.emailEmpresa = emailEmpresa;
        this.faxEmpresa = faxEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.nomContacto = nomContacto;
        this.nomEmpresa = nomEmpresa;
        this.telEmpresa = telEmpresa;
        this.tipoDocumentoEmpaf = tipoDocumentoEmpaf;
    }

    public Tg000011Id getId() {
        return this.id;
    }

    public void setId(Tg000011Id id) {
        this.id = id;
    }

    public Tp000001 getTp000001() {
        return this.tp000001;
    }

    public void setTp000001(Tp000001 tp000001) {
        this.tp000001 = tp000001;
    }

    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    public String getAtiva() {
        return this.ativa;
    }

    public void setAtiva(String ativa) {
        this.ativa = ativa;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepto() {
        return this.depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDirEmpresa() {
        return this.dirEmpresa;
    }

    public void setDirEmpresa(String dirEmpresa) {
        this.dirEmpresa = dirEmpresa;
    }

    public String getDvempaf() {
        return this.dvempaf;
    }

    public void setDvempaf(String dvempaf) {
        this.dvempaf = dvempaf;
    }

    public String getEmailEmpresa() {
        return this.emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getFaxEmpresa() {
        return this.faxEmpresa;
    }

    public void setFaxEmpresa(String faxEmpresa) {
        this.faxEmpresa = faxEmpresa;
    }

    public String getNitEmpresa() {
        return this.nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNomContacto() {
        return this.nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public String getNomEmpresa() {
        return this.nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getTelEmpresa() {
        return this.telEmpresa;
    }

    public void setTelEmpresa(String telEmpresa) {
        this.telEmpresa = telEmpresa;
    }

    public String getTipoDocumentoEmpaf() {
        return this.tipoDocumentoEmpaf;
    }

    public void setTipoDocumentoEmpaf(String tipoDocumentoEmpaf) {
        this.tipoDocumentoEmpaf = tipoDocumentoEmpaf;
    }
}
