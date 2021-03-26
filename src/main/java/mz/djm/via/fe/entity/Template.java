package mz.djm.via.fe.entity;

/**
 * 
 * @author Sergio
 *
 */

public class Template extends BaseObject {

	private SeguimentoVia seguimentoObject;
	
	private double area;
	
	private DefeitoType[] defeitos = new DefeitoType[15];
	
	
	public Template() {
		// TODO Auto-generated constructor stub
	}


	public SeguimentoVia getVia() {
		return seguimentoObject;
	}


	public void setVia(SeguimentoVia seguimentoObject) {
		this.seguimentoObject = seguimentoObject;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public DefeitoType[] getDefeitos() {
		return defeitos;
	}


	public void setDefeitos(DefeitoType[] defeitos) {
		this.defeitos = defeitos;
	}
	
	
}
