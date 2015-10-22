package br.feevale.tc.oee.driver.ws.enums;


/**
 * @author Emanuel
 * emanuelcruzrodrigues@gmail.com
 * 06/08/2015
 */
public enum QualidadeProducao{
	 DENTRO_DOS_PADROES("P")
	,REFUGO("R")
	;
	 
	private final String valor;
	
	private QualidadeProducao(String value) {
		this.valor = value;
	}

	public String getValor() {
		return valor;
	}
	
	public static QualidadeProducao getFromValue(String value) {
		if (value == null) return null;
		
		for (QualidadeProducao enumValue : values()) {
			if (enumValue.getValor().equals(value)) return enumValue;
		}
		return null;
	}
	
}
