package br.feevale.tc.oee.driver.ws.enums;


/**
 * @author Emanuel
 * emanuelcruzrodrigues@gmail.com
 * 13/08/2015
 */
public enum SituacaoOrdemProducao{
	ABERTA("A"),
	ENCERRADA("E"),
	;
	 
	private final String valor;
	
	private SituacaoOrdemProducao(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	public static SituacaoOrdemProducao getFromValue(String value) {
		for (SituacaoOrdemProducao situacaoOrdemProducao : values()) {
			if (situacaoOrdemProducao.getValor().equals(value)) return situacaoOrdemProducao;
		}
		return null;
	}
	
}
