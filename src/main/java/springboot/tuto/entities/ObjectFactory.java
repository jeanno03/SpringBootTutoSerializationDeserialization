//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.06 at 04:13:23 PM CET 
//


package springboot.tuto.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the springboot.tuto.entities package. 
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

    private final static QName _RecordsMetadataFieldDefinitionsFieldDefinition_QNAME = new QName("", "FieldDefinition");
    private final static QName _RecordsMetadataFieldDefinitions_QNAME = new QName("", "FieldDefinitions");
    private final static QName _RecordsLevelCounts_QNAME = new QName("", "LevelCounts");
    private final static QName _RecordsMetadata_QNAME = new QName("", "Metadata");
    private final static QName _RecordsRecord_QNAME = new QName("", "Record");
    private final static QName _RecordsRecordField_QNAME = new QName("", "Field");
    private final static QName _RecordsLevelCountsLevelCount_QNAME = new QName("", "LevelCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: springboot.tuto.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Records }
     * 
     */
    public Records createRecords() {
        return new Records();
    }

    /**
     * Create an instance of {@link Records.Record }
     * 
     */
    public Records.Record createRecordsRecord() {
        return new Records.Record();
    }

    /**
     * Create an instance of {@link Records.LevelCounts }
     * 
     */
    public Records.LevelCounts createRecordsLevelCounts() {
        return new Records.LevelCounts();
    }

    /**
     * Create an instance of {@link Records.Metadata }
     * 
     */
    public Records.Metadata createRecordsMetadata() {
        return new Records.Metadata();
    }

    /**
     * Create an instance of {@link Records.Metadata.FieldDefinitions }
     * 
     */
    public Records.Metadata.FieldDefinitions createRecordsMetadataFieldDefinitions() {
        return new Records.Metadata.FieldDefinitions();
    }

    /**
     * Create an instance of {@link Records.Record.Field }
     * 
     */
    public Records.Record.Field createRecordsRecordField() {
        return new Records.Record.Field();
    }

    /**
     * Create an instance of {@link Records.LevelCounts.LevelCount }
     * 
     */
    public Records.LevelCounts.LevelCount createRecordsLevelCountsLevelCount() {
        return new Records.LevelCounts.LevelCount();
    }

    /**
     * Create an instance of {@link Records.Metadata.FieldDefinitions.FieldDefinition }
     * 
     */
    public Records.Metadata.FieldDefinitions.FieldDefinition createRecordsMetadataFieldDefinitionsFieldDefinition() {
        return new Records.Metadata.FieldDefinitions.FieldDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records.Metadata.FieldDefinitions.FieldDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FieldDefinition", scope = Records.Metadata.FieldDefinitions.class)
    public JAXBElement<Records.Metadata.FieldDefinitions.FieldDefinition> createRecordsMetadataFieldDefinitionsFieldDefinition(Records.Metadata.FieldDefinitions.FieldDefinition value) {
        return new JAXBElement<Records.Metadata.FieldDefinitions.FieldDefinition>(_RecordsMetadataFieldDefinitionsFieldDefinition_QNAME, Records.Metadata.FieldDefinitions.FieldDefinition.class, Records.Metadata.FieldDefinitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records.Metadata.FieldDefinitions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FieldDefinitions", scope = Records.Metadata.class)
    public JAXBElement<Records.Metadata.FieldDefinitions> createRecordsMetadataFieldDefinitions(Records.Metadata.FieldDefinitions value) {
        return new JAXBElement<Records.Metadata.FieldDefinitions>(_RecordsMetadataFieldDefinitions_QNAME, Records.Metadata.FieldDefinitions.class, Records.Metadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records.LevelCounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LevelCounts", scope = Records.class)
    public JAXBElement<Records.LevelCounts> createRecordsLevelCounts(Records.LevelCounts value) {
        return new JAXBElement<Records.LevelCounts>(_RecordsLevelCounts_QNAME, Records.LevelCounts.class, Records.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records.Metadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Metadata", scope = Records.class)
    public JAXBElement<Records.Metadata> createRecordsMetadata(Records.Metadata value) {
        return new JAXBElement<Records.Metadata>(_RecordsMetadata_QNAME, Records.Metadata.class, Records.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records.Record }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Record", scope = Records.class)
    public JAXBElement<Records.Record> createRecordsRecord(Records.Record value) {
        return new JAXBElement<Records.Record>(_RecordsRecord_QNAME, Records.Record.class, Records.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records.Record.Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Field", scope = Records.Record.class)
    public JAXBElement<Records.Record.Field> createRecordsRecordField(Records.Record.Field value) {
        return new JAXBElement<Records.Record.Field>(_RecordsRecordField_QNAME, Records.Record.Field.class, Records.Record.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records.LevelCounts.LevelCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LevelCount", scope = Records.LevelCounts.class)
    public JAXBElement<Records.LevelCounts.LevelCount> createRecordsLevelCountsLevelCount(Records.LevelCounts.LevelCount value) {
        return new JAXBElement<Records.LevelCounts.LevelCount>(_RecordsLevelCountsLevelCount_QNAME, Records.LevelCounts.LevelCount.class, Records.LevelCounts.class, value);
    }

}