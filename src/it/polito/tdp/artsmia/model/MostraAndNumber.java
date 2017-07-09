package it.polito.tdp.artsmia.model;



public class MostraAndNumber implements Comparable<MostraAndNumber>{
	
	private String titoloMostra;
	private int opereCondivise;
	public MostraAndNumber(String titoloMostra, int opereCondivise) {
		super();
		this.titoloMostra = titoloMostra;
		this.opereCondivise = opereCondivise;
	}
	public String getTitoloMostra() {
		return titoloMostra;
	}
	public void setTitoloMostra(String titoloMostra) {
		this.titoloMostra = titoloMostra;
	}
	public int getOpereCondivise() {
		return opereCondivise;
	}
	public void setOpereCondivise(int opereCondivise) {
		this.opereCondivise = opereCondivise;
	}
	@Override
	public java.lang.String toString() {
		return "MostraAndNumber [titoloMostra=" + titoloMostra + ", opereCondivise=" + opereCondivise + "]";
	}
	@Override
	public int compareTo(MostraAndNumber other) {
		
		return this.getOpereCondivise()-other.getOpereCondivise();
	}
	
	
	
	
	
	
	

}
