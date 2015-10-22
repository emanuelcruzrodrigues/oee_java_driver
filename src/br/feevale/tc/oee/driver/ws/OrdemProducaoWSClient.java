package br.feevale.tc.oee.driver.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import br.feevale.tc.oee.driver.ws.enums.SituacaoOrdemProducao;
import br.feevale.tc.oee.ws.ordemproducao.ExcluirOrdemProducao;
import br.feevale.tc.oee.ws.ordemproducao.ExcluirOrdemProducaoRequest;
import br.feevale.tc.oee.ws.ordemproducao.ExcluirOrdemProducaoResponse;
import br.feevale.tc.oee.ws.ordemproducao.ExcluirOrdemProducaoService;
import br.feevale.tc.oee.ws.ordemproducao.InserirOuAlterarOrdemProducao;
import br.feevale.tc.oee.ws.ordemproducao.InserirOuAlterarOrdemProducaoRequest;
import br.feevale.tc.oee.ws.ordemproducao.InserirOuAlterarOrdemProducaoResponse;
import br.feevale.tc.oee.ws.ordemproducao.InserirOuAlterarOrdemProducaoService;

/**
 * 
 * @author Emanuel Cruz Rodrigues -> emanuelcruzrodrigues@gmail.com
 * @see OrdemProducaoWSClientTest
 *
 */
public class OrdemProducaoWSClient {
	
	private static final String NAMESPACE = "ordemProducao.ws.oee.tc.feevale.br";
	private static final String INCLUIR_SERVICE_NAME = "inserirOuAlterarOrdemProducaoService";
	private static final String EXCLUIR_SERVICE_NAME = "excluirOrdemProducaoService";
	
	private InserirOuAlterarOrdemProducao portIncluir;
	private ExcluirOrdemProducao portExcluir;

	public OrdemProducaoWSClient(String oeeServerURL) {
		try {
			
			portIncluir = new InserirOuAlterarOrdemProducaoService(
												new URL(oeeServerURL + INCLUIR_SERVICE_NAME + "Definition.wsdl")
												, new QName(NAMESPACE, INCLUIR_SERVICE_NAME))
											.getPort(InserirOuAlterarOrdemProducao.class);
			
			portExcluir = new ExcluirOrdemProducaoService(
												new URL(oeeServerURL + EXCLUIR_SERVICE_NAME + "Definition.wsdl")
												, new QName(NAMESPACE, EXCLUIR_SERVICE_NAME))
										.getPort(ExcluirOrdemProducao.class);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public InserirOuAlterarOrdemProducaoResponse inserirOuAlterar(int codigo, String descricao, double unidadesPorMinuto, SituacaoOrdemProducao situacao, int codigoEquipamento) {
		InserirOuAlterarOrdemProducaoRequest request = new InserirOuAlterarOrdemProducaoRequest();
		request.setCodigo(codigo);
		request.setDescricao(descricao);
		request.setUnidadesPorMinuto(unidadesPorMinuto);
		request.setSituacao(situacao != null ? situacao.getValor() : null);
		request.setCodigoEquipamento(codigoEquipamento);
		return portIncluir.inserirOuAlterarOrdemProducao(request);
	}
	
	public ExcluirOrdemProducaoResponse excluir(int codigo){
		ExcluirOrdemProducaoRequest request = new ExcluirOrdemProducaoRequest();
		request.setCodigo(codigo);
		return portExcluir.excluirOrdemProducao(request);
	}
	
}
