//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 10:37:45 AM CST 
//


package jet.demo.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jet.demo.model package. 
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

    private final static QName _MyTaskConfig_QNAME = new QName("http://www.example.org/patternConfig", "myTaskConfig");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jet.demo.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyTaskConfig }
     * 
     */
    public MyTaskConfig createMyTaskConfig() {
        return new MyTaskConfig();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyTaskConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/patternConfig", name = "myTaskConfig")
    public JAXBElement<MyTaskConfig> createMyTaskConfig(MyTaskConfig value) {
        return new JAXBElement<MyTaskConfig>(_MyTaskConfig_QNAME, MyTaskConfig.class, null, value);
    }

}