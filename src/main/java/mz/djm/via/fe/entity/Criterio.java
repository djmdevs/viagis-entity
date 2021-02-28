package mz.djm.via.fe.entity;

import java.io.Serializable;

public abstract class Criterio extends BaseObject{//<T extends Serializable> extends BaseEntity {
	
	protected Double value;
	
	protected Double getValue() {

		return value;
	}
	
	protected void setValue(Double value) {
		this.value = value;
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
