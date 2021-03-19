package mz.djm.via.fe.entity.subs;

import mz.djm.via.fe.entity.Criterio;
import mz.djm.via.fe.entity.IntervencaoType;

/**
 * 
 * @author Sergio
 *
 */
public class Criterio01 extends Criterio {
	
	private Double intervencaoCustoValue;
	private Double transitoValue;
	private Double icpValue;


	public Double getIntervecaoCusto() {
		return intervencaoCustoValue;
	}

	public void setIntervecaoCost(Double custoValue) {
		this.intervencaoCustoValue = custoValue;
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

	public void setICPValue(Double pciValue) {
		this.icpValue = pciValue;
	}
	
	
	
	
}
