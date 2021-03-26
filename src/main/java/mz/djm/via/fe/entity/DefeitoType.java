
package mz.djm.via.fe.entity;

import java.awt.Point;
import java.util.Random;

/**
 * 
 * @author Sergio
 *
 */
public class DefeitoType extends BaseObject {
	
	private String unidadeMedicaoValue ; // m, m2, %
	private Byte indiceDedutivoValue; //varia de 0..10
	private String latitude;
	private String longitude;
	
	public DefeitoType(String code) {
		this.code=code;
	}
	
	private Point pontoDedutivoObject; //validar coordenadas x e y
	
	public String getUnidadeMedicaoValue() {
		return "m2";
	}
	
	public Byte getIndiceDedutivoValue() {
		//value must be between 0 and 10 only
		return this.indiceDedutivoValue.equals(Byte.valueOf(new String(new Random().ints(0, 10).toString()))) 
				? this.indiceDedutivoValue : null ;
	}

	public void setIndiceDedutivoValue(Byte indiceDedutivoValue) {
		this.indiceDedutivoValue = indiceDedutivoValue;
	}

	private Point getPontoDedutivo() {
		return pontoDedutivoObject;
	}

	private void setPontoDedutivo(Point pointObject) {
		this.pontoDedutivoObject = pointObject;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
}	