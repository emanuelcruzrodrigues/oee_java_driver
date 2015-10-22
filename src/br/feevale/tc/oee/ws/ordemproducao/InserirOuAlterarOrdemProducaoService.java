
package br.feevale.tc.oee.ws.ordemproducao;

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
@WebServiceClient(name = "inserirOuAlterarOrdemProducaoService", targetNamespace = "ordemProducao.ws.oee.tc.feevale.br", wsdlLocation = "http://localhost:8080/oee/ws/inserirOuAlterarOrdemProducaoServiceDefinition.wsdl")
public class InserirOuAlterarOrdemProducaoService
    extends Service
{

    private final static URL INSERIROUALTERARORDEMPRODUCAOSERVICE_WSDL_LOCATION;
    private final static WebServiceException INSERIROUALTERARORDEMPRODUCAOSERVICE_EXCEPTION;
    private final static QName INSERIROUALTERARORDEMPRODUCAOSERVICE_QNAME = new QName("ordemProducao.ws.oee.tc.feevale.br", "inserirOuAlterarOrdemProducaoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/oee/ws/inserirOuAlterarOrdemProducaoServiceDefinition.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSERIROUALTERARORDEMPRODUCAOSERVICE_WSDL_LOCATION = url;
        INSERIROUALTERARORDEMPRODUCAOSERVICE_EXCEPTION = e;
    }

    public InserirOuAlterarOrdemProducaoService() {
        super(__getWsdlLocation(), INSERIROUALTERARORDEMPRODUCAOSERVICE_QNAME);
    }

    public InserirOuAlterarOrdemProducaoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSERIROUALTERARORDEMPRODUCAOSERVICE_QNAME, features);
    }

    public InserirOuAlterarOrdemProducaoService(URL wsdlLocation) {
        super(wsdlLocation, INSERIROUALTERARORDEMPRODUCAOSERVICE_QNAME);
    }

    public InserirOuAlterarOrdemProducaoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSERIROUALTERARORDEMPRODUCAOSERVICE_QNAME, features);
    }

    public InserirOuAlterarOrdemProducaoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InserirOuAlterarOrdemProducaoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InserirOuAlterarOrdemProducao
     */
    @WebEndpoint(name = "inserirOuAlterarOrdemProducaoSoap11")
    public InserirOuAlterarOrdemProducao getInserirOuAlterarOrdemProducaoSoap11() {
        return super.getPort(new QName("ordemProducao.ws.oee.tc.feevale.br", "inserirOuAlterarOrdemProducaoSoap11"), InserirOuAlterarOrdemProducao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InserirOuAlterarOrdemProducao
     */
    @WebEndpoint(name = "inserirOuAlterarOrdemProducaoSoap11")
    public InserirOuAlterarOrdemProducao getInserirOuAlterarOrdemProducaoSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("ordemProducao.ws.oee.tc.feevale.br", "inserirOuAlterarOrdemProducaoSoap11"), InserirOuAlterarOrdemProducao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSERIROUALTERARORDEMPRODUCAOSERVICE_EXCEPTION!= null) {
            throw INSERIROUALTERARORDEMPRODUCAOSERVICE_EXCEPTION;
        }
        return INSERIROUALTERARORDEMPRODUCAOSERVICE_WSDL_LOCATION;
    }

}
