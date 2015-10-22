
package br.feevale.tc.oee.ws.indice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.feevale.tc.oee.ws.indice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Erros_QNAME = new QName("indice.ws.oee.tc.feevale.br", "erros");
    private final static QName _CodigoEquipamento_QNAME = new QName("indice.ws.oee.tc.feevale.br", "codigoEquipamento");
    private final static QName _Desempenho_QNAME = new QName("indice.ws.oee.tc.feevale.br", "desempenho");
    private final static QName _Disponibilidade_QNAME = new QName("indice.ws.oee.tc.feevale.br", "disponibilidade");
    private final static QName _PeriodoMinutos_QNAME = new QName("indice.ws.oee.tc.feevale.br", "periodoMinutos");
    private final static QName _Qualidade_QNAME = new QName("indice.ws.oee.tc.feevale.br", "qualidade");
    private final static QName _Oee_QNAME = new QName("indice.ws.oee.tc.feevale.br", "oee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.feevale.tc.oee.ws.indice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIndiceOEETempoRealResponse }
     * 
     */
    public GetIndiceOEETempoRealResponse createGetIndiceOEETempoRealResponse() {
        return new GetIndiceOEETempoRealResponse();
    }

    /**
     * Create an instance of {@link GetIndiceOEETempoRealRequest }
     * 
     */
    public GetIndiceOEETempoRealRequest createGetIndiceOEETempoRealRequest() {
        return new GetIndiceOEETempoRealRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "indice.ws.oee.tc.feevale.br", name = "erros")
    public JAXBElement<String> createErros(String value) {
        return new JAXBElement<String>(_Erros_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "indice.ws.oee.tc.feevale.br", name = "codigoEquipamento")
    public JAXBElement<Integer> createCodigoEquipamento(Integer value) {
        return new JAXBElement<Integer>(_CodigoEquipamento_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "indice.ws.oee.tc.feevale.br", name = "desempenho")
    public JAXBElement<Double> createDesempenho(Double value) {
        return new JAXBElement<Double>(_Desempenho_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "indice.ws.oee.tc.feevale.br", name = "disponibilidade")
    public JAXBElement<Double> createDisponibilidade(Double value) {
        return new JAXBElement<Double>(_Disponibilidade_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "indice.ws.oee.tc.feevale.br", name = "periodoMinutos")
    public JAXBElement<Integer> createPeriodoMinutos(Integer value) {
        return new JAXBElement<Integer>(_PeriodoMinutos_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "indice.ws.oee.tc.feevale.br", name = "qualidade")
    public JAXBElement<Double> createQualidade(Double value) {
        return new JAXBElement<Double>(_Qualidade_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "indice.ws.oee.tc.feevale.br", name = "oee")
    public JAXBElement<Double> createOee(Double value) {
        return new JAXBElement<Double>(_Oee_QNAME, Double.class, null, value);
    }

}
