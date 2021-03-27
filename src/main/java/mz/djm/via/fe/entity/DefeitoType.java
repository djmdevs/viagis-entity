
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
	private Integer indiceDedutivoValue; //varia de 0..10
	
	@Deprecated
	private String latitude;
	@Deprecated
	private String longitude;
	
	public DefeitoType(String code) {
		this.code=code;
	}
	
	private Point pontoDedutivoObject; //validar coordenadas x e y
	
	public String getUnidadeMedicaoValue() {
		return "m2";
	}
	
	public Integer getIndiceDedutivoValue() {
		//value must be between 0 and 10 only
		return this.indiceDedutivoValue;
	}
	
	public Integer getRandomIndiceDedutivoValue() {
		//value must be between 0 and 10 only
		return new Random().nextInt(10);
	}

	public void setIndiceDedutivoValue(Integer indiceDedutivoValue) {
		this.indiceDedutivoValue = indiceDedutivoValue;
	}

	private Point getPontoDedutivo() {
		return pontoDedutivoObject;
	}

	private void setPontoDedutivo(Point pointObject) {
		this.pontoDedutivoObject = pointObject;
	}
	
	@Deprecated
	public String getLatitude() {
		return latitude;
	}

	@Deprecated
	public String getLongitude() {
		return longitude;
	}
	
}	