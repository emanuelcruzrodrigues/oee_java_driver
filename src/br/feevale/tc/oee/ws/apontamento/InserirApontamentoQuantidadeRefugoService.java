
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
@WebServiceClient(name = "inserirApontamentoQuantidadeRefugoService", targetNamespace = "apontamento.ws.oee.tc.feevale.br", wsdlLocation = "http://localhost:8080/oee/ws/inserirApontamentoQuantidadeRefugoServiceDefinition.wsdl")
public class InserirApontamentoQuantidadeRefugoService
    extends Service
{

    private final static URL INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_WSDL_LOCATION;
    private final static WebServiceException INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_EXCEPTION;
    private final static QName INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_QNAME = new QName("apontamento.ws.oee.tc.feevale.br", "inserirApontamentoQuantidadeRefugoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/oee/ws/inserirApontamentoQuantidadeRefugoServiceDefinition.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_WSDL_LOCATION = url;
        INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_EXCEPTION = e;
    }

    public InserirApontamentoQuantidadeRefugoService() {
        super(__getWsdlLocation(), INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_QNAME);
    }

    public InserirApontamentoQuantidadeRefugoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_QNAME, features);
    }

    public InserirApontamentoQuantidadeRefugoService(URL wsdlLocation) {
        super(wsdlLocation, INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_QNAME);
    }

    public InserirApontamentoQuantidadeRefugoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_QNAME, features);
    }

    public InserirApontamentoQuantidadeRefugoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InserirApontamentoQuantidadeRefugoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InserirApontamentoQuantidadeRefugo
     */
    @WebEndpoint(name = "inserirApontamentoQuantidadeRefugoSoap11")
    public InserirApontamentoQuantidadeRefugo getInserirApontamentoQuantidadeRefugoSoap11() {
        return super.getPort(new QName("apontamento.ws.oee.tc.feevale.br", "inserirApontamentoQuantidadeRefugoSoap11"), InserirApontamentoQuantidadeRefugo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InserirApontamentoQuantidadeRefugo
     */
    @WebEndpoint(name = "inserirApontamentoQuantidadeRefugoSoap11")
    public InserirApontamentoQuantidadeRefugo getInserirApontamentoQuantidadeRefugoSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("apontamento.ws.oee.tc.feevale.br", "inserirApontamentoQuantidadeRefugoSoap11"), InserirApontamentoQuantidadeRefugo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_EXCEPTION!= null) {
            throw INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_EXCEPTION;
        }
        return INSERIRAPONTAMENTOQUANTIDADEREFUGOSERVICE_WSDL_LOCATION;
    }

}
