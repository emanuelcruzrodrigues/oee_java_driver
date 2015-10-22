
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
@WebService(name = "excluirApontamentoQuantidade", targetNamespace = "apontamento.ws.oee.tc.feevale.br")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExcluirApontamentoQuantidade {


    /**
     * 
     * @param excluirApontamentoQuantidadeRequest
     * @return
     *     returns br.feevale.tc.oee.ws.apontamento.ExcluirApontamentoQuantidadeResponse
     */
    @WebMethod
    @WebResult(name = "excluirApontamentoQuantidadeResponse", targetNamespace = "apontamento.ws.oee.tc.feevale.br", partName = "excluirApontamentoQuantidadeResponse")
    public ExcluirApontamentoQuantidadeResponse excluirApontamentoQuantidade(
        @WebParam(name = "excluirApontamentoQuantidadeRequest", targetNamespace = "apontamento.ws.oee.tc.feevale.br", partName = "excluirApontamentoQuantidadeRequest")
        ExcluirApontamentoQuantidadeRequest excluirApontamentoQuantidadeRequest);

}