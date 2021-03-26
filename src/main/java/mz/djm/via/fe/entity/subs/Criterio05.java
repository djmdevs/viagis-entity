package mz.djm.via.fe.entity.subs;

import mz.djm.via.fe.entity.BaseObject;
import mz.djm.via.fe.entity.Criterio;

/**
 * 
 * @author Sergio
 *
 */
public class Criterio05 extends Criterio {

	public Criterio05(Double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	private Double volumeTransitoValue;
	
	private Double capacidadeFluxoValue;

	public Double getVolumeTransitoValue() {
		return volumeTransitoValue;
	}

	public void setVolumeTransitoValue(Double volumeTransitoValue) {
		this.volumeTransitoValue = volumeTransitoValue;
	}

	public Double getCapacidadeFluxoValue() {
		return capacidadeFluxoValue;
	}

	public void setCapacidadeFluxoValue(Double capacidadeFluxoValue) {
		this.capacidadeFluxoValue = capacidadeFluxoValue;
	}
	
	
}
