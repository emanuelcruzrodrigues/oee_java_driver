
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
@WebService(name = "iniciarApontamentoParada", targetNamespace = "apontamento.ws.oee.tc.feevale.br")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IniciarApontamentoParada {


    /**
     * 
     * @param iniciarApontamentoParadaRequest
     * @return
     *     returns br.feevale.tc.oee.ws.apontamento.IniciarApontamentoParadaResponse
     */
    @WebMethod
    @WebResult(name = "iniciarApontamentoParadaResponse", targetNamespace = "apontamento.ws.oee.tc.feevale.br", partName = "iniciarApontamentoParadaResponse")
    public IniciarApontamentoParadaResponse iniciarApontamentoParada(
        @WebParam(name = "iniciarApontamentoParadaRequest", targetNamespace = "apontamento.ws.oee.tc.feevale.br", partName = "iniciarApontamentoParadaRequest")
        IniciarApontamentoParadaRequest iniciarApontamentoParadaRequest);

}
