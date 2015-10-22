package br.feevale.tc.oee.simulador.ws;

import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.Test;

import br.feevale.tc.oee.driver.ws.MotivoParadaWSClient;
import br.feevale.tc.oee.driver.ws.enums.AtivoInativo;
import br.feevale.tc.oee.driver.ws.enums.TipoParada;
import br.feevale.tc.oee.ws.motivoparada.ExcluirMotivoParadaResponse;
import br.feevale.tc.oee.ws.motivoparada.InserirOuAlterarMotivoParadaResponse;

public class MotivoParadaWSClientTest {
	
	private static final MotivoParadaWSClient motivoParadaWSClient = new MotivoParadaWSClient(Constants.URL_WEBSERVICES_LOCATION);
	private static final int codigoMotivoParada = -300;
	
	@AfterClass
	public static void destroy(){
		motivoParadaWSClient.excluir(codigoMotivoParada);
	}
	
	@Test
	public void testInserirOuAlterar() {
		String descricao = "MotivoParadaWSClientTest";
		AtivoInativo situacao = AtivoInativo.ATIVO;
		TipoParada tipoParada = TipoParada.DT_OPERACIONAL;
		InserirOuAlterarMotivoParadaResponse response = motivoParadaWSClient.inserirOuAlterar(codigoMotivoParada, descricao, situacao, tipoParada);
		assertNull(response.getErros());
	}

	@Test
	public void testExcluir() {
		testInserirOuAlterar();
		
		ExcluirMotivoParadaResponse response = motivoParadaWSClient.excluir(codigoMotivoParada);
		assertNull(response.getErros());
	}


}
