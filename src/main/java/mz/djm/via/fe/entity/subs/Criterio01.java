package mz.djm.via.fe.entity.subs;

import mz.djm.via.fe.entity.Criterio;
import mz.djm.via.fe.entity.IntervencaoType;

/**
 * 
 * @author Sergio
 *
 */
public class Criterio01 extends Criterio {
	
	private IntervencaoType intervecaoCost;
	private Double transitoValue;
	private Double icpValue;


	public IntervencaoType getIntervecaoCost() {
		return intervecaoCost;
	}

	public void setIntervecaoCost(IntervencaoType intervecaoCost) {
		this.intervecaoCost = intervecaoCost;
	}

	public Double getTransitoValue() {
		return transitoValue;
	}

	public void setTransitoValue(Double transitoValue) {
		this.transitoValue = transitoValue;
	}

	public Double getICPValue() {
		return icpValue;
	}

	public void setPciValue(Double pciValue) {
		this.icpValue = pciValue;
	}
	
	
	
	
}
