
package br.feevale.tc.oee.ws.motivoparada;

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
@WebService(name = "inserirOuAlterarMotivoParada", targetNamespace = "motivoParada.ws.oee.tc.feevale.br")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InserirOuAlterarMotivoParada {


    /**
     * 
     * @param inserirOuAlterarMotivoParadaRequest
     * @return
     *     returns br.feevale.tc.oee.ws.motivoparada.InserirOuAlterarMotivoParadaResponse
     */
    @WebMethod
    @WebResult(name = "inserirOuAlterarMotivoParadaResponse", targetNamespace = "motivoParada.ws.oee.tc.feevale.br", partName = "inserirOuAlterarMotivoParadaResponse")
    public InserirOuAlterarMotivoParadaResponse inserirOuAlterarMotivoParada(
        @WebParam(name = "inserirOuAlterarMotivoParadaRequest", targetNamespace = "motivoParada.ws.oee.tc.feevale.br", partName = "inserirOuAlterarMotivoParadaRequest")
        InserirOuAlterarMotivoParadaRequest inserirOuAlterarMotivoParadaRequest);

}
