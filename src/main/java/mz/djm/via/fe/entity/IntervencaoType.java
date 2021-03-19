package mz.djm.via.fe.entity;

import javax.swing.text.Segment;

/**
 * 
 * @author Sergio
 *
 */
public class IntervencaoType extends BaseObject {

	private SeguimentoVia via;
	private Double custoPorMetro2;
	private Double custoValue;
	private Long icpPosIntervencao;
	private Long icpValue;

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
		this.via = via;
	}
	
	public Double getCustoMetro2() {
		return custoPorMetro2;
	}
	
	public void setCustoMetro2(Double custoStandard) {
		this.custoPorMetro2 = custoStandard;
	}
	
	public void setIcpValue(Long icpValue) {
		this.icpValue = icpValue;
	}
	
	public Long getIcpValue() {
		return icpValue;
	}
		
}
