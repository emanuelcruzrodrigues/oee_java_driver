package br.feevale.tc.oee.simulador.ws;

import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.Test;

import br.feevale.tc.oee.driver.ws.EquipamentoWSClient;
import br.feevale.tc.oee.driver.ws.enums.AtivoInativo;
import br.feevale.tc.oee.ws.equipamento.ExcluirEquipamentoResponse;
import br.feevale.tc.oee.ws.equipamento.InserirOuAlterarEquipamentoResponse;

public class EquipamentoWSClientTest {
	
	private static final EquipamentoWSClient equipamentoWSClient = new EquipamentoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	private static final int codigoEquipamento = -200;
	
	@AfterClass
	public static void destroy(){
		equipamentoWSClient.excluir(codigoEquipamento);
	}

	@Test
	public void testInserirOuAlterar() {
		String nome = "EquipamentoWSClientTest";
		AtivoInativo situacao = AtivoInativo.ATIVO;
		InserirOuAlterarEquipamentoResponse response = equipamentoWSClient.inserirOuAlterar(codigoEquipamento, nome, situacao);
		assertNull(response.getErros());
	}

	@Test
	public void testExcluir() {
		ExcluirEquipamentoResponse response = equipamentoWSClient.excluir(codigoEquipamento);
		assertNull(response.getErros());
	}

}
