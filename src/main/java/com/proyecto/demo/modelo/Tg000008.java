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
@Table(name = "tg000008", schema = "${schema}")
public class Tg000008 implements java.io.Serializable {
    @Id
    @NotNull
    private Tg000008Id id;
    @NotNull
    private Tg000001 tg000001;
    @NotNull
    private Tg000003 tg000003;
    private Integer chequeActivo;
    private Integer chequeUltimo;
    private Integer chequeprimer;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String consignacionClientes;
    private Integer ncheques;
    @NotNull
    @NotEmpty
    @Size(max = 100)
    private String numcuenta;
    private String tipoCuenta;

    public Tg000008() {
    }

    public Tg000008(Tg000008Id id, Integer chequeActivo, Integer chequeUltimo,
        Integer chequeprimer, String consignacionClientes, Integer ncheques,
        String numcuenta, Tg000001 tg000001, Tg000003 tg000003,
        String tipoCuenta) {
        this.id = id;
        this.tg000001 = tg000001;
        this.tg000003 = tg000003;
        this.chequeActivo = chequeActivo;
        this.chequeUltimo = chequeUltimo;
        this.chequeprimer = chequeprimer;
        this.consignacionClientes = consignacionClientes;
        this.ncheques = ncheques;
        this.numcuenta = numcuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public Tg000008Id getId() {
        return this.id;
    }

    public void setId(Tg000008Id id) {
        this.id = id;
    }

    public Tg000001 getTg000001() {
        return this.tg000001;
    }

    public void setTg000001(Tg000001 tg000001) {
        this.tg000001 = tg000001;
    }

    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    public Integer getChequeActivo() {
        return this.chequeActivo;
    }

    public void setChequeActivo(Integer chequeActivo) {
        this.chequeActivo = chequeActivo;
    }

    public Integer getChequeUltimo() {
        return this.chequeUltimo;
    }

    public void setChequeUltimo(Integer chequeUltimo) {
        this.chequeUltimo = chequeUltimo;
    }

    public Integer getChequeprimer() {
        return this.chequeprimer;
    }

    public void setChequeprimer(Integer chequeprimer) {
        this.chequeprimer = chequeprimer;
    }

    public String getConsignacionClientes() {
        return this.consignacionClientes;
    }

    public void setConsignacionClientes(String consignacionClientes) {
        this.consignacionClientes = consignacionClientes;
    }

    public Integer getNcheques() {
        return this.ncheques;
    }

    public void setNcheques(Integer ncheques) {
        this.ncheques = ncheques;
    }

    public String getNumcuenta() {
        return this.numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
