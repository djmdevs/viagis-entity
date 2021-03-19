
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
	private Point pontoDedutivoObject; //validar coordenadas x e y
	private Double latitude;
	private Double longitude;
	
	public String getUnidadeMedicaoValue() {
		return unidadeMedicaoValue;
	}
	
	public Byte getIndiceDedutivoValue() {
		//value must be between 0 and 10 only
		return this.indiceDedutivoValue.equals(Byte.valueOf(new String(new Random().ints(0, 10).toString()))) 
				? this.indiceDedutivoValue : null ;
	}

	public void setIndiceDedutivoValue(Byte indiceDedutivoValue) {
		this.indiceDedutivoValue = indiceDedutivoValue;
	}

	public Point getPontoDedutivo() {
		return pontoDedutivoObject;
	}

	public void setPontoDedutivo(Point pointObject) {
		this.pontoDedutivoObject = pointObject;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
}	