package br.feevale.tc.oee.driver.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.joda.time.LocalDateTime;

import br.feevale.tc.oee.ws.programacao.DataHoraFinal;
import br.feevale.tc.oee.ws.programacao.DataHoraInicial;
import br.feevale.tc.oee.ws.programacao.ExcluirProgramacaoProducaoEquipamento;
import br.feevale.tc.oee.ws.programacao.ExcluirProgramacaoProducaoEquipamentoRequest;
import br.feevale.tc.oee.ws.programacao.ExcluirProgramacaoProducaoEquipamentoResponse;
import br.feevale.tc.oee.ws.programacao.InserirOuAlterarProgramacaoProducaoEquipamento;
import br.feevale.tc.oee.ws.programacao.InserirOuAlterarProgramacaoProducaoEquipamentoRequest;
import br.feevale.tc.oee.ws.programacao.InserirOuAlterarProgramacaoProducaoEquipamentoResponse;
import br.feevale.tc.oee.ws.programacao.InserirOuAlterarProgramacaoProducaoEquipamentoService;

/**
 * 
 * @author Emanuel Cruz Rodrigues -> emanuelcruzrodrigues@gmail.com
 * @see ProgramacaoProducaoEquipamentoWSClientTest
 *
 */
public class ProgramacaoProducaoEquipamentoWSClient {
	
	private static final String NAMESPACE = "programacao.ws.oee.tc.feevale.br";
	private static final String INSERIR_SERVICE_NAME = "inserirOuAlterarProgramacaoProducaoEquipamentoService";
	private static final String EXCLUIR_SERVICE_NAME = "excluirProgramacaoProducaoEquipamentoService";
	
	private InserirOuAlterarProgramacaoProducaoEquipamento portInserirOuAlterar;
	private ExcluirProgramacaoProducaoEquipamento portExcluir;

	public ProgramacaoProducaoEquipamentoWSClient(String oeeServerURL) {
		try {
			URL wsdlLocationIncluir = new URL(oeeServerURL + INSERIR_SERVICE_NAME + "Definition.wsdl");
			
			portInserirOuAlterar = new InserirOuAlterarProgramacaoProducaoEquipamentoService(wsdlLocationIncluir, new QName(NAMESPACE, INSERIR_SERVICE_NAME))
												.getPort(InserirOuAlterarProgramacaoProducaoEquipamento.class);
			
			URL wsdlLocationExcluir = new URL(oeeServerURL + EXCLUIR_SERVICE_NAME + "Definition.wsdl");
			portExcluir = new InserirOuAlterarProgramacaoProducaoEquipamentoService(wsdlLocationExcluir, new QName(NAMESPACE, EXCLUIR_SERVICE_NAME))
												.getPort(ExcluirProgramacaoProducaoEquipamento.class);
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public InserirOuAlterarProgramacaoProducaoEquipamentoResponse inserirOuAlterar(Integer codigo, int codigoEquipamento, LocalDateTime dtHrInicial, LocalDateTime dtHrFinal) {
		InserirOuAlterarProgramacaoProducaoEquipamentoRequest request = new InserirOuAlterarProgramacaoProducaoEquipamentoRequest();
		request.setCodigo(codigo);
		request.setCodigoEquipamento(codigoEquipamento);
		
		DataHoraInicial dataHoraInicial = new DataHoraInicial();
		dataHoraInicial.setAno(dtHrInicial.getYear());
		dataHoraInicial.setMes(dtHrInicial.getMonthOfYear());
		dataHoraInicial.setDia(dtHrInicial.getDayOfMonth());
		dataHoraInicial.setHora(dtHrInicial.getHourOfDay());
		dataHoraInicial.setMinuto(dtHrInicial.getMinuteOfHour());
		request.setDataHoraInicial(dataHoraInicial);
		
		DataHoraFinal dataHoraFinal = new DataHoraFinal();
		dataHoraFinal.setAno(dtHrFinal.getYear());
		dataHoraFinal.setMes(dtHrFinal.getMonthOfYear());
		dataHoraFinal.setDia(dtHrFinal.getDayOfMonth());
		dataHoraFinal.setHora(dtHrFinal.getHourOfDay());
		dataHoraFinal.setMinuto(dtHrFinal.getMinuteOfHour());
		request.setDataHoraFinal(dataHoraFinal);
		
		return portInserirOuAlterar.inserirOuAlterarProgramacaoProducaoEquipamento(request);
	}
	
	public ExcluirProgramacaoProducaoEquipamentoResponse excluir(Integer codigo){
		ExcluirProgramacaoProducaoEquipamentoRequest request = new ExcluirProgramacaoProducaoEquipamentoRequest();
		request.setCodigo(codigo);
		return portExcluir.excluirProgramacaoProducaoEquipamento(request);
	}
	
}
