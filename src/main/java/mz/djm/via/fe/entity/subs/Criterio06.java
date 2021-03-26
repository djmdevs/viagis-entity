package mz.djm.via.fe.entity.subs;

import mz.djm.via.fe.entity.Criterio;
/**
 * 
 * @author Sergio
 *
 */
public class Criterio06 extends Criterio {
	
	public Criterio06(Double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	private String cO2Value;

	public String getCO2Value() {
		return cO2Value;
	}

	public void setCO2Value(String cO2Value) {
		this.cO2Value = cO2Value;
	}
	
	@Override
	public String getCode() {
		return "CT06";
	}
	
	
}
