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
		int i=mapDef.size();
		for(DefeitoType def: this.mapDef.values()) {
			
			this.mapDef.put(String.valueOf(i--), new DefeitoType());
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
	
}
