
package br.feevale.tc.oee.ws.programacao;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "excluirProgramacaoProducaoEquipamentoService", targetNamespace = "programacao.ws.oee.tc.feevale.br", wsdlLocation = "http://localhost:8080/oee/ws/excluirProgramacaoProducaoEquipamentoServiceDefinition.wsdl")
public class ExcluirProgramacaoProducaoEquipamentoService
    extends Service
{

    private final static URL EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_EXCEPTION;
    private final static QName EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_QNAME = new QName("programacao.ws.oee.tc.feevale.br", "excluirProgramacaoProducaoEquipamentoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/oee/ws/excluirProgramacaoProducaoEquipamentoServiceDefinition.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_WSDL_LOCATION = url;
        EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_EXCEPTION = e;
    }

    public ExcluirProgramacaoProducaoEquipamentoService() {
        super(__getWsdlLocation(), EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_QNAME);
    }

    public ExcluirProgramacaoProducaoEquipamentoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_QNAME, features);
    }

    public ExcluirProgramacaoProducaoEquipamentoService(URL wsdlLocation) {
        super(wsdlLocation, EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_QNAME);
    }

    public ExcluirProgramacaoProducaoEquipamentoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_QNAME, features);
    }

    public ExcluirProgramacaoProducaoEquipamentoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExcluirProgramacaoProducaoEquipamentoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExcluirProgramacaoProducaoEquipamento
     */
    @WebEndpoint(name = "excluirProgramacaoProducaoEquipamentoSoap11")
    public ExcluirProgramacaoProducaoEquipamento getExcluirProgramacaoProducaoEquipamentoSoap11() {
        return super.getPort(new QName("programacao.ws.oee.tc.feevale.br", "excluirProgramacaoProducaoEquipamentoSoap11"), ExcluirProgramacaoProducaoEquipamento.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExcluirProgramacaoProducaoEquipamento
     */
    @WebEndpoint(name = "excluirProgramacaoProducaoEquipamentoSoap11")
    public ExcluirProgramacaoProducaoEquipamento getExcluirProgramacaoProducaoEquipamentoSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("programacao.ws.oee.tc.feevale.br", "excluirProgramacaoProducaoEquipamentoSoap11"), ExcluirProgramacaoProducaoEquipamento.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_EXCEPTION!= null) {
            throw EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_EXCEPTION;
        }
        return EXCLUIRPROGRAMACAOPRODUCAOEQUIPAMENTOSERVICE_WSDL_LOCATION;
    }

}