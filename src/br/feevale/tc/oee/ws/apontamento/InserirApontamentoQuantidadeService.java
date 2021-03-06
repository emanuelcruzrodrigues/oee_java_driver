
package br.feevale.tc.oee.ws.apontamento;

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
@WebServiceClient(name = "inserirApontamentoQuantidadeService", targetNamespace = "apontamento.ws.oee.tc.feevale.br", wsdlLocation = "http://localhost:8080/oee/ws/inserirApontamentoQuantidadeServiceDefinition.wsdl")
public class InserirApontamentoQuantidadeService
    extends Service
{

    private final static URL INSERIRAPONTAMENTOQUANTIDADESERVICE_WSDL_LOCATION;
    private final static WebServiceException INSERIRAPONTAMENTOQUANTIDADESERVICE_EXCEPTION;
    private final static QName INSERIRAPONTAMENTOQUANTIDADESERVICE_QNAME = new QName("apontamento.ws.oee.tc.feevale.br", "inserirApontamentoQuantidadeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/oee/ws/inserirApontamentoQuantidadeServiceDefinition.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSERIRAPONTAMENTOQUANTIDADESERVICE_WSDL_LOCATION = url;
        INSERIRAPONTAMENTOQUANTIDADESERVICE_EXCEPTION = e;
    }

    public InserirApontamentoQuantidadeService() {
        super(__getWsdlLocation(), INSERIRAPONTAMENTOQUANTIDADESERVICE_QNAME);
    }

    public InserirApontamentoQuantidadeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSERIRAPONTAMENTOQUANTIDADESERVICE_QNAME, features);
    }

    public InserirApontamentoQuantidadeService(URL wsdlLocation) {
        super(wsdlLocation, INSERIRAPONTAMENTOQUANTIDADESERVICE_QNAME);
    }

    public InserirApontamentoQuantidadeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSERIRAPONTAMENTOQUANTIDADESERVICE_QNAME, features);
    }

    public InserirApontamentoQuantidadeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InserirApontamentoQuantidadeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InserirApontamentoQuantidade
     */
    @WebEndpoint(name = "inserirApontamentoQuantidadeSoap11")
    public InserirApontamentoQuantidade getInserirApontamentoQuantidadeSoap11() {
        return super.getPort(new QName("apontamento.ws.oee.tc.feevale.br", "inserirApontamentoQuantidadeSoap11"), InserirApontamentoQuantidade.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InserirApontamentoQuantidade
     */
    @WebEndpoint(name = "inserirApontamentoQuantidadeSoap11")
    public InserirApontamentoQuantidade getInserirApontamentoQuantidadeSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("apontamento.ws.oee.tc.feevale.br", "inserirApontamentoQuantidadeSoap11"), InserirApontamentoQuantidade.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSERIRAPONTAMENTOQUANTIDADESERVICE_EXCEPTION!= null) {
            throw INSERIRAPONTAMENTOQUANTIDADESERVICE_EXCEPTION;
        }
        return INSERIRAPONTAMENTOQUANTIDADESERVICE_WSDL_LOCATION;
    }

}
