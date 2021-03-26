package mz.djm.via.fe.entity.subs;

import mz.djm.via.fe.entity.Criterio;

/**
 * 
 * @author Sergio
 *
 */

public class Criterio03 extends Criterio {
	
	public Criterio03(Double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	private Long numeroAcidente;
	
	public Long getNumeroAcidente() {
		return numeroAcidente;
	}
	
	public void setNumeroAcidente(Long numeroAcidente) {
		this.numeroAcidente = numeroAcidente;
	}
	
	@Override
	public String getCode() {
		return "CT03";
	}
}
