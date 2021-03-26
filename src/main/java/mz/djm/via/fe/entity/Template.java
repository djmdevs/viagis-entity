package mz.djm.via.fe.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Sergio
 *
 */

public class Template extends BaseObject {

	private SeguimentoVia seguimentoObject;
	
	private Double area;
	
	private Map<String,DefeitoType> mapDef = new HashMap(15); //max defects
	
	public Template() {
		
		//define a constante de defeitos por indice de defeito
		for(int i=1;i<=15;i++) {
			
			this.mapDef.put("DEF".concat(""+i), new DefeitoType("DEF".concat(""+i)));
		}
	}


	public SeguimentoVia getSegmento() {
		
		return seguimentoObject;
	}


	public void setVia(SeguimentoVia seguimentoObject) {
		
		this.seguimentoObject = seguimentoObject;
	}


	public Double getArea() {
		
		this.area = (Double) seguimentoObject.getComprimentoValue() * seguimentoObject.getLarguraValue();
		
		return this.area;
	
	}

	public Map<String, DefeitoType> getMapDef() {
		return this.mapDef;
	}
	
}
