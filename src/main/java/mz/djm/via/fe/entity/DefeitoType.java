
package mz.djm.via.fe.entity;

import java.awt.Point;

/**
 * 
 * @author Sergio
 *
 */
public class DefeitoType extends BaseObject {
	
	private String unidadeMedicaoValue ; // m, m2, %
	private Byte indiceDedutivoValue; //varia de 0..10

	private Point pontoDedutivoObject; //validar coordenadas x e y

	public String getUnidadeMedicaoValue() {
		return unidadeMedicaoValue;
	}
	
	public Byte getIndiceDedutivoValue() {
		return indiceDedutivoValue;
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
	
	
	

}	