package br.feevale.tc.oee.simulador.ws;

import static org.junit.Assert.assertNull;

import org.joda.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.feevale.tc.oee.driver.ws.EquipamentoWSClient;
import br.feevale.tc.oee.driver.ws.ProgramacaoProducaoEquipamentoWSClient;
import br.feevale.tc.oee.driver.ws.enums.AtivoInativo;
import br.feevale.tc.oee.ws.programacao.ExcluirProgramacaoProducaoEquipamentoResponse;
import br.feevale.tc.oee.ws.programacao.InserirOuAlterarProgramacaoProducaoEquipamentoResponse;

public class ProgramacaoProducaoEquipamentoWSClientTest {

	private static final ProgramacaoProducaoEquipamentoWSClient producaoEquipamentoWSClient= new ProgramacaoProducaoEquipamentoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	
	private static final EquipamentoWSClient equipamentoWSClient = new EquipamentoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	
	private static final int codigoProgramacao = -500;
	private static final int codigoEquipamento = -500;
	
	@BeforeClass
	public static void setUp(){
		equipamentoWSClient.inserirOuAlterar(codigoEquipamento, "ProgramacaoProducaoEquipamentoWSClientTest", AtivoInativo.ATIVO);
	}
	
	@AfterClass
	public static void destroy(){
		producaoEquipamentoWSClient.excluir(codigoProgramacao);
		equipamentoWSClient.excluir(codigoEquipamento);
	}
	
	@Test
	public void testInclusaoAlteracao() {
		LocalDateTime dtHrInicial = new LocalDateTime().minusHours(4);
		LocalDateTime dtHrFinal = new LocalDateTime();
		InserirOuAlterarProgramacaoProducaoEquipamentoResponse response = producaoEquipamentoWSClient.inserirOuAlterar(codigoProgramacao, codigoEquipamento, dtHrInicial, dtHrFinal);
		assertNull(response.getErros());
	}

	@Test
	public void testExclusao() {
		testInclusaoAlteracao();
		
		ExcluirProgramacaoProducaoEquipamentoResponse response = producaoEquipamentoWSClient.excluir(codigoProgramacao);
		assertNull(response.getErros());
	}

}
