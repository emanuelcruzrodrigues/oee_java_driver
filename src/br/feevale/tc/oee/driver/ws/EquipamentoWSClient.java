package br.feevale.tc.oee.driver.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import br.feevale.tc.oee.driver.ws.enums.AtivoInativo;
import br.feevale.tc.oee.ws.equipamento.ExcluirEquipamento;
import br.feevale.tc.oee.ws.equipamento.ExcluirEquipamentoRequest;
import br.feevale.tc.oee.ws.equipamento.ExcluirEquipamentoResponse;
import br.feevale.tc.oee.ws.equipamento.ExcluirEquipamentoService;
import br.feevale.tc.oee.ws.equipamento.InserirOuAlterarEquipamento;
import br.feevale.tc.oee.ws.equipamento.InserirOuAlterarEquipamentoRequest;
import br.feevale.tc.oee.ws.equipamento.InserirOuAlterarEquipamentoResponse;
import br.feevale.tc.oee.ws.equipamento.InserirOuAlterarEquipamentoService;

/**
 * 
 * @author Emanuel Cruz Rodrigues -> emanuelcruzrodrigues@gmail.com
 * @see EquipamentoWSClientTest
 *
 */
public class EquipamentoWSClient {
	
	private static final String NAMESPACE = "equipamento.ws.oee.tc.feevale.br";
	private static final String INSERIR_SERVICE_NAME = "inserirOuAlterarEquipamentoService";
	private static final String EXCLUIR_SERVICE_NAME = "excluirEquipamentoService";
	
	private InserirOuAlterarEquipamento portInserirAlterar;
	private ExcluirEquipamento portExcluir;

	public EquipamentoWSClient(String oeeServerURL) {
		try {
			portInserirAlterar = new InserirOuAlterarEquipamentoService(
											  new URL(oeeServerURL + INSERIR_SERVICE_NAME + "Definition.wsdl")
											, new QName(NAMESPACE, INSERIR_SERVICE_NAME))
										.getPort(InserirOuAlterarEquipamento.class);
			
			portExcluir = new ExcluirEquipamentoService(
											new URL(oeeServerURL + EXCLUIR_SERVICE_NAME + "Definition.wsdl")
										  , new QName(NAMESPACE, EXCLUIR_SERVICE_NAME))
										.getPort(ExcluirEquipamento.class);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public InserirOuAlterarEquipamentoResponse inserirOuAlterar(int codigo, String nome, AtivoInativo situacao){
		InserirOuAlterarEquipamentoRequest request = new InserirOuAlterarEquipamentoRequest();
		request.setCodigo(codigo);
		request.setNome(nome);
		request.setSituacao(situacao != null ? situacao.getValor() : null);
		return portInserirAlterar.inserirOuAlterarEquipamento(request);
	}
	
	public ExcluirEquipamentoResponse excluir(int codigo){
		ExcluirEquipamentoRequest request = new ExcluirEquipamentoRequest();
		request.setCodigo(codigo);
		return portExcluir.excluirEquipamento(request);
	}
	
}
