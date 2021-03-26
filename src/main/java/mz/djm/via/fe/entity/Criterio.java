package mz.djm.via.fe.entity;

import java.io.Serializable;

public abstract class Criterio extends BaseObject{//<T extends Serializable> extends BaseEntity {
	
	protected Double value; //varia em funcao dos niveis 0..1
	
	protected Double priorityValue;
	
	public Criterio(Double value) {
		this.value=value;
	}
		
	public Double getPriorityValue() {
		return priorityValue;
	}
	
	protected void setPriorityValue(Double priorityValue) {
		this.priorityValue = priorityValue;
	}
	
	public Double getValue() {
		return value;
	}
	
	/**
	 * Executa  regra de negocio Br003 - transportar para CriterioRuleValidator/ BusinessRule03Validator
	 * 
	 * @param t paramentros do criterio
	 * @return Retorna o valor do criterio calculado
	 */
//	protected T value(Object ...t) {
//		return null;
//	}
	

}
