package br.feevale.tc.oee.driver.ws.enums;


public enum AtivoInativo {
	ATIVO("A"), INATIVO("I");

	private final String valor;

	private AtivoInativo(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	public static AtivoInativo getFromValue(String value) {
		for (AtivoInativo ativoInativo : values()) {
			if (ativoInativo.getValor().equals(value)) return ativoInativo;
		}
		return null;
	}
	
}
