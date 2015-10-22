package br.feevale.tc.oee.driver.ws.enums;


/**
 * @author Emanuel
 * emanuelcruzrodrigues@gmail.com
 * 06/08/2015
 */
public enum TipoParada{
	 DT_TECNICA("DTT"),
	 DT_OPERACIONAL("DTO"),
	 DT_QUALIDADE("DTQ"),
	 ST_OPERACIONAL("STO"),
	 ST_INDUZIDO("STI"),
	;
	 
	private final String valor;
	
	private TipoParada(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	public static TipoParada getFromValue(String value) {
		for (TipoParada tipoParada : values()) {
			if (tipoParada.getValor().equals(value)) return tipoParada;
		}
		return null;
	}
}
