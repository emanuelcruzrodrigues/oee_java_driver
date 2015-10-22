
package br.feevale.tc.oee.ws.apontamento;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "inserirOuAlterarApontamentoProducao", targetNamespace = "apontamento.ws.oee.tc.feevale.br")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InserirOuAlterarApontamentoProducao {


    /**
     * 
     * @param inserirOuAlterarApontamentoProducaoRequest
     * @return
     *     returns br.feevale.tc.oee.ws.apontamento.InserirOuAlterarApontamentoProducaoResponse
     */
    @WebMethod
    @WebResult(name = "inserirOuAlterarApontamentoProducaoResponse", targetNamespace = "apontamento.ws.oee.tc.feevale.br", partName = "inserirOuAlterarApontamentoProducaoResponse")
    public InserirOuAlterarApontamentoProducaoResponse inserirOuAlterarApontamentoProducao(
        @WebParam(name = "inserirOuAlterarApontamentoProducaoRequest", targetNamespace = "apontamento.ws.oee.tc.feevale.br", partName = "inserirOuAlterarApontamentoProducaoRequest")
        InserirOuAlterarApontamentoProducaoRequest inserirOuAlterarApontamentoProducaoRequest);

}