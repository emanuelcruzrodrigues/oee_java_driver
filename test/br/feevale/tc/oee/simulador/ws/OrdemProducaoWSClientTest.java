package br.feevale.tc.oee.simulador.ws;

import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.feevale.tc.oee.driver.ws.EquipamentoWSClient;
import br.feevale.tc.oee.driver.ws.OrdemProducaoWSClient;
import br.feevale.tc.oee.driver.ws.enums.AtivoInativo;
import br.feevale.tc.oee.driver.ws.enums.SituacaoOrdemProducao;
import br.feevale.tc.oee.ws.ordemproducao.ExcluirOrdemProducaoResponse;
import br.feevale.tc.oee.ws.ordemproducao.InserirOuAlterarOrdemProducaoResponse;

public class OrdemProducaoWSClientTest {
	
	private static final EquipamentoWSClient equipamentoWSClient = new EquipamentoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	private static final OrdemProducaoWSClient ordemProducaoWSClient = new OrdemProducaoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	
	private static final int codigoOrdemProducao = -400;
	private static final int codigoEquipamento = -400;

	@BeforeClass
	public static void setUp(){
		equipamentoWSClient.inserirOuAlterar(codigoEquipamento, "OrdemProducaoWSClientTest", AtivoInativo.ATIVO);
	}
	
	@AfterClass
	public static void destroy(){
		ordemProducaoWSClient.excluir(codigoOrdemProducao);
		equipamentoWSClient.excluir(codigoEquipamento);
	}
	
	@Test
	public void testInserirOuAlterar() {
		String descricao = "OrdemProducaoWSClientTest";
		double unidadesPorMinuto = 10D;
		SituacaoOrdemProducao situacao = SituacaoOrdemProducao.ABERTA;
		InserirOuAlterarOrdemProducaoResponse response = ordemProducaoWSClient.inserirOuAlterar(codigoOrdemProducao, descricao, unidadesPorMinuto, situacao, codigoEquipamento);
		assertNull(response.getErros());
	}

	@Test
	public void testExcluir() {
		testInserirOuAlterar();
		
		ExcluirOrdemProducaoResponse response = ordemProducaoWSClient.excluir(codigoOrdemProducao);
		assertNull(response.getErros());
	}

}
