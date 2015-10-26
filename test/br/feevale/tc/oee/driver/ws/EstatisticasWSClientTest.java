package br.feevale.tc.oee.driver.ws;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.feevale.tc.oee.ws.indice.GetIndiceOEETempoRealResponse;

public class EstatisticasWSClientTest {
	
	private static final EstatisticasWSClient estatisticaWSClient = new EstatisticasWSClient(Constants.URL_WEBSERVICES_LOCATION);
	private static final int codigoEquipamento = -200;
	private static final int periodoMinutos = 30;
	
	@Test
	public void test_GetIndiceTempoReal() {
		GetIndiceOEETempoRealResponse response = estatisticaWSClient.getIndiceTempoReal(codigoEquipamento, periodoMinutos);
		assertNull(response.getErros());
	}

}
