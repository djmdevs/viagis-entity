package mz.djm.via.fe.entity;

/**
 * 
 * @author Sergio
 *
 */
public class IntervencaoType extends BaseObject {

	private Double custoValue;

	public Double getCustoValue() {
		return custoValue;
	}
	
	public void setCustoValue(Double custoValue) {
		this.custoValue = custoValue;
	}
	
	//description field equals tipoValue
	public String getTipo(){
		return this.getDescription();
	}
		
}
