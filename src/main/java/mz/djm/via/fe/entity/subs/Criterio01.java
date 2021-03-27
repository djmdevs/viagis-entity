package mz.djm.via.fe.entity.subs;

import mz.djm.via.fe.entity.Criterio;
import mz.djm.via.fe.entity.IntervencaoType;

/**
 * 
 * @author Sergio
 *
 */
public class Criterio01 extends Criterio {
	
	
	public Criterio01(Double transitoValue) {
		
		this.transitoValue = transitoValue;
	}
	
	public Criterio01() {}	
	
	
	private Double intervencaoCustoValue;
	private Double transitoValue;
	private Long icpValue;
		
	@Override
	public String getCode() {
		return "CT01";
	}

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

	public Long getICPValue() {
		return icpValue;
	}

	public void setICPValue(Long icpValue) {
		this.icpValue = icpValue;
	}
	
	
}
