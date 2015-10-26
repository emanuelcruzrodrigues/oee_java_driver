package br.feevale.tc.oee.driver.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import br.feevale.tc.oee.ws.indice.GetIndiceOEETempoReal;
import br.feevale.tc.oee.ws.indice.GetIndiceOEETempoRealRequest;
import br.feevale.tc.oee.ws.indice.GetIndiceOEETempoRealResponse;
import br.feevale.tc.oee.ws.indice.GetIndiceOEETempoRealService;

/**
 * 
 * @author Emanuel Cruz Rodrigues -> emanuelcruzrodrigues@gmail.com
 * @see EstatisticasWSClientTest
 *
 */
public class EstatisticasWSClient {
	
	private static final String NAMESPACE = "indice.ws.oee.tc.feevale.br";
	private static final String TEMPO_REAL_SERVICE_NAME = "getIndiceOEETempoRealService";
	
	private GetIndiceOEETempoReal portTempoReal;

	public EstatisticasWSClient(String oeeServerURL) {
		try {
			portTempoReal = new GetIndiceOEETempoRealService(
											  new URL(oeeServerURL + TEMPO_REAL_SERVICE_NAME + "Definition.wsdl")
											, new QName(NAMESPACE, TEMPO_REAL_SERVICE_NAME))
										.getPort(GetIndiceOEETempoReal.class);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public GetIndiceOEETempoRealResponse getIndiceTempoReal(int codigoEquipamento, int periodoMinutos){
		GetIndiceOEETempoRealRequest request = new GetIndiceOEETempoRealRequest();
		request.setCodigoEquipamento(codigoEquipamento);
		request.setPeriodoMinutos(periodoMinutos);
		return portTempoReal.getIndiceOEETempoReal(request);
	}
	
	
}
