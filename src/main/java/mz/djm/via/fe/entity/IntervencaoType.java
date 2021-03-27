package mz.djm.via.fe.entity;

import javax.swing.text.Segment;

/**
 * 
 * @author Sergio
 *
 */
public class IntervencaoType extends BaseObject {

	private SeguimentoVia via;
	private Double custoMetro2;
	private Double custoValue;
	private Long icpPosIntervencao;
	private Long icpValue;
	private Double cO2Metro2;
	

	public Double getCustoValue() {
		return custoValue;
	}
	
	public void setcO2Metro2(Double cO2Metro2) {
		this.cO2Metro2 = cO2Metro2;
	}
	
	public Double getcO2Metro2() {
		return cO2Metro2;
	}
	
	public void setCustoValue(Double custoValue) {
		this.custoValue = custoValue;
	}
	
	//description field equals tipoValue
	public String getTipo(){
		
		return this.getDescription();
	}
	
	public Long getICPposIntervencao() {
		
		return icpPosIntervencao;
		
	}
	
	public void setIcpPosIntervencao(Long icpPosIntervencao) {
		
		this.icpPosIntervencao = icpPosIntervencao;
	}
	
	public SeguimentoVia getVia() {
		
		return via;
	}
	
	public void setVia(SeguimentoVia via) {
		
		via.setIcpValue(this.icpValue);
		
		this.via = via;
	}
	
	public Double getCustoMetro2() {
		
		return custoMetro2;
	}
	
	public void setCustoMetro2(Double custoStandard) {
		
		this.custoMetro2 = custoStandard;
	}
	
	public void setIcpValue(Long icpValue) {
		
		this.icpValue = icpValue;
	}
	
	public Long getIcpValue() {
		return icpValue;
	}
		
}
