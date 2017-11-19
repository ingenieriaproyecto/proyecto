package com.proyecto.demo.modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
* 
*/
@Entity
public class Tlp00002Id implements java.io.Serializable {

			@Id
		@NotNull
		private String numPlanilla;	
    		@Id
		@NotNull
		private String codiEps;	
    		@Id
		@NotNull
		private String codiArp;	
    		@Id
		@NotNull
		private String codiAfp;	
    		@Id
		@NotNull
		private String codiCaja;	
    		@Id
		@NotNull
		private String cotizante;	
    		@Id
		@NotNull
		private String codEmpresaEmp;	
    		@Id
		@NotNull
		private String ciuLaboralCotizante;	
    		@Id
		@NotNull
		private String depLaboralCotizante;	
    		@Id
		@NotNull
		private String tipocotizante;	
    		@Id
		@NotNull
		private String subTipocotizante;	
    		@Id
		@NotNull
		private Integer diasCotizados;	
    		@Id
		@NotNull
		private Integer diasCotizadosArp;	
    		@Id
		@NotNull
		private Integer diasCotizadosAfp;	
    		@Id
		@NotNull
		private Integer diasCotizadosCaja;	
    		@Id
		@NotNull
		private Double salarioBasico;	
    		@Id
		@NotNull
		private String salarioCIntegral;	
    		@Id
		@NotNull
		private String planillaEps;	
    		@Id
		@NotNull
		private String planillaArp;	
    		@Id
		@NotNull
		private String planillaAfp;	
    		@Id
		@NotNull
		private String planillaCaja;	
    		@Id
		@NotNull
		private String numAuincapacidad;	
    		@Id
		@NotNull
		private Double valorIncapacidad;	
    		@Id
		@NotNull
		private String numAulicenciaM;	
    		@Id
		@NotNull
		private Double valorLicenciaM;	
    		@Id
		@NotNull
		private Double valorUpcAdicional;	
    		@Id
		@NotNull
		private Double ingresoBaseCotizacion;	
    		@Id
		@NotNull
		private Double ingresoBaseCotizacionArp;	
    		@Id
		@NotNull
		private Double ingresoBaseCotizacionAfp;	
    		@Id
		@NotNull
		private Double ingresoBaseCotizacionCaja;	
    		@Id
		@NotNull
		private Double ingresoBaseCotizacionSenaIcbf;	
    		@Id
		@NotNull
		private Double cotizaciónObligatoria;	
    		@Id
		@NotNull
		private Double cotizaciónObligatoriaArp;	
    		@Id
		@NotNull
		private String codigoCentroTrabajo;	
    		@Id
		@NotNull
		private Double cotizaciónObligatoriaAfp;	
    		@Id
		@NotNull
		private Double valorFpsolidaridad;	
    		@Id
		@NotNull
		private Double valorFpsubsistencia;	
    		@Id
		@NotNull
		private Integer riesgos;	
    		@Id
		@NotNull
		private Double porcEps;	
    		@Id
		@NotNull
		private Double porcRiesgo;	
    		@Id
		@NotNull
		private Double porcAfp;	
    		@Id
		@NotNull
		private Double porcCaja;	
    		@Id
		@NotNull
		private Double cotizaciónObligatoriaCaja;	
    		@Id
		@NotNull
		private Double porcSena;	
    		@Id
		@NotNull
		private Double cotizaciónObligatoriaSena;	
    		@Id
		@NotNull
		private Double porcIcbf;	
    		@Id
		@NotNull
		private Double cotizaciónObligatoriaIcbf;	
    		@Id
		@NotNull
		private String detaPlanPrimeraEps;	
    		@Id
		@NotNull
		private String detaPlanPrimeraArp;	
    		@Id
		@NotNull
		private String detaPlanPrimeraAfp;	
    		@Id
		@NotNull
		private String detaPlanPrimeraCaja;	
    		@Id
		@NotNull
		private String ing;	
    		@Id
		@NotNull
		private String ret;	
    		@Id
		@NotNull
		private String tde;	
    		@Id
		@NotNull
		private String tae;	
    		@Id
		@NotNull
		private String codiEpsTraslado;	
    		@Id
		@NotNull
		private String tdp;	
    		@Id
		@NotNull
		private String tap;	
    		@Id
		@NotNull
		private String codiAfpTraslado;	
    		@Id
		@NotNull
		private String tda;	
    		@Id
		@NotNull
		private String taa;	
    		@Id
		@NotNull
		private String vsp;	
    		@Id
		@NotNull
		private String vte;	
    		@Id
		@NotNull
		private String vst;	
    		@Id
		@NotNull
		private String sln;	
    		@Id
		@NotNull
		private String ige;	
    		@Id
		@NotNull
		private String lma;	
    		@Id
		@NotNull
		private String vac;	
    		@Id
		@NotNull
		private String avp;	
    		@Id
		@NotNull
		private String vct;	
    		@Id
		@NotNull
		private String irp;	
    		@Id
		@NotNull
		private String codUsuario;	
        
     public Tlp00002Id() {
	}
    
	
			
		public String getNumPlanilla() {
	        return this.numPlanilla;
	    }
	    
	    public void setNumPlanilla(String numPlanilla) {
	        this.numPlanilla = numPlanilla;
	    }
    
    		
		public String getCodiEps() {
	        return this.codiEps;
	    }
	    
	    public void setCodiEps(String codiEps) {
	        this.codiEps = codiEps;
	    }
    
    		
		public String getCodiArp() {
	        return this.codiArp;
	    }
	    
	    public void setCodiArp(String codiArp) {
	        this.codiArp = codiArp;
	    }
    
    		
		public String getCodiAfp() {
	        return this.codiAfp;
	    }
	    
	    public void setCodiAfp(String codiAfp) {
	        this.codiAfp = codiAfp;
	    }
    
    		
		public String getCodiCaja() {
	        return this.codiCaja;
	    }
	    
	    public void setCodiCaja(String codiCaja) {
	        this.codiCaja = codiCaja;
	    }
    
    		
		public String getCotizante() {
	        return this.cotizante;
	    }
	    
	    public void setCotizante(String cotizante) {
	        this.cotizante = cotizante;
	    }
    
    		
		public String getCodEmpresaEmp() {
	        return this.codEmpresaEmp;
	    }
	    
	    public void setCodEmpresaEmp(String codEmpresaEmp) {
	        this.codEmpresaEmp = codEmpresaEmp;
	    }
    
    		
		public String getCiuLaboralCotizante() {
	        return this.ciuLaboralCotizante;
	    }
	    
	    public void setCiuLaboralCotizante(String ciuLaboralCotizante) {
	        this.ciuLaboralCotizante = ciuLaboralCotizante;
	    }
    
    		
		public String getDepLaboralCotizante() {
	        return this.depLaboralCotizante;
	    }
	    
	    public void setDepLaboralCotizante(String depLaboralCotizante) {
	        this.depLaboralCotizante = depLaboralCotizante;
	    }
    
    		
		public String getTipocotizante() {
	        return this.tipocotizante;
	    }
	    
	    public void setTipocotizante(String tipocotizante) {
	        this.tipocotizante = tipocotizante;
	    }
    
    		
		public String getSubTipocotizante() {
	        return this.subTipocotizante;
	    }
	    
	    public void setSubTipocotizante(String subTipocotizante) {
	        this.subTipocotizante = subTipocotizante;
	    }
    
    		
		public Integer getDiasCotizados() {
	        return this.diasCotizados;
	    }
	    
	    public void setDiasCotizados(Integer diasCotizados) {
	        this.diasCotizados = diasCotizados;
	    }
    
    		
		public Integer getDiasCotizadosArp() {
	        return this.diasCotizadosArp;
	    }
	    
	    public void setDiasCotizadosArp(Integer diasCotizadosArp) {
	        this.diasCotizadosArp = diasCotizadosArp;
	    }
    
    		
		public Integer getDiasCotizadosAfp() {
	        return this.diasCotizadosAfp;
	    }
	    
	    public void setDiasCotizadosAfp(Integer diasCotizadosAfp) {
	        this.diasCotizadosAfp = diasCotizadosAfp;
	    }
    
    		
		public Integer getDiasCotizadosCaja() {
	        return this.diasCotizadosCaja;
	    }
	    
	    public void setDiasCotizadosCaja(Integer diasCotizadosCaja) {
	        this.diasCotizadosCaja = diasCotizadosCaja;
	    }
    
    		
		public Double getSalarioBasico() {
	        return this.salarioBasico;
	    }
	    
	    public void setSalarioBasico(Double salarioBasico) {
	        this.salarioBasico = salarioBasico;
	    }
    
    		
		public String getSalarioCIntegral() {
	        return this.salarioCIntegral;
	    }
	    
	    public void setSalarioCIntegral(String salarioCIntegral) {
	        this.salarioCIntegral = salarioCIntegral;
	    }
    
    		
		public String getPlanillaEps() {
	        return this.planillaEps;
	    }
	    
	    public void setPlanillaEps(String planillaEps) {
	        this.planillaEps = planillaEps;
	    }
    
    		
		public String getPlanillaArp() {
	        return this.planillaArp;
	    }
	    
	    public void setPlanillaArp(String planillaArp) {
	        this.planillaArp = planillaArp;
	    }
    
    		
		public String getPlanillaAfp() {
	        return this.planillaAfp;
	    }
	    
	    public void setPlanillaAfp(String planillaAfp) {
	        this.planillaAfp = planillaAfp;
	    }
    
    		
		public String getPlanillaCaja() {
	        return this.planillaCaja;
	    }
	    
	    public void setPlanillaCaja(String planillaCaja) {
	        this.planillaCaja = planillaCaja;
	    }
    
    		
		public String getNumAuincapacidad() {
	        return this.numAuincapacidad;
	    }
	    
	    public void setNumAuincapacidad(String numAuincapacidad) {
	        this.numAuincapacidad = numAuincapacidad;
	    }
    
    		
		public Double getValorIncapacidad() {
	        return this.valorIncapacidad;
	    }
	    
	    public void setValorIncapacidad(Double valorIncapacidad) {
	        this.valorIncapacidad = valorIncapacidad;
	    }
    
    		
		public String getNumAulicenciaM() {
	        return this.numAulicenciaM;
	    }
	    
	    public void setNumAulicenciaM(String numAulicenciaM) {
	        this.numAulicenciaM = numAulicenciaM;
	    }
    
    		
		public Double getValorLicenciaM() {
	        return this.valorLicenciaM;
	    }
	    
	    public void setValorLicenciaM(Double valorLicenciaM) {
	        this.valorLicenciaM = valorLicenciaM;
	    }
    
    		
		public Double getValorUpcAdicional() {
	        return this.valorUpcAdicional;
	    }
	    
	    public void setValorUpcAdicional(Double valorUpcAdicional) {
	        this.valorUpcAdicional = valorUpcAdicional;
	    }
    
    		
		public Double getIngresoBaseCotizacion() {
	        return this.ingresoBaseCotizacion;
	    }
	    
	    public void setIngresoBaseCotizacion(Double ingresoBaseCotizacion) {
	        this.ingresoBaseCotizacion = ingresoBaseCotizacion;
	    }
    
    		
		public Double getIngresoBaseCotizacionArp() {
	        return this.ingresoBaseCotizacionArp;
	    }
	    
	    public void setIngresoBaseCotizacionArp(Double ingresoBaseCotizacionArp) {
	        this.ingresoBaseCotizacionArp = ingresoBaseCotizacionArp;
	    }
    
    		
		public Double getIngresoBaseCotizacionAfp() {
	        return this.ingresoBaseCotizacionAfp;
	    }
	    
	    public void setIngresoBaseCotizacionAfp(Double ingresoBaseCotizacionAfp) {
	        this.ingresoBaseCotizacionAfp = ingresoBaseCotizacionAfp;
	    }
    
    		
		public Double getIngresoBaseCotizacionCaja() {
	        return this.ingresoBaseCotizacionCaja;
	    }
	    
	    public void setIngresoBaseCotizacionCaja(Double ingresoBaseCotizacionCaja) {
	        this.ingresoBaseCotizacionCaja = ingresoBaseCotizacionCaja;
	    }
    
    		
		public Double getIngresoBaseCotizacionSenaIcbf() {
	        return this.ingresoBaseCotizacionSenaIcbf;
	    }
	    
	    public void setIngresoBaseCotizacionSenaIcbf(Double ingresoBaseCotizacionSenaIcbf) {
	        this.ingresoBaseCotizacionSenaIcbf = ingresoBaseCotizacionSenaIcbf;
	    }
    
    		
		public Double getCotizaciónObligatoria() {
	        return this.cotizaciónObligatoria;
	    }
	    
	    public void setCotizaciónObligatoria(Double cotizaciónObligatoria) {
	        this.cotizaciónObligatoria = cotizaciónObligatoria;
	    }
    
    		
		public Double getCotizaciónObligatoriaArp() {
	        return this.cotizaciónObligatoriaArp;
	    }
	    
	    public void setCotizaciónObligatoriaArp(Double cotizaciónObligatoriaArp) {
	        this.cotizaciónObligatoriaArp = cotizaciónObligatoriaArp;
	    }
    
    		
		public String getCodigoCentroTrabajo() {
	        return this.codigoCentroTrabajo;
	    }
	    
	    public void setCodigoCentroTrabajo(String codigoCentroTrabajo) {
	        this.codigoCentroTrabajo = codigoCentroTrabajo;
	    }
    
    		
		public Double getCotizaciónObligatoriaAfp() {
	        return this.cotizaciónObligatoriaAfp;
	    }
	    
	    public void setCotizaciónObligatoriaAfp(Double cotizaciónObligatoriaAfp) {
	        this.cotizaciónObligatoriaAfp = cotizaciónObligatoriaAfp;
	    }
    
    		
		public Double getValorFpsolidaridad() {
	        return this.valorFpsolidaridad;
	    }
	    
	    public void setValorFpsolidaridad(Double valorFpsolidaridad) {
	        this.valorFpsolidaridad = valorFpsolidaridad;
	    }
    
    		
		public Double getValorFpsubsistencia() {
	        return this.valorFpsubsistencia;
	    }
	    
	    public void setValorFpsubsistencia(Double valorFpsubsistencia) {
	        this.valorFpsubsistencia = valorFpsubsistencia;
	    }
    
    		
		public Integer getRiesgos() {
	        return this.riesgos;
	    }
	    
	    public void setRiesgos(Integer riesgos) {
	        this.riesgos = riesgos;
	    }
    
    		
		public Double getPorcEps() {
	        return this.porcEps;
	    }
	    
	    public void setPorcEps(Double porcEps) {
	        this.porcEps = porcEps;
	    }
    
    		
		public Double getPorcRiesgo() {
	        return this.porcRiesgo;
	    }
	    
	    public void setPorcRiesgo(Double porcRiesgo) {
	        this.porcRiesgo = porcRiesgo;
	    }
    
    		
		public Double getPorcAfp() {
	        return this.porcAfp;
	    }
	    
	    public void setPorcAfp(Double porcAfp) {
	        this.porcAfp = porcAfp;
	    }
    
    		
		public Double getPorcCaja() {
	        return this.porcCaja;
	    }
	    
	    public void setPorcCaja(Double porcCaja) {
	        this.porcCaja = porcCaja;
	    }
    
    		
		public Double getCotizaciónObligatoriaCaja() {
	        return this.cotizaciónObligatoriaCaja;
	    }
	    
	    public void setCotizaciónObligatoriaCaja(Double cotizaciónObligatoriaCaja) {
	        this.cotizaciónObligatoriaCaja = cotizaciónObligatoriaCaja;
	    }
    
    		
		public Double getPorcSena() {
	        return this.porcSena;
	    }
	    
	    public void setPorcSena(Double porcSena) {
	        this.porcSena = porcSena;
	    }
    
    		
		public Double getCotizaciónObligatoriaSena() {
	        return this.cotizaciónObligatoriaSena;
	    }
	    
	    public void setCotizaciónObligatoriaSena(Double cotizaciónObligatoriaSena) {
	        this.cotizaciónObligatoriaSena = cotizaciónObligatoriaSena;
	    }
    
    		
		public Double getPorcIcbf() {
	        return this.porcIcbf;
	    }
	    
	    public void setPorcIcbf(Double porcIcbf) {
	        this.porcIcbf = porcIcbf;
	    }
    
    		
		public Double getCotizaciónObligatoriaIcbf() {
	        return this.cotizaciónObligatoriaIcbf;
	    }
	    
	    public void setCotizaciónObligatoriaIcbf(Double cotizaciónObligatoriaIcbf) {
	        this.cotizaciónObligatoriaIcbf = cotizaciónObligatoriaIcbf;
	    }
    
    		
		public String getDetaPlanPrimeraEps() {
	        return this.detaPlanPrimeraEps;
	    }
	    
	    public void setDetaPlanPrimeraEps(String detaPlanPrimeraEps) {
	        this.detaPlanPrimeraEps = detaPlanPrimeraEps;
	    }
    
    		
		public String getDetaPlanPrimeraArp() {
	        return this.detaPlanPrimeraArp;
	    }
	    
	    public void setDetaPlanPrimeraArp(String detaPlanPrimeraArp) {
	        this.detaPlanPrimeraArp = detaPlanPrimeraArp;
	    }
    
    		
		public String getDetaPlanPrimeraAfp() {
	        return this.detaPlanPrimeraAfp;
	    }
	    
	    public void setDetaPlanPrimeraAfp(String detaPlanPrimeraAfp) {
	        this.detaPlanPrimeraAfp = detaPlanPrimeraAfp;
	    }
    
    		
		public String getDetaPlanPrimeraCaja() {
	        return this.detaPlanPrimeraCaja;
	    }
	    
	    public void setDetaPlanPrimeraCaja(String detaPlanPrimeraCaja) {
	        this.detaPlanPrimeraCaja = detaPlanPrimeraCaja;
	    }
    
    		
		public String getIng() {
	        return this.ing;
	    }
	    
	    public void setIng(String ing) {
	        this.ing = ing;
	    }
    
    		
		public String getRet() {
	        return this.ret;
	    }
	    
	    public void setRet(String ret) {
	        this.ret = ret;
	    }
    
    		
		public String getTde() {
	        return this.tde;
	    }
	    
	    public void setTde(String tde) {
	        this.tde = tde;
	    }
    
    		
		public String getTae() {
	        return this.tae;
	    }
	    
	    public void setTae(String tae) {
	        this.tae = tae;
	    }
    
    		
		public String getCodiEpsTraslado() {
	        return this.codiEpsTraslado;
	    }
	    
	    public void setCodiEpsTraslado(String codiEpsTraslado) {
	        this.codiEpsTraslado = codiEpsTraslado;
	    }
    
    		
		public String getTdp() {
	        return this.tdp;
	    }
	    
	    public void setTdp(String tdp) {
	        this.tdp = tdp;
	    }
    
    		
		public String getTap() {
	        return this.tap;
	    }
	    
	    public void setTap(String tap) {
	        this.tap = tap;
	    }
    
    		
		public String getCodiAfpTraslado() {
	        return this.codiAfpTraslado;
	    }
	    
	    public void setCodiAfpTraslado(String codiAfpTraslado) {
	        this.codiAfpTraslado = codiAfpTraslado;
	    }
    
    		
		public String getTda() {
	        return this.tda;
	    }
	    
	    public void setTda(String tda) {
	        this.tda = tda;
	    }
    
    		
		public String getTaa() {
	        return this.taa;
	    }
	    
	    public void setTaa(String taa) {
	        this.taa = taa;
	    }
    
    		
		public String getVsp() {
	        return this.vsp;
	    }
	    
	    public void setVsp(String vsp) {
	        this.vsp = vsp;
	    }
    
    		
		public String getVte() {
	        return this.vte;
	    }
	    
	    public void setVte(String vte) {
	        this.vte = vte;
	    }
    
    		
		public String getVst() {
	        return this.vst;
	    }
	    
	    public void setVst(String vst) {
	        this.vst = vst;
	    }
    
    		
		public String getSln() {
	        return this.sln;
	    }
	    
	    public void setSln(String sln) {
	        this.sln = sln;
	    }
    
    		
		public String getIge() {
	        return this.ige;
	    }
	    
	    public void setIge(String ige) {
	        this.ige = ige;
	    }
    
    		
		public String getLma() {
	        return this.lma;
	    }
	    
	    public void setLma(String lma) {
	        this.lma = lma;
	    }
    
    		
		public String getVac() {
	        return this.vac;
	    }
	    
	    public void setVac(String vac) {
	        this.vac = vac;
	    }
    
    		
		public String getAvp() {
	        return this.avp;
	    }
	    
	    public void setAvp(String avp) {
	        this.avp = avp;
	    }
    
    		
		public String getVct() {
	        return this.vct;
	    }
	    
	    public void setVct(String vct) {
	        this.vct = vct;
	    }
    
    		
		public String getIrp() {
	        return this.irp;
	    }
	    
	    public void setIrp(String irp) {
	        this.irp = irp;
	    }
    
    		
		public String getCodUsuario() {
	        return this.codUsuario;
	    }
	    
	    public void setCodUsuario(String codUsuario) {
	        this.codUsuario = codUsuario;
	    }
    
        
    public boolean equals(Object other){
    	if ( (this == other) ) return true;
    	if ( (other == null) ) return false;
    	if ( !(other instanceof Tlp00002Id) ) return false;
 		Tlp00002Id castOther = ( Tlp00002Id ) other;
 		
 		return (  (this.getNumPlanilla() == castOther.getNumPlanilla()) || ( this.getNumPlanilla()!=null && castOther.getNumPlanilla()!=null && this.getNumPlanilla().equals(castOther.getNumPlanilla()) ) )  		 && (    (this.getCodiEps() == castOther.getCodiEps()) || ( this.getCodiEps()!=null && castOther.getCodiEps()!=null && this.getCodiEps().equals(castOther.getCodiEps()) ) )  		 && (    (this.getCodiArp() == castOther.getCodiArp()) || ( this.getCodiArp()!=null && castOther.getCodiArp()!=null && this.getCodiArp().equals(castOther.getCodiArp()) ) )  		 && (    (this.getCodiAfp() == castOther.getCodiAfp()) || ( this.getCodiAfp()!=null && castOther.getCodiAfp()!=null && this.getCodiAfp().equals(castOther.getCodiAfp()) ) )  		 && (    (this.getCodiCaja() == castOther.getCodiCaja()) || ( this.getCodiCaja()!=null && castOther.getCodiCaja()!=null && this.getCodiCaja().equals(castOther.getCodiCaja()) ) )  		 && (    (this.getCotizante() == castOther.getCotizante()) || ( this.getCotizante()!=null && castOther.getCotizante()!=null && this.getCotizante().equals(castOther.getCotizante()) ) )  		 && (    (this.getCodEmpresaEmp() == castOther.getCodEmpresaEmp()) || ( this.getCodEmpresaEmp()!=null && castOther.getCodEmpresaEmp()!=null && this.getCodEmpresaEmp().equals(castOther.getCodEmpresaEmp()) ) )  		 && (    (this.getCiuLaboralCotizante() == castOther.getCiuLaboralCotizante()) || ( this.getCiuLaboralCotizante()!=null && castOther.getCiuLaboralCotizante()!=null && this.getCiuLaboralCotizante().equals(castOther.getCiuLaboralCotizante()) ) )  		 && (    (this.getDepLaboralCotizante() == castOther.getDepLaboralCotizante()) || ( this.getDepLaboralCotizante()!=null && castOther.getDepLaboralCotizante()!=null && this.getDepLaboralCotizante().equals(castOther.getDepLaboralCotizante()) ) )  		 && (    (this.getTipocotizante() == castOther.getTipocotizante()) || ( this.getTipocotizante()!=null && castOther.getTipocotizante()!=null && this.getTipocotizante().equals(castOther.getTipocotizante()) ) )  		 && (    (this.getSubTipocotizante() == castOther.getSubTipocotizante()) || ( this.getSubTipocotizante()!=null && castOther.getSubTipocotizante()!=null && this.getSubTipocotizante().equals(castOther.getSubTipocotizante()) ) )  		 && (    (this.getDiasCotizados() == castOther.getDiasCotizados()) || ( this.getDiasCotizados()!=null && castOther.getDiasCotizados()!=null && this.getDiasCotizados().equals(castOther.getDiasCotizados()) ) )  		 && (    (this.getDiasCotizadosArp() == castOther.getDiasCotizadosArp()) || ( this.getDiasCotizadosArp()!=null && castOther.getDiasCotizadosArp()!=null && this.getDiasCotizadosArp().equals(castOther.getDiasCotizadosArp()) ) )  		 && (    (this.getDiasCotizadosAfp() == castOther.getDiasCotizadosAfp()) || ( this.getDiasCotizadosAfp()!=null && castOther.getDiasCotizadosAfp()!=null && this.getDiasCotizadosAfp().equals(castOther.getDiasCotizadosAfp()) ) )  		 && (    (this.getDiasCotizadosCaja() == castOther.getDiasCotizadosCaja()) || ( this.getDiasCotizadosCaja()!=null && castOther.getDiasCotizadosCaja()!=null && this.getDiasCotizadosCaja().equals(castOther.getDiasCotizadosCaja()) ) )  		 && (    (this.getSalarioBasico() == castOther.getSalarioBasico()) || ( this.getSalarioBasico()!=null && castOther.getSalarioBasico()!=null && this.getSalarioBasico().equals(castOther.getSalarioBasico()) ) )  		 && (    (this.getSalarioCIntegral() == castOther.getSalarioCIntegral()) || ( this.getSalarioCIntegral()!=null && castOther.getSalarioCIntegral()!=null && this.getSalarioCIntegral().equals(castOther.getSalarioCIntegral()) ) )  		 && (    (this.getPlanillaEps() == castOther.getPlanillaEps()) || ( this.getPlanillaEps()!=null && castOther.getPlanillaEps()!=null && this.getPlanillaEps().equals(castOther.getPlanillaEps()) ) )  		 && (    (this.getPlanillaArp() == castOther.getPlanillaArp()) || ( this.getPlanillaArp()!=null && castOther.getPlanillaArp()!=null && this.getPlanillaArp().equals(castOther.getPlanillaArp()) ) )  		 && (    (this.getPlanillaAfp() == castOther.getPlanillaAfp()) || ( this.getPlanillaAfp()!=null && castOther.getPlanillaAfp()!=null && this.getPlanillaAfp().equals(castOther.getPlanillaAfp()) ) )  		 && (    (this.getPlanillaCaja() == castOther.getPlanillaCaja()) || ( this.getPlanillaCaja()!=null && castOther.getPlanillaCaja()!=null && this.getPlanillaCaja().equals(castOther.getPlanillaCaja()) ) )  		 && (    (this.getNumAuincapacidad() == castOther.getNumAuincapacidad()) || ( this.getNumAuincapacidad()!=null && castOther.getNumAuincapacidad()!=null && this.getNumAuincapacidad().equals(castOther.getNumAuincapacidad()) ) )  		 && (    (this.getValorIncapacidad() == castOther.getValorIncapacidad()) || ( this.getValorIncapacidad()!=null && castOther.getValorIncapacidad()!=null && this.getValorIncapacidad().equals(castOther.getValorIncapacidad()) ) )  		 && (    (this.getNumAulicenciaM() == castOther.getNumAulicenciaM()) || ( this.getNumAulicenciaM()!=null && castOther.getNumAulicenciaM()!=null && this.getNumAulicenciaM().equals(castOther.getNumAulicenciaM()) ) )  		 && (    (this.getValorLicenciaM() == castOther.getValorLicenciaM()) || ( this.getValorLicenciaM()!=null && castOther.getValorLicenciaM()!=null && this.getValorLicenciaM().equals(castOther.getValorLicenciaM()) ) )  		 && (    (this.getValorUpcAdicional() == castOther.getValorUpcAdicional()) || ( this.getValorUpcAdicional()!=null && castOther.getValorUpcAdicional()!=null && this.getValorUpcAdicional().equals(castOther.getValorUpcAdicional()) ) )  		 && (    (this.getIngresoBaseCotizacion() == castOther.getIngresoBaseCotizacion()) || ( this.getIngresoBaseCotizacion()!=null && castOther.getIngresoBaseCotizacion()!=null && this.getIngresoBaseCotizacion().equals(castOther.getIngresoBaseCotizacion()) ) )  		 && (    (this.getIngresoBaseCotizacionArp() == castOther.getIngresoBaseCotizacionArp()) || ( this.getIngresoBaseCotizacionArp()!=null && castOther.getIngresoBaseCotizacionArp()!=null && this.getIngresoBaseCotizacionArp().equals(castOther.getIngresoBaseCotizacionArp()) ) )  		 && (    (this.getIngresoBaseCotizacionAfp() == castOther.getIngresoBaseCotizacionAfp()) || ( this.getIngresoBaseCotizacionAfp()!=null && castOther.getIngresoBaseCotizacionAfp()!=null && this.getIngresoBaseCotizacionAfp().equals(castOther.getIngresoBaseCotizacionAfp()) ) )  		 && (    (this.getIngresoBaseCotizacionCaja() == castOther.getIngresoBaseCotizacionCaja()) || ( this.getIngresoBaseCotizacionCaja()!=null && castOther.getIngresoBaseCotizacionCaja()!=null && this.getIngresoBaseCotizacionCaja().equals(castOther.getIngresoBaseCotizacionCaja()) ) )  		 && (    (this.getIngresoBaseCotizacionSenaIcbf() == castOther.getIngresoBaseCotizacionSenaIcbf()) || ( this.getIngresoBaseCotizacionSenaIcbf()!=null && castOther.getIngresoBaseCotizacionSenaIcbf()!=null && this.getIngresoBaseCotizacionSenaIcbf().equals(castOther.getIngresoBaseCotizacionSenaIcbf()) ) )  		 && (    (this.getCotizaciónObligatoria() == castOther.getCotizaciónObligatoria()) || ( this.getCotizaciónObligatoria()!=null && castOther.getCotizaciónObligatoria()!=null && this.getCotizaciónObligatoria().equals(castOther.getCotizaciónObligatoria()) ) )  		 && (    (this.getCotizaciónObligatoriaArp() == castOther.getCotizaciónObligatoriaArp()) || ( this.getCotizaciónObligatoriaArp()!=null && castOther.getCotizaciónObligatoriaArp()!=null && this.getCotizaciónObligatoriaArp().equals(castOther.getCotizaciónObligatoriaArp()) ) )  		 && (    (this.getCodigoCentroTrabajo() == castOther.getCodigoCentroTrabajo()) || ( this.getCodigoCentroTrabajo()!=null && castOther.getCodigoCentroTrabajo()!=null && this.getCodigoCentroTrabajo().equals(castOther.getCodigoCentroTrabajo()) ) )  		 && (    (this.getCotizaciónObligatoriaAfp() == castOther.getCotizaciónObligatoriaAfp()) || ( this.getCotizaciónObligatoriaAfp()!=null && castOther.getCotizaciónObligatoriaAfp()!=null && this.getCotizaciónObligatoriaAfp().equals(castOther.getCotizaciónObligatoriaAfp()) ) )  		 && (    (this.getValorFpsolidaridad() == castOther.getValorFpsolidaridad()) || ( this.getValorFpsolidaridad()!=null && castOther.getValorFpsolidaridad()!=null && this.getValorFpsolidaridad().equals(castOther.getValorFpsolidaridad()) ) )  		 && (    (this.getValorFpsubsistencia() == castOther.getValorFpsubsistencia()) || ( this.getValorFpsubsistencia()!=null && castOther.getValorFpsubsistencia()!=null && this.getValorFpsubsistencia().equals(castOther.getValorFpsubsistencia()) ) )  		 && (    (this.getRiesgos() == castOther.getRiesgos()) || ( this.getRiesgos()!=null && castOther.getRiesgos()!=null && this.getRiesgos().equals(castOther.getRiesgos()) ) )  		 && (    (this.getPorcEps() == castOther.getPorcEps()) || ( this.getPorcEps()!=null && castOther.getPorcEps()!=null && this.getPorcEps().equals(castOther.getPorcEps()) ) )  		 && (    (this.getPorcRiesgo() == castOther.getPorcRiesgo()) || ( this.getPorcRiesgo()!=null && castOther.getPorcRiesgo()!=null && this.getPorcRiesgo().equals(castOther.getPorcRiesgo()) ) )  		 && (    (this.getPorcAfp() == castOther.getPorcAfp()) || ( this.getPorcAfp()!=null && castOther.getPorcAfp()!=null && this.getPorcAfp().equals(castOther.getPorcAfp()) ) )  		 && (    (this.getPorcCaja() == castOther.getPorcCaja()) || ( this.getPorcCaja()!=null && castOther.getPorcCaja()!=null && this.getPorcCaja().equals(castOther.getPorcCaja()) ) )  		 && (    (this.getCotizaciónObligatoriaCaja() == castOther.getCotizaciónObligatoriaCaja()) || ( this.getCotizaciónObligatoriaCaja()!=null && castOther.getCotizaciónObligatoriaCaja()!=null && this.getCotizaciónObligatoriaCaja().equals(castOther.getCotizaciónObligatoriaCaja()) ) )  		 && (    (this.getPorcSena() == castOther.getPorcSena()) || ( this.getPorcSena()!=null && castOther.getPorcSena()!=null && this.getPorcSena().equals(castOther.getPorcSena()) ) )  		 && (    (this.getCotizaciónObligatoriaSena() == castOther.getCotizaciónObligatoriaSena()) || ( this.getCotizaciónObligatoriaSena()!=null && castOther.getCotizaciónObligatoriaSena()!=null && this.getCotizaciónObligatoriaSena().equals(castOther.getCotizaciónObligatoriaSena()) ) )  		 && (    (this.getPorcIcbf() == castOther.getPorcIcbf()) || ( this.getPorcIcbf()!=null && castOther.getPorcIcbf()!=null && this.getPorcIcbf().equals(castOther.getPorcIcbf()) ) )  		 && (    (this.getCotizaciónObligatoriaIcbf() == castOther.getCotizaciónObligatoriaIcbf()) || ( this.getCotizaciónObligatoriaIcbf()!=null && castOther.getCotizaciónObligatoriaIcbf()!=null && this.getCotizaciónObligatoriaIcbf().equals(castOther.getCotizaciónObligatoriaIcbf()) ) )  		 && (    (this.getDetaPlanPrimeraEps() == castOther.getDetaPlanPrimeraEps()) || ( this.getDetaPlanPrimeraEps()!=null && castOther.getDetaPlanPrimeraEps()!=null && this.getDetaPlanPrimeraEps().equals(castOther.getDetaPlanPrimeraEps()) ) )  		 && (    (this.getDetaPlanPrimeraArp() == castOther.getDetaPlanPrimeraArp()) || ( this.getDetaPlanPrimeraArp()!=null && castOther.getDetaPlanPrimeraArp()!=null && this.getDetaPlanPrimeraArp().equals(castOther.getDetaPlanPrimeraArp()) ) )  		 && (    (this.getDetaPlanPrimeraAfp() == castOther.getDetaPlanPrimeraAfp()) || ( this.getDetaPlanPrimeraAfp()!=null && castOther.getDetaPlanPrimeraAfp()!=null && this.getDetaPlanPrimeraAfp().equals(castOther.getDetaPlanPrimeraAfp()) ) )  		 && (    (this.getDetaPlanPrimeraCaja() == castOther.getDetaPlanPrimeraCaja()) || ( this.getDetaPlanPrimeraCaja()!=null && castOther.getDetaPlanPrimeraCaja()!=null && this.getDetaPlanPrimeraCaja().equals(castOther.getDetaPlanPrimeraCaja()) ) )  		 && (    (this.getIng() == castOther.getIng()) || ( this.getIng()!=null && castOther.getIng()!=null && this.getIng().equals(castOther.getIng()) ) )  		 && (    (this.getRet() == castOther.getRet()) || ( this.getRet()!=null && castOther.getRet()!=null && this.getRet().equals(castOther.getRet()) ) )  		 && (    (this.getTde() == castOther.getTde()) || ( this.getTde()!=null && castOther.getTde()!=null && this.getTde().equals(castOther.getTde()) ) )  		 && (    (this.getTae() == castOther.getTae()) || ( this.getTae()!=null && castOther.getTae()!=null && this.getTae().equals(castOther.getTae()) ) )  		 && (    (this.getCodiEpsTraslado() == castOther.getCodiEpsTraslado()) || ( this.getCodiEpsTraslado()!=null && castOther.getCodiEpsTraslado()!=null && this.getCodiEpsTraslado().equals(castOther.getCodiEpsTraslado()) ) )  		 && (    (this.getTdp() == castOther.getTdp()) || ( this.getTdp()!=null && castOther.getTdp()!=null && this.getTdp().equals(castOther.getTdp()) ) )  		 && (    (this.getTap() == castOther.getTap()) || ( this.getTap()!=null && castOther.getTap()!=null && this.getTap().equals(castOther.getTap()) ) )  		 && (    (this.getCodiAfpTraslado() == castOther.getCodiAfpTraslado()) || ( this.getCodiAfpTraslado()!=null && castOther.getCodiAfpTraslado()!=null && this.getCodiAfpTraslado().equals(castOther.getCodiAfpTraslado()) ) )  		 && (    (this.getTda() == castOther.getTda()) || ( this.getTda()!=null && castOther.getTda()!=null && this.getTda().equals(castOther.getTda()) ) )  		 && (    (this.getTaa() == castOther.getTaa()) || ( this.getTaa()!=null && castOther.getTaa()!=null && this.getTaa().equals(castOther.getTaa()) ) )  		 && (    (this.getVsp() == castOther.getVsp()) || ( this.getVsp()!=null && castOther.getVsp()!=null && this.getVsp().equals(castOther.getVsp()) ) )  		 && (    (this.getVte() == castOther.getVte()) || ( this.getVte()!=null && castOther.getVte()!=null && this.getVte().equals(castOther.getVte()) ) )  		 && (    (this.getVst() == castOther.getVst()) || ( this.getVst()!=null && castOther.getVst()!=null && this.getVst().equals(castOther.getVst()) ) )  		 && (    (this.getSln() == castOther.getSln()) || ( this.getSln()!=null && castOther.getSln()!=null && this.getSln().equals(castOther.getSln()) ) )  		 && (    (this.getIge() == castOther.getIge()) || ( this.getIge()!=null && castOther.getIge()!=null && this.getIge().equals(castOther.getIge()) ) )  		 && (    (this.getLma() == castOther.getLma()) || ( this.getLma()!=null && castOther.getLma()!=null && this.getLma().equals(castOther.getLma()) ) )  		 && (    (this.getVac() == castOther.getVac()) || ( this.getVac()!=null && castOther.getVac()!=null && this.getVac().equals(castOther.getVac()) ) )  		 && (    (this.getAvp() == castOther.getAvp()) || ( this.getAvp()!=null && castOther.getAvp()!=null && this.getAvp().equals(castOther.getAvp()) ) )  		 && (    (this.getVct() == castOther.getVct()) || ( this.getVct()!=null && castOther.getVct()!=null && this.getVct().equals(castOther.getVct()) ) )  		 && (    (this.getIrp() == castOther.getIrp()) || ( this.getIrp()!=null && castOther.getIrp()!=null && this.getIrp().equals(castOther.getIrp()) ) )  		 && (    (this.getCodUsuario() == castOther.getCodUsuario()) || ( this.getCodUsuario()!=null && castOther.getCodUsuario()!=null && this.getCodUsuario().equals(castOther.getCodUsuario()) ) )   ;
    }
    
    public int hashCode() {
         int result = 17;
         
         			 result = 37 * result + ( getNumPlanilla() == null ? 0 : this.getNumPlanilla().hashCode() );	
	     			 result = 37 * result + ( getCodiEps() == null ? 0 : this.getCodiEps().hashCode() );	
	     			 result = 37 * result + ( getCodiArp() == null ? 0 : this.getCodiArp().hashCode() );	
	     			 result = 37 * result + ( getCodiAfp() == null ? 0 : this.getCodiAfp().hashCode() );	
	     			 result = 37 * result + ( getCodiCaja() == null ? 0 : this.getCodiCaja().hashCode() );	
	     			 result = 37 * result + ( getCotizante() == null ? 0 : this.getCotizante().hashCode() );	
	     			 result = 37 * result + ( getCodEmpresaEmp() == null ? 0 : this.getCodEmpresaEmp().hashCode() );	
	     			 result = 37 * result + ( getCiuLaboralCotizante() == null ? 0 : this.getCiuLaboralCotizante().hashCode() );	
	     			 result = 37 * result + ( getDepLaboralCotizante() == null ? 0 : this.getDepLaboralCotizante().hashCode() );	
	     			 result = 37 * result + ( getTipocotizante() == null ? 0 : this.getTipocotizante().hashCode() );	
	     			 result = 37 * result + ( getSubTipocotizante() == null ? 0 : this.getSubTipocotizante().hashCode() );	
	     			 result = 37 * result + ( getDiasCotizados() == null ? 0 : this.getDiasCotizados().hashCode() );	
	     			 result = 37 * result + ( getDiasCotizadosArp() == null ? 0 : this.getDiasCotizadosArp().hashCode() );	
	     			 result = 37 * result + ( getDiasCotizadosAfp() == null ? 0 : this.getDiasCotizadosAfp().hashCode() );	
	     			 result = 37 * result + ( getDiasCotizadosCaja() == null ? 0 : this.getDiasCotizadosCaja().hashCode() );	
	     			 result = 37 * result + ( getSalarioBasico() == null ? 0 : this.getSalarioBasico().hashCode() );	
	     			 result = 37 * result + ( getSalarioCIntegral() == null ? 0 : this.getSalarioCIntegral().hashCode() );	
	     			 result = 37 * result + ( getPlanillaEps() == null ? 0 : this.getPlanillaEps().hashCode() );	
	     			 result = 37 * result + ( getPlanillaArp() == null ? 0 : this.getPlanillaArp().hashCode() );	
	     			 result = 37 * result + ( getPlanillaAfp() == null ? 0 : this.getPlanillaAfp().hashCode() );	
	     			 result = 37 * result + ( getPlanillaCaja() == null ? 0 : this.getPlanillaCaja().hashCode() );	
	     			 result = 37 * result + ( getNumAuincapacidad() == null ? 0 : this.getNumAuincapacidad().hashCode() );	
	     			 result = 37 * result + ( getValorIncapacidad() == null ? 0 : this.getValorIncapacidad().hashCode() );	
	     			 result = 37 * result + ( getNumAulicenciaM() == null ? 0 : this.getNumAulicenciaM().hashCode() );	
	     			 result = 37 * result + ( getValorLicenciaM() == null ? 0 : this.getValorLicenciaM().hashCode() );	
	     			 result = 37 * result + ( getValorUpcAdicional() == null ? 0 : this.getValorUpcAdicional().hashCode() );	
	     			 result = 37 * result + ( getIngresoBaseCotizacion() == null ? 0 : this.getIngresoBaseCotizacion().hashCode() );	
	     			 result = 37 * result + ( getIngresoBaseCotizacionArp() == null ? 0 : this.getIngresoBaseCotizacionArp().hashCode() );	
	     			 result = 37 * result + ( getIngresoBaseCotizacionAfp() == null ? 0 : this.getIngresoBaseCotizacionAfp().hashCode() );	
	     			 result = 37 * result + ( getIngresoBaseCotizacionCaja() == null ? 0 : this.getIngresoBaseCotizacionCaja().hashCode() );	
	     			 result = 37 * result + ( getIngresoBaseCotizacionSenaIcbf() == null ? 0 : this.getIngresoBaseCotizacionSenaIcbf().hashCode() );	
	     			 result = 37 * result + ( getCotizaciónObligatoria() == null ? 0 : this.getCotizaciónObligatoria().hashCode() );	
	     			 result = 37 * result + ( getCotizaciónObligatoriaArp() == null ? 0 : this.getCotizaciónObligatoriaArp().hashCode() );	
	     			 result = 37 * result + ( getCodigoCentroTrabajo() == null ? 0 : this.getCodigoCentroTrabajo().hashCode() );	
	     			 result = 37 * result + ( getCotizaciónObligatoriaAfp() == null ? 0 : this.getCotizaciónObligatoriaAfp().hashCode() );	
	     			 result = 37 * result + ( getValorFpsolidaridad() == null ? 0 : this.getValorFpsolidaridad().hashCode() );	
	     			 result = 37 * result + ( getValorFpsubsistencia() == null ? 0 : this.getValorFpsubsistencia().hashCode() );	
	     			 result = 37 * result + ( getRiesgos() == null ? 0 : this.getRiesgos().hashCode() );	
	     			 result = 37 * result + ( getPorcEps() == null ? 0 : this.getPorcEps().hashCode() );	
	     			 result = 37 * result + ( getPorcRiesgo() == null ? 0 : this.getPorcRiesgo().hashCode() );	
	     			 result = 37 * result + ( getPorcAfp() == null ? 0 : this.getPorcAfp().hashCode() );	
	     			 result = 37 * result + ( getPorcCaja() == null ? 0 : this.getPorcCaja().hashCode() );	
	     			 result = 37 * result + ( getCotizaciónObligatoriaCaja() == null ? 0 : this.getCotizaciónObligatoriaCaja().hashCode() );	
	     			 result = 37 * result + ( getPorcSena() == null ? 0 : this.getPorcSena().hashCode() );	
	     			 result = 37 * result + ( getCotizaciónObligatoriaSena() == null ? 0 : this.getCotizaciónObligatoriaSena().hashCode() );	
	     			 result = 37 * result + ( getPorcIcbf() == null ? 0 : this.getPorcIcbf().hashCode() );	
	     			 result = 37 * result + ( getCotizaciónObligatoriaIcbf() == null ? 0 : this.getCotizaciónObligatoriaIcbf().hashCode() );	
	     			 result = 37 * result + ( getDetaPlanPrimeraEps() == null ? 0 : this.getDetaPlanPrimeraEps().hashCode() );	
	     			 result = 37 * result + ( getDetaPlanPrimeraArp() == null ? 0 : this.getDetaPlanPrimeraArp().hashCode() );	
	     			 result = 37 * result + ( getDetaPlanPrimeraAfp() == null ? 0 : this.getDetaPlanPrimeraAfp().hashCode() );	
	     			 result = 37 * result + ( getDetaPlanPrimeraCaja() == null ? 0 : this.getDetaPlanPrimeraCaja().hashCode() );	
	     			 result = 37 * result + ( getIng() == null ? 0 : this.getIng().hashCode() );	
	     			 result = 37 * result + ( getRet() == null ? 0 : this.getRet().hashCode() );	
	     			 result = 37 * result + ( getTde() == null ? 0 : this.getTde().hashCode() );	
	     			 result = 37 * result + ( getTae() == null ? 0 : this.getTae().hashCode() );	
	     			 result = 37 * result + ( getCodiEpsTraslado() == null ? 0 : this.getCodiEpsTraslado().hashCode() );	
	     			 result = 37 * result + ( getTdp() == null ? 0 : this.getTdp().hashCode() );	
	     			 result = 37 * result + ( getTap() == null ? 0 : this.getTap().hashCode() );	
	     			 result = 37 * result + ( getCodiAfpTraslado() == null ? 0 : this.getCodiAfpTraslado().hashCode() );	
	     			 result = 37 * result + ( getTda() == null ? 0 : this.getTda().hashCode() );	
	     			 result = 37 * result + ( getTaa() == null ? 0 : this.getTaa().hashCode() );	
	     			 result = 37 * result + ( getVsp() == null ? 0 : this.getVsp().hashCode() );	
	     			 result = 37 * result + ( getVte() == null ? 0 : this.getVte().hashCode() );	
	     			 result = 37 * result + ( getVst() == null ? 0 : this.getVst().hashCode() );	
	     			 result = 37 * result + ( getSln() == null ? 0 : this.getSln().hashCode() );	
	     			 result = 37 * result + ( getIge() == null ? 0 : this.getIge().hashCode() );	
	     			 result = 37 * result + ( getLma() == null ? 0 : this.getLma().hashCode() );	
	     			 result = 37 * result + ( getVac() == null ? 0 : this.getVac().hashCode() );	
	     			 result = 37 * result + ( getAvp() == null ? 0 : this.getAvp().hashCode() );	
	     			 result = 37 * result + ( getVct() == null ? 0 : this.getVct().hashCode() );	
	     			 result = 37 * result + ( getIrp() == null ? 0 : this.getIrp().hashCode() );	
	     			 result = 37 * result + ( getCodUsuario() == null ? 0 : this.getCodUsuario().hashCode() );	
	              
         return result;
   } 
    
}