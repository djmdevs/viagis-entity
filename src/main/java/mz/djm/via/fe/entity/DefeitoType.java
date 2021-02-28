
package mz.djm.via.fe.entity;

import java.awt.Point;

/**
 * 
 * @author Sergio
 *
 */
public class DefeitoType extends BaseObject {
	
	private Byte indiceMedicaoValue ;
	private Byte indiceDedutivoValue;

	private Point pontoDedutivoObject;

	public Byte getIndiceMedicaoValue() {
		return indiceMedicaoValue;
	}

	public void setIndiceMedicaoValue(Byte indiceMedicaoValue) {
		this.indiceMedicaoValue = indiceMedicaoValue;
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