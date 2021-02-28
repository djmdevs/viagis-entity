package mz.djm.via.fe.entity;

import java.awt.Point;

public class SeguimentoVia extends BaseObject{

	private Double larguraValue;
	
	private Double comprimentoValue;
	
	private Double icpValue;
	
	//nome da via sera igual a descricao existente na entidade generica
	//private String nome
	
	private IntervencaoType intervencaoTypeObject;
	
	private Point pointObject;

	public Double getLarguraValue() {
		return larguraValue;
	}

	public void setLarguraValue(Double larguraValue) {
		this.larguraValue = larguraValue;
	}

	public Double getComprimentoValue() {
		return comprimentoValue;
	}

	public void setComprimentoValue(Double comprimentoValue) {
		this.comprimentoValue = comprimentoValue;
	}

	public Double getIcpValue() {
		return icpValue;
	}

	public void setIcpValue(Double icpValue) {
		this.icpValue = icpValue;
	}

	public IntervencaoType getIntervencaoTypeObject() {
		return intervencaoTypeObject;
	}

	public void setIntervencaoTypeObject(IntervencaoType intervencaoTypeObject) {
		this.intervencaoTypeObject = intervencaoTypeObject;
	}

	public Point getPointObject() {
		return pointObject;
	}

	public void setPointObject(Point pointObject) {
		this.pointObject = pointObject;
	}
	
	
}
