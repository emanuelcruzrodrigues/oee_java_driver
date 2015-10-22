package br.feevale.tc.oee.simulador.ws;

import static org.junit.Assert.assertNull;

import org.joda.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.feevale.tc.oee.driver.ws.ApontamentoWSClient;
import br.feevale.tc.oee.driver.ws.EquipamentoWSClient;
import br.feevale.tc.oee.driver.ws.MotivoParadaWSClient;
import br.feevale.tc.oee.driver.ws.OrdemProducaoWSClient;
import br.feevale.tc.oee.driver.ws.enums.AtivoInativo;
import br.feevale.tc.oee.driver.ws.enums.QualidadeProducao;
import br.feevale.tc.oee.driver.ws.enums.SituacaoOrdemProducao;
import br.feevale.tc.oee.driver.ws.enums.TipoParada;
import br.feevale.tc.oee.ws.apontamento.EncerrarApontamentoEquipamentoResponse;
import br.feevale.tc.oee.ws.apontamento.ExcluirApontamentoParadaResponse;
import br.feevale.tc.oee.ws.apontamento.ExcluirApontamentoProducaoResponse;
import br.feevale.tc.oee.ws.apontamento.ExcluirApontamentoQuantidadeResponse;
import br.feevale.tc.oee.ws.apontamento.IniciarApontamentoParadaResponse;
import br.feevale.tc.oee.ws.apontamento.IniciarApontamentoProducaoResponse;
import br.feevale.tc.oee.ws.apontamento.InserirApontamentoQuantidadeRefugoResponse;
import br.feevale.tc.oee.ws.apontamento.InserirApontamentoQuantidadeResponse;
import br.feevale.tc.oee.ws.apontamento.InserirOuAlterarApontamentoParadaResponse;
import br.feevale.tc.oee.ws.apontamento.InserirOuAlterarApontamentoProducaoResponse;
import br.feevale.tc.oee.ws.apontamento.InserirOuAlterarApontamentoQuantidadeResponse;

public class ApontamentoWSClientTest {
	
	private static final ApontamentoWSClient apontamentoWsClient = new ApontamentoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	
	private static final EquipamentoWSClient equipamentoWSClient = new EquipamentoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	private static final OrdemProducaoWSClient ordemProducaoWSClient = new OrdemProducaoWSClient(Constants.URL_WEBSERVICES_LOCATION);
	private static final MotivoParadaWSClient motivoParadaWSClient = new MotivoParadaWSClient(Constants.URL_WEBSERVICES_LOCATION);
	
	private static final int codigoEquipamento = -100;
	private static final int codigoOrdemProducao = -100;
	private static final int codigoMotivoParada = -100;
	private static final int codigoApontamentoProducao = -100;
	private static final int codigoApontamentoParada = -101;
	private static final int codigoApontamentoQuantidade = -102;

	
	@BeforeClass
	public static void setUp(){
		equipamentoWSClient.inserirOuAlterar(codigoEquipamento, "ApontamentoWSClientTest", AtivoInativo.ATIVO);
		ordemProducaoWSClient.inserirOuAlterar(codigoOrdemProducao, "ApontamentoWSClientTest", 10D, SituacaoOrdemProducao.ABERTA, codigoEquipamento);
		motivoParadaWSClient.inserirOuAlterar(codigoMotivoParada, "ApontamentoWSClientTest", AtivoInativo.ATIVO, TipoParada.DT_OPERACIONAL);
	}
	
	
	@AfterClass
	public static void destroy(){
		apontamentoWsClient.excluirApontamentoProducao(codigoApontamentoProducao);
		apontamentoWsClient.excluirApontamentoParada(codigoApontamentoParada);
		apontamentoWsClient.excluirApontamentoQuantidade(codigoApontamentoQuantidade);
	}
	
	@Test
	public void testIniciarApontamentoProducao() {
		IniciarApontamentoProducaoResponse response = apontamentoWsClient.iniciarApontamentoProducao(codigoOrdemProducao);
		
		assertNull(response.getErros());
	}

	@Test
	public void testIniciarApontamentoParada() {
		IniciarApontamentoParadaResponse response = apontamentoWsClient.iniciarApontamentoParada(codigoEquipamento, codigoMotivoParada);
		
		assertNull(response.getErros());
	}

	@Test
	public void testEncerrarApontamentos() {
		EncerrarApontamentoEquipamentoResponse response = apontamentoWsClient.encerrarApontamentos(codigoEquipamento);
		
		assertNull(response.getErros());
	}
	
	@Test
	public void testInserirApontamentoQuantidade(){
		double quantidade = 10D;
		
		InserirApontamentoQuantidadeResponse response = apontamentoWsClient.inserirApontamentoQuantidade(codigoOrdemProducao, quantidade);
		
		assertNull(response.getErros());
	}
	
	@Test
	public void testInserirApontamentoQuantidadeRefugo(){
		double quantidade = 20D;
		InserirApontamentoQuantidadeRefugoResponse response = apontamentoWsClient.inserirApontamentoQuantidadeRefugo(codigoOrdemProducao, quantidade);
		
		assertNull(response.getErros());
	}
	
	@Test
	public void testInserirOuAlterarApontamentoProducao() {
		LocalDateTime dtHrInicial = new LocalDateTime().minusHours(1);
		LocalDateTime dtHrFinal = new LocalDateTime();
		InserirOuAlterarApontamentoProducaoResponse response = apontamentoWsClient.inserirOuAlterarApontamentoProducao(codigoApontamentoProducao, codigoOrdemProducao, dtHrInicial, dtHrFinal);
		
		assertNull(response.getErros());
	}
	
	@Test
	public void testExcluirApontamentoProducao() {
		testInserirOuAlterarApontamentoProducao();
		
		ExcluirApontamentoProducaoResponse response = apontamentoWsClient.excluirApontamentoProducao(codigoApontamentoProducao);
		assertNull(response.getErros());
	}
	
	@Test
	public void testInserirOuAlterarApontamentoParada() {
		LocalDateTime dtHrInicial = new LocalDateTime().minusHours(1);
		LocalDateTime dtHrFinal = new LocalDateTime();
		InserirOuAlterarApontamentoParadaResponse response = apontamentoWsClient.inserirOuAlterarApontamentoParada(codigoApontamentoParada, codigoEquipamento, codigoMotivoParada, dtHrInicial, dtHrFinal);
		
		assertNull(response.getErros());
	}
	
	@Test
	public void testExcluirApontamentoParada() {
		testInserirOuAlterarApontamentoParada();
		
		ExcluirApontamentoParadaResponse response = apontamentoWsClient.excluirApontamentoParada(codigoApontamentoParada);
		assertNull(response.getErros());
	}
	
	@Test
	public void testInserirOuAlterarApontamentoQuantidade() {
		LocalDateTime dtHr = new LocalDateTime();
		QualidadeProducao qualidadeProducao = QualidadeProducao.DENTRO_DOS_PADROES;
		double quantidade = 10D;
		InserirOuAlterarApontamentoQuantidadeResponse response = apontamentoWsClient.inserirOuAlterarApontamentoQuantidade(codigoApontamentoQuantidade, codigoOrdemProducao, dtHr, qualidadeProducao, quantidade);
		
		assertNull(response.getErros());
	}

	@Test
	public void testExcluirApontamentoQuantidade() {
		testInserirOuAlterarApontamentoQuantidade();
		
		ExcluirApontamentoQuantidadeResponse response = apontamentoWsClient.excluirApontamentoQuantidade(codigoApontamentoQuantidade);
		assertNull(response.getErros());
	}

}
